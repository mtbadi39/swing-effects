/*
 * Copyright (c) 2005-2018 Substance Kirill Grouchnikov. All Rights Reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  o Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *
 *  o Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 *  o Neither the name of Substance Kirill Grouchnikov nor the names of
 *    its contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS;
 * OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.pushingpixels.substance.internal.utils;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dialog;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Transparency;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.swing.AbstractButton;
import javax.swing.ButtonModel;
import javax.swing.Icon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;
import javax.swing.JRootPane;
import javax.swing.JScrollBar;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.JTree;
import javax.swing.MenuElement;
import javax.swing.MenuSelectionManager;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.plaf.ButtonUI;
import javax.swing.plaf.UIResource;
import javax.swing.text.JTextComponent;

import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceLookAndFeel;
import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.SubstanceSlices;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.SubstanceSlices.FocusKind;
import org.pushingpixels.substance.api.SubstanceSlices.MenuGutterFillKind;
import org.pushingpixels.substance.api.SubstanceSlices.Side;
import org.pushingpixels.substance.api.SubstanceSlices.TabContentPaneBorderKind;
import org.pushingpixels.substance.api.UiThreadingViolationException;
import org.pushingpixels.substance.api.colorscheme.BottleGreenColorScheme;
import org.pushingpixels.substance.api.colorscheme.LightAquaColorScheme;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.colorscheme.SunfireRedColorScheme;
import org.pushingpixels.substance.api.colorscheme.SunsetColorScheme;
import org.pushingpixels.substance.api.combo.ComboPopupPrototypeCallback;
import org.pushingpixels.substance.api.icon.IsHiDpiAware;
import org.pushingpixels.substance.api.icon.SubstanceIconUIResource;
import org.pushingpixels.substance.api.painter.border.SubstanceBorderPainter;
import org.pushingpixels.substance.api.painter.decoration.SubstanceDecorationPainter;
import org.pushingpixels.substance.api.painter.fill.SubstanceFillPainter;
import org.pushingpixels.substance.api.shaper.SubstanceButtonShaper;
import org.pushingpixels.substance.api.tabbed.TabCloseCallback;
import org.pushingpixels.substance.internal.SubstanceSynapse;
import org.pushingpixels.substance.internal.animation.TransitionAwareUI;
import org.pushingpixels.substance.internal.contrib.intellij.JBHiDPIScaledImage;
import org.pushingpixels.substance.internal.contrib.intellij.UIUtil;
import org.pushingpixels.substance.internal.contrib.jgoodies.looks.LookUtils;
import org.pushingpixels.substance.internal.fonts.DefaultKDEFontPolicy;
import org.pushingpixels.substance.internal.ui.SubstanceButtonUI;
import org.pushingpixels.substance.internal.ui.SubstanceRootPaneUI;
import org.pushingpixels.substance.internal.utils.combo.SubstanceComboPopup;
import org.pushingpixels.substance.internal.utils.icon.ArrowButtonTransitionAwareIcon;
import org.pushingpixels.substance.internal.utils.icon.TransitionAware;
import org.pushingpixels.substance.internal.utils.icon.TransitionAwareIcon;
import org.pushingpixels.substance.internal.utils.menu.SubstanceMenu;
import org.pushingpixels.substance.internal.utils.scroll.SubstanceScrollButton;
import org.pushingpixels.trident.swing.SwingRepaintCallback;

/**
 * Various utility functions. This class is <b>for internal use only</b>.
 * 
 * @author Kirill Grouchnikov
 * @author Romain Guy
 */
public class SubstanceCoreUtilities {
    /**
     * Client property name for marking components covered by lightweight popups. This is tracking
     * the fix for issue 297. The client property value should be an instance of {@link Boolean}.
     */
    public static final String IS_COVERED_BY_LIGHTWEIGHT_POPUPS = "substancelaf.internal.paint.isCoveredByLightweightPopups";

    public static final String TEXT_COMPONENT_AWARE = "substancelaf.internal.textComponentAware";

    public static enum Platform {
        MACOS, GNOME, KDE, WINDOWS, DEFAULT
    }

    public static interface TextComponentAware<T> {
        public JTextComponent getTextComponent(T t);
    }

    private static Platform platform;

    /**
     * Private constructor. Is here to enforce using static methods only.
     */
    private SubstanceCoreUtilities() {
    }

    /**
     * Clips string based on specified font metrics and available width (in pixels). Returns the
     * clipped string, which contains the beginning and the end of the input string separated by
     * ellipses (...) in case the string is too long to fit into the specified width, and the
     * original string otherwise.
     * 
     * @param metrics
     *            Font metrics.
     * @param availableWidth
     *            Available width in pixels.
     * @param fullText
     *            String to clip.
     * @return The clipped string, which contains the beginning and the end of the input string
     *         separated by ellipses (...) in case the string is too long to fit into the specified
     *         width, and the original string otherwise.
     */
    public static String clipString(FontMetrics metrics, int availableWidth, String fullText) {

        if (metrics.stringWidth(fullText) <= availableWidth)
            return fullText;

        String ellipses = "...";
        int ellipsesWidth = metrics.stringWidth(ellipses);
        if (ellipsesWidth > availableWidth)
            return "";

        String starter = "";
        String ender = "";

        int w = fullText.length();
        int w2 = (w / 2) + (w % 2);
        String prevTitle = "";
        for (int i = 0; i < w2; i++) {
            String newStarter = starter + fullText.charAt(i);
            String newEnder = ender;
            if ((w - i) > w2)
                newEnder = fullText.charAt(w - i - 1) + newEnder;
            String newTitle = newStarter + ellipses + newEnder;
            if (metrics.stringWidth(newTitle) <= availableWidth) {
                starter = newStarter;
                ender = newEnder;
                prevTitle = newTitle;
                continue;
            }
            return prevTitle;
        }
        return fullText;
    }

    /**
     * Checks whether the specified button has associated icon.
     * 
     * @param button
     *            Button.
     * @return If the button has associated icon, <code>true</code> is returned, otherwise
     *         <code>false</code>.
     */
    public static boolean hasIcon(AbstractButton button) {
        return (button.getIcon() != null);
    }

    /**
     * Checks whether the specified button has associated text.
     * 
     * @param button
     *            Button.
     * @return If the button has associated text, <code>true</code> is returned, otherwise
     *         <code>false</code>.
     */
    public static boolean hasText(AbstractButton button) {
        String text = button.getText();
        if ((text != null) && (text.length() > 0)) {
            return true;
        }
        return false;
    }

    /**
     * Checks and answers if the specified button is in a combo box.
     * 
     * @param button
     *            the button to check
     * @return <code>true</code> if in combo box, <code>false</code> otherwise
     */
    public static boolean isComboBoxButton(AbstractButton button) {
        return SwingUtilities.getAncestorOfClass(JComboBox.class, button) != null;
    }

    /**
     * Checks and answers if the specified button is in a scroll bar.
     * 
     * @param button
     *            the button to check
     * @return <code>true</code> if in scroll bar, <code>false</code> otherwise
     */
    public static boolean isScrollBarButton(AbstractButton button) {
        return SwingUtilities.getAncestorOfClass(JScrollBar.class, button) != null;
    }

    /**
     * Checks and answers if the specified button is in a spinner.
     * 
     * @param button
     *            the button to check
     * @return <code>true</code> if in spinner, <code>false</code> otherwise
     */
    public static boolean isSpinnerButton(AbstractButton button) {
        if (!(button instanceof SubstanceSpinnerButton))
            return false;
        return SwingUtilities.getAncestorOfClass(JSpinner.class, button) != null;
    }

    /**
     * Checks and answers if the specified button is in a toolbar.
     * 
     * @param component
     *            the button to check
     * @return <code>true</code> if in toolbar, <code>false</code> otherwise
     */
    public static boolean isToolBarButton(JComponent component) {
        if (component.getClass().isAnnotationPresent(SubstanceInternalButton.class)) {
            return false;
        }
        return SwingUtilities.getAncestorOfClass(JToolBar.class, component) != null;
    }

    /**
     * Checks answers if the specified component is a button in a scroll control, such as scroll bar
     * or tabbed pane (as tab scroller).
     * 
     * @param comp
     *            The component to check
     * @return <code>true</code> if the specified component is a button in a scroll control,
     *         <code>false</code> otherwise
     */
    public static boolean isScrollButton(JComponent comp) {
        return (comp instanceof SubstanceScrollButton);
    }

    /**
     * Checks whether the specified button never paints its background.
     * 
     * @param button
     *            Button.
     * @return <code>true</code> if the specified button never paints its background,
     *         <code>false</code> otherwise.
     * @see SubstanceLookAndFeel#BUTTON_NEVER_PAINT_BACKGROUND
     */
    public static boolean isButtonNeverPainted(JComponent button) {
        // small optimizations for checkboxes and radio buttons
        if (button instanceof JCheckBox)
            return false;
        if (button instanceof JRadioButton)
            return false;

        Object prop = button.getClientProperty(SubstanceSynapse.BUTTON_NEVER_PAINT_BACKGROUND);
        if (prop != null) {
            if (Boolean.TRUE.equals(prop))
                return true;
            if (Boolean.FALSE.equals(prop))
                return false;
        }

        if (button != null) {
            Container parent = button.getParent();
            if (parent instanceof JComponent) {
                JComponent jparent = (JComponent) parent;
                Object flatProperty = jparent
                        .getClientProperty(SubstanceSynapse.BUTTON_NEVER_PAINT_BACKGROUND);
                if (flatProperty != null) {
                    if (Boolean.TRUE.equals(flatProperty))
                        return true;
                    if (Boolean.FALSE.equals(flatProperty))
                        return false;
                }
            }
        }

        return Boolean.TRUE.equals(UIManager.get(SubstanceSynapse.BUTTON_NEVER_PAINT_BACKGROUND));
    }

    /**
     * Returns the focus ring kind of the specified component.
     * 
     * @param component
     *            Component.
     * @return The focus ring kind of the specified component.
     */
    public static FocusKind getFocusKind(Component component) {
        while (component != null) {
            if (component instanceof JComponent) {
                JComponent jcomp = (JComponent) component;
                Object jcompFocusKind = jcomp.getClientProperty(SubstanceSynapse.FOCUS_KIND);
                if (jcompFocusKind instanceof FocusKind)
                    return (FocusKind) jcompFocusKind;
            }
            component = component.getParent();
        }
        Object globalFocusKind = UIManager.get(SubstanceSynapse.FOCUS_KIND);
        if (globalFocusKind instanceof FocusKind)
            return (FocusKind) globalFocusKind;
        return FocusKind.ALL_INNER;
    }

    /**
     * Returns indication whether the watermark should be drawn on the specified component.
     * 
     * @param component
     *            Component.
     * @return <code>true</code> if the watermark should be drawn on the specified component,
     *         <code>false</code> otherwise.
     * @see SubstanceLookAndFeel#WATERMARK_VISIBLE
     */
    public static boolean toDrawWatermark(Component component) {
        Component c = component;
        while (c != null) {
            if (c instanceof JComponent) {
                JComponent jcomp = (JComponent) component;
                Object obj = jcomp.getClientProperty(SubstanceSynapse.WATERMARK_VISIBLE);
                if (obj != null) {
                    if (Boolean.TRUE.equals(obj))
                        return true;
                    if (Boolean.FALSE.equals(obj))
                        return false;
                }
            }
            c = c.getParent();
        }
        Object obj = UIManager.get(SubstanceSynapse.WATERMARK_VISIBLE);
        if (Boolean.TRUE.equals(obj))
            return true;
        if (Boolean.FALSE.equals(obj))
            return false;

        // special cases - lists, tables and trees that show watermarks only
        // when the WATERMARK_VISIBLE is set to Boolean.TRUE
        if (component instanceof JList)
            return false;
        if (component instanceof JTree)
            return false;
        if (component instanceof JTable)
            return false;
        if (component instanceof JTextComponent)
            return false;

        return true;
    }

    /**
     * Returns the button shaper of the specified button.
     * 
     * @param comp
     *            The button.
     * @return The button shaper of the specified button.
     * @see SubstanceLookAndFeel#BUTTON_SHAPER
     * @see SubstanceSkin#getButtonShaper()
     */
    public static SubstanceButtonShaper getButtonShaper(Component comp) {
        if (comp instanceof JComponent) {
            Object prop = ((JComponent) comp).getClientProperty(SubstanceSynapse.BUTTON_SHAPER);
            if (prop instanceof SubstanceButtonShaper)
                return (SubstanceButtonShaper) prop;
        }
        SubstanceSkin skin = SubstanceCoreUtilities.getSkin(comp);
        if (skin == null)
            return null;
        return skin.getButtonShaper();
    }

    /**
     * Returns the fill painter of the specified component.
     * 
     * @param comp
     *            Component.
     * @return The fill painter of the specified component.
     * @see SubstanceSkin#getFillPainter()
     */
    public static SubstanceFillPainter getFillPainter(Component comp) {
        return SubstanceCoreUtilities.getSkin(comp).getFillPainter();
    }

    /**
     * Retrieves the <code>modified</code> state for the specified component in a tabbed pane.
     * 
     * @param tabComponent
     *            The associated tab component.
     * @return <code>true</code> if the specified component in a tabbed pane is marked as modified,
     *         <code>false</code> otherwise.
     * @see SubstanceLookAndFeel#CONTENTS_MODIFIED
     */
    public static boolean isTabModified(Component tabComponent) {
        if (tabComponent instanceof JComponent) {
            JComponent jc = (JComponent) tabComponent;
            return Boolean.TRUE.equals(jc.getClientProperty(SubstanceSynapse.CONTENTS_MODIFIED));
        }
        return false;
    }

    /**
     * Retrieves the <code>modified</code> state for the specified root pane.
     * 
     * @param rootPane
     *            The root pane.
     * @return <code>true</code> if the specified root pane is marked as modified,
     *         <code>false</code> otherwise.
     * @see SubstanceLookAndFeel#CONTENTS_MODIFIED
     */
    public static boolean isRootPaneModified(JRootPane rootPane) {
        return Boolean.TRUE.equals(rootPane.getClientProperty(SubstanceSynapse.CONTENTS_MODIFIED));
    }

    /**
     * Checks whether the specified tab has a close button.
     * 
     * @param tabbedPane
     *            Tabbed pane.
     * @param tabIndex
     *            Tab index.
     * @return <code>true</code> if the specified tab has a close button, <code>false</code>
     *         otherwise.
     */
    public static boolean hasCloseButton(JTabbedPane tabbedPane, int tabIndex) {
        int tabCount = tabbedPane.getTabCount();
        if ((tabIndex < 0) || (tabIndex >= tabCount))
            return false;

        // if tab is disabled, it doesn't have a close button
        if (!tabbedPane.isEnabledAt(tabIndex))
            return false;

        // check property on tab component
        Component tabComponent = tabbedPane.getComponentAt(tabIndex);
        if (tabComponent instanceof JComponent) {
            Object compProp = ((JComponent) tabComponent)
                    .getClientProperty(SubstanceSynapse.TABBED_PANE_CLOSE_BUTTONS);
            if (Boolean.TRUE.equals(compProp))
                return true;
            if (Boolean.FALSE.equals(compProp))
                return false;
        }
        // check property on tabbed pane
        Object tabProp = tabbedPane.getClientProperty(SubstanceSynapse.TABBED_PANE_CLOSE_BUTTONS);
        if (Boolean.TRUE.equals(tabProp))
            return true;
        if (Boolean.FALSE.equals(tabProp))
            return false;
        // check property in UIManager
        return UIManager.getBoolean(SubstanceSynapse.TABBED_PANE_CLOSE_BUTTONS);
    }

    /**
     * Returns the size of the close button for a tab in the specified tabbed pane.
     * 
     * @param tabbedPane
     *            Tabbed pane.
     * @param tabIndex
     *            Tab index.
     * @return The size of the close button for a tab in the specified tabbed pane.
     */
    public static int getCloseButtonSize(JTabbedPane tabbedPane, int tabIndex) {
        if (!SubstanceCoreUtilities.hasCloseButton(tabbedPane, tabIndex))
            return 0;
        return SubstanceSizeUtils
                .getTabCloseIconSize(SubstanceSizeUtils.getComponentFontSize(tabbedPane));
    }

    /**
     * Returns the content border kind of the specified tabbed pane.
     * 
     * @param tabbedPane
     *            Tabbed pane.
     * @return Content border kind of the specified tabbed pane.
     * @see SubstanceLookAndFeel#TABBED_PANE_CONTENT_BORDER_KIND
     */
    public static TabContentPaneBorderKind getContentBorderKind(JTabbedPane tabbedPane) {
        // check property on tabbed pane
        Object tabProp = tabbedPane
                .getClientProperty(SubstanceSynapse.TABBED_PANE_CONTENT_BORDER_KIND);
        if (tabProp instanceof TabContentPaneBorderKind)
            return (TabContentPaneBorderKind) tabProp;
        // check property in UIManager
        Object globalProp = UIManager.get(SubstanceSynapse.TABBED_PANE_CONTENT_BORDER_KIND);
        if (globalProp instanceof TabContentPaneBorderKind)
            return (TabContentPaneBorderKind) globalProp;
        return TabContentPaneBorderKind.DOUBLE_PLACEMENT;
    }

    /**
     * Checks whether the specified tab should show modified animation only on its close button.
     * 
     * @param tabbedPane
     *            Tabbed pane.
     * @param tabIndex
     *            Tab index.
     * @return <code>true</code> if the specified tab should show modified animation only on its
     *         close button, <code>false</code> otherwise.
     */
    public static boolean toAnimateCloseIconOfModifiedTab(JTabbedPane tabbedPane, int tabIndex) {
        int tabCount = tabbedPane.getTabCount();
        if ((tabIndex < 0) || (tabIndex >= tabCount))
            return false;

        if (!hasCloseButton(tabbedPane, tabIndex))
            return false;

        // check property on tab component
        Component tabComponent = tabbedPane.getComponentAt(tabIndex);
        if (tabComponent instanceof JComponent) {
            Object compProp = ((JComponent) tabComponent).getClientProperty(
                    SubstanceSynapse.TABBED_PANE_CLOSE_BUTTONS_MODIFIED_ANIMATION);
            if (Boolean.TRUE.equals(compProp))
                return true;
            if (Boolean.FALSE.equals(compProp))
                return false;
        }
        // check property on tabbed pane
        Object tabProp = tabbedPane
                .getClientProperty(SubstanceSynapse.TABBED_PANE_CLOSE_BUTTONS_MODIFIED_ANIMATION);
        if (Boolean.TRUE.equals(tabProp))
            return true;
        if (Boolean.FALSE.equals(tabProp))
            return false;
        // check property in UIManager
        return UIManager.getBoolean(SubstanceSynapse.TABBED_PANE_CLOSE_BUTTONS_MODIFIED_ANIMATION);
    }

    /**
     * Retrieves transparent image of specified dimension.
     * 
     * @param width
     *            Image width.
     * @param height
     *            Image height.
     * @return Transparent image of specified dimension.
     */
    public static BufferedImage getBlankImage(int width, int height) {
        if (MemoryAnalyzer.isRunning()) {
            // see if the request is unusual
            if ((width >= 100) || (height >= 100)) {
                StackTraceElement[] stack = Thread.currentThread().getStackTrace();
                StringBuffer sb = new StringBuffer();
                int count = 0;
                for (StackTraceElement stackEntry : stack) {
                    if (count++ > 8)
                        break;
                    sb.append(stackEntry.getClassName() + ".");
                    sb.append(stackEntry.getMethodName() + " [");
                    sb.append(stackEntry.getLineNumber() + "]");
                    sb.append("\n");
                }
                MemoryAnalyzer.enqueueUsage("Blank " + width + "*" + height + "\n" + sb.toString());
            }
        }

        if (UIUtil.getScaleFactor() > 1.0) {
            return new JBHiDPIScaledImage(width, height, BufferedImage.TYPE_INT_ARGB);
        } else {
            GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
            GraphicsDevice d = e.getDefaultScreenDevice();
            GraphicsConfiguration c = d.getDefaultConfiguration();
            return c.createCompatibleImage(width, height, Transparency.TRANSLUCENT);
        }
    }

    /**
     * Retrieves transparent image of specified dimension.
     * 
     * @param width
     *            Image width.
     * @param height
     *            Image height.
     * @return Transparent image of specified dimension.
     */
    public static BufferedImage getBlankUnscaledImage(int width, int height) {
        if (MemoryAnalyzer.isRunning()) {
            // see if the request is unusual
            if ((width >= 100) || (height >= 100)) {
                StackTraceElement[] stack = Thread.currentThread().getStackTrace();
                StringBuffer sb = new StringBuffer();
                int count = 0;
                for (StackTraceElement stackEntry : stack) {
                    if (count++ > 8)
                        break;
                    sb.append(stackEntry.getClassName() + ".");
                    sb.append(stackEntry.getMethodName() + " [");
                    sb.append(stackEntry.getLineNumber() + "]");
                    sb.append("\n");
                }
                MemoryAnalyzer.enqueueUsage("Blank " + width + "*" + height + "\n" + sb.toString());
            }
        }

        if (UIUtil.getScaleFactor() > 1.0) {
            JBHiDPIScaledImage result = new JBHiDPIScaledImage(null, width, height,
                    BufferedImage.TYPE_INT_ARGB);
            result.setIgnoreScaling();
            return result;
        } else {
            GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
            GraphicsDevice d = e.getDefaultScreenDevice();
            GraphicsConfiguration c = d.getDefaultConfiguration();
            return c.createCompatibleImage(width, height, Transparency.TRANSLUCENT);
        }
    }

    /**
     * Retrieves transparent image of specified dimension.
     * 
     * @param width
     *            Image width.
     * @param height
     *            Image height.
     * @return Transparent image of specified dimension.
     */
    public static BufferedImage getBlankUnscaledImage(BufferedImage image) {
        int imageWidth = image.getWidth();
        int imageHeight = image.getHeight();
        if (MemoryAnalyzer.isRunning()) {
            // see if the request is unusual
            if ((imageWidth >= 100) || (imageHeight >= 100)) {
                StackTraceElement[] stack = Thread.currentThread().getStackTrace();
                StringBuffer sb = new StringBuffer();
                int count = 0;
                for (StackTraceElement stackEntry : stack) {
                    if (count++ > 8)
                        break;
                    sb.append(stackEntry.getClassName() + ".");
                    sb.append(stackEntry.getMethodName() + " [");
                    sb.append(stackEntry.getLineNumber() + "]");
                    sb.append("\n");
                }
                MemoryAnalyzer.enqueueUsage(
                        "Blank " + imageWidth + "*" + imageHeight + "\n" + sb.toString());
            }
        }

        if (UIUtil.getScaleFactor() > 1.0) {
            JBHiDPIScaledImage result = new JBHiDPIScaledImage(null, imageWidth, imageHeight,
                    BufferedImage.TYPE_INT_ARGB);
            result.setIgnoreScaling();
            return result;
        } else {
            GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
            GraphicsDevice d = e.getDefaultScreenDevice();
            GraphicsConfiguration c = d.getDefaultConfiguration();
            return c.createCompatibleImage(imageWidth, imageHeight, Transparency.TRANSLUCENT);
        }
    }

    public static boolean isHiDpiAwareImage(Image image) {
        return image instanceof IsHiDpiAware;
    }

    /**
     * Checks whether the specified button should have minimal size.
     * 
     * @param button
     *            Button.
     * @return <code>false</code> if the specified button should have minimal size,
     *         <code>true</code> otherwise.
     * @see SubstanceLookAndFeel#BUTTON_NO_MIN_SIZE
     */
    public static boolean hasNoMinSizeProperty(AbstractButton button) {
        Object noMinSizeProperty = button.getClientProperty(SubstanceSynapse.BUTTON_NO_MIN_SIZE);
        if (Boolean.TRUE.equals(noMinSizeProperty))
            return true;
        if (Boolean.FALSE.equals(noMinSizeProperty))
            return false;
        Container parent = button.getParent();
        if (parent instanceof JComponent) {
            noMinSizeProperty = ((JComponent) parent)
                    .getClientProperty(SubstanceSynapse.BUTTON_NO_MIN_SIZE);
            if (Boolean.TRUE.equals(noMinSizeProperty))
                return true;
            if (Boolean.FALSE.equals(noMinSizeProperty))
                return false;
        }
        return (Boolean.TRUE.equals(UIManager.get(SubstanceSynapse.BUTTON_NO_MIN_SIZE)));
    }

    /**
     * Marks the specified button as <code>flat</code>. A flat button doesn't show its background
     * unless selected, armed, pressed or (possibly) hovered over.
     * 
     * @param button
     *            Button to mark as flat.
     */
    public static void markButtonAsFlat(AbstractButton button) {
        SubstanceCortex.ComponentOrParentScope.setFlatBackground(button, true);
        button.setOpaque(false);
    }

    /**
     * Checks whether the specified component is flat.
     * 
     * @param comp
     *            Component.
     * @param defaultValue
     *            The value to return if there is no {@link SubstanceLookAndFeel#FLAT_LOOK} defined
     *            on button hierarchy or {@link UIManager}.
     * @return <code>false</code> if the specified button is flat, <code>true</code> otherwise.
     * @see SubstanceLookAndFeel#FLAT_LOOK
     */
    public static boolean hasFlatAppearance(Component comp, boolean defaultValue) {
        // small optimizations for checkboxes and radio buttons
        if (comp instanceof JCheckBox)
            return defaultValue;
        if (comp instanceof JRadioButton)
            return defaultValue;
        Component c = comp;
        // while (c != null) {
        if (c instanceof JComponent) {
            JComponent jcomp = (JComponent) c;
            Object flatProperty = jcomp.getClientProperty(SubstanceSynapse.FLAT_LOOK);
            if (flatProperty != null) {
                if (Boolean.TRUE.equals(flatProperty))
                    return true;
                if (Boolean.FALSE.equals(flatProperty))
                    return false;
            }
        }
        if (c != null) {
            Container parent = c.getParent();
            if (parent instanceof JComponent) {
                JComponent jparent = (JComponent) parent;
                Object flatProperty = jparent.getClientProperty(SubstanceSynapse.FLAT_LOOK);
                if (flatProperty != null) {
                    if (Boolean.TRUE.equals(flatProperty))
                        return true;
                    if (Boolean.FALSE.equals(flatProperty))
                        return false;
                }
            }
        }

        Object flatProperty = UIManager.get(SubstanceSynapse.FLAT_LOOK);
        if (flatProperty != null) {
            if (Boolean.TRUE.equals(flatProperty))
                return true;
            if (Boolean.FALSE.equals(flatProperty))
                return false;
        }
        return defaultValue;
    }

    /**
     * Computes whether the specified button has flat appearance.
     * 
     * @param button
     *            Button.
     * @return <code>true</code> if the button has flat appearance, <code>false</code> otherwise.
     */
    public static boolean hasFlatAppearance(AbstractButton button) {
        // small optimizations for checkboxes and radio buttons
        if (button instanceof JCheckBox)
            return false;
        if (button instanceof JRadioButton)
            return false;
        return ((SubstanceCoreUtilities.isToolBarButton(button)
                && SubstanceCoreUtilities.hasFlatAppearance(button, true))
                || SubstanceCoreUtilities.hasFlatAppearance(button, false));
    }

    /**
     * Returns the popup flyout orientation for the specified combobox.
     * 
     * @param combobox
     *            Combobox.
     * @return The popup flyout orientation for the specified combobox.
     * @see SubstanceLookAndFeel#COMBO_BOX_POPUP_FLYOUT_ORIENTATION
     */
    public static int getPopupFlyoutOrientation(JComboBox combobox) {
        Object comboProperty = combobox
                .getClientProperty(SubstanceSynapse.COMBO_BOX_POPUP_FLYOUT_ORIENTATION);
        if (comboProperty instanceof Integer)
            return (Integer) comboProperty;
        Object globalProperty = UIManager.get(SubstanceSynapse.COMBO_BOX_POPUP_FLYOUT_ORIENTATION);
        if (globalProperty instanceof Integer)
            return (Integer) globalProperty;
        return SwingConstants.SOUTH;
    }

    /**
     * Makes the specified component and all its descendants non-opaque.
     * 
     * @param comp
     *            Component.
     * @param opacitySnapshot
     *            The "snapshot" map that will contain the original opacity status of the specified
     *            component and all its descendants.
     */
    public static void makeNonOpaque(Component comp, Map<Component, Boolean> opacitySnapshot) {
        if (comp instanceof JComponent) {
            JComponent jcomp = (JComponent) comp;
            opacitySnapshot.put(comp, jcomp.isOpaque());
            jcomp.setOpaque(false);
        }
        if (comp instanceof Container) {
            Container cont = (Container) comp;
            for (int i = 0; i < cont.getComponentCount(); i++)
                makeNonOpaque(cont.getComponent(i), opacitySnapshot);
        }
    }

    /**
     * Restores the opacity of the specified component and all its descendants.
     * 
     * @param comp
     *            Component.
     * @param opacitySnapshot
     *            The "snapshot" map that contains the original opacity status of the specified
     *            component and all its descendants.
     */
    public static void restoreOpaque(Component comp, Map<Component, Boolean> opacitySnapshot) {
        if (comp instanceof JComponent) {
            JComponent jcomp = (JComponent) comp;
            // fix for defect 159 - snapshot may not contain
            // opacity for table header of a table when it's used
            // inside tree cell renderer (wrapper in a scroll pane).
            if (opacitySnapshot.containsKey(comp))
                jcomp.setOpaque(opacitySnapshot.get(comp));
            else
                jcomp.setOpaque(true);
        }
        if (comp instanceof Container) {
            Container cont = (Container) comp;
            for (int i = 0; i < cont.getComponentCount(); i++)
                restoreOpaque(cont.getComponent(i), opacitySnapshot);
        }
    }

    /**
     * Creates a compatible image (for efficient processing and drawing).
     * 
     * @param image
     *            The original image.
     * @return Compatible version of the original image.
     * @author Romain Guy
     */
    public static BufferedImage createCompatibleImage(BufferedImage image) {
        GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice d = e.getDefaultScreenDevice();
        GraphicsConfiguration c = d.getDefaultConfiguration();
        BufferedImage compatibleImage = c.createCompatibleImage(image.getWidth(), image.getHeight(),
                Transparency.TRANSLUCENT);
        Graphics g = compatibleImage.getGraphics();
        g.drawImage(image, 0, 0, null);
        g.dispose();
        return compatibleImage;
    }

    /**
     * Checks whether the specified component will show scheme-colorized icon in the default state.
     * 
     * @param comp
     *            Component.
     * @return <code>true</code> if the specified component will show scheme-colorized icon in the
     *         default state, <code>false</code> otherwise.
     */
    public static boolean useThemedDefaultIcon(JComponent comp) {
        if ((comp == null) || comp.getClass().isAnnotationPresent(SubstanceInternalButton.class)) {
            return false;
        }
        return Boolean.TRUE.equals(UIManager.get(SubstanceSynapse.USE_THEMED_DEFAULT_ICONS));
    }

    /**
     * Returns the callback to be called upon tab closing (using the tab close button).
     * 
     * @param me
     *            Mouse event.
     * @param tabbedPane
     *            Tabbed pane.
     * @param tabIndex
     *            Tab index.
     * @return Callback to be called upon tab closing (using the tab close button).
     * @see SubstanceLookAndFeel#TABBED_PANE_CLOSE_CALLBACK
     */
    public static TabCloseCallback getTabCloseCallback(MouseEvent me, JTabbedPane tabbedPane,
            int tabIndex) {
        int tabCount = tabbedPane.getTabCount();
        if ((tabIndex < 0) || (tabIndex >= tabCount))
            return null;

        // check property on tab component
        Component tabComponent = tabbedPane.getComponentAt(tabIndex);
        if (tabComponent instanceof JComponent) {
            Object compProp = ((JComponent) tabComponent)
                    .getClientProperty(SubstanceSynapse.TABBED_PANE_CLOSE_CALLBACK);
            if (compProp instanceof TabCloseCallback)
                return (TabCloseCallback) compProp;
        }

        // check property on tabbed pane
        Object tabProp = tabbedPane.getClientProperty(SubstanceSynapse.TABBED_PANE_CLOSE_CALLBACK);
        if (tabProp instanceof TabCloseCallback)
            return (TabCloseCallback) tabProp;

        Object globProp = UIManager.get(SubstanceSynapse.TABBED_PANE_CLOSE_CALLBACK);
        if (globProp instanceof TabCloseCallback)
            return (TabCloseCallback) globProp;

        return null;
    }

    /**
     * Blends two images along Y-axis.
     * 
     * @param imageTop
     *            The left image.
     * @param imageBottom
     *            The right image.
     * @param start
     *            Relative start of the blend area (in 0.0-1.0 range).
     * @param end
     *            Relative end of the blend area (in 0.0-1.0 range).
     * @return Blended image.
     */
    public static BufferedImage blendImagesVertical(BufferedImage imageTop,
            BufferedImage imageBottom, double start, double end) {
        int width = imageTop.getWidth();
        if (width != imageBottom.getWidth())
            throw new IllegalArgumentException("Widths are not the same: " + imageTop.getWidth()
                    + " and " + imageBottom.getWidth());
        int height = imageTop.getHeight();
        if (height != imageBottom.getHeight())
            throw new IllegalArgumentException("Heights are not the same: " + imageTop.getHeight()
                    + " and " + imageBottom.getHeight());

        BufferedImage result = getBlankUnscaledImage(imageTop);
        Graphics2D graphics = (Graphics2D) result.createGraphics();

        int startY = (int) (start * height);
        int endY = (int) (end * height);
        int rampHeight = endY - startY;

        if (rampHeight == 0) {
            graphics.drawImage(imageTop, 0, 0, width, startY, 0, 0, width, startY, null);
            graphics.drawImage(imageBottom, 0, startY, width, height, 0, startY, width, height,
                    null);
        } else {
            BufferedImage rampBottom = getBlankUnscaledImage(width, rampHeight);
            Graphics2D rampBottomG = (Graphics2D) rampBottom.getGraphics();
            rampBottomG.setPaint(new GradientPaint(new Point(0, 0), new Color(0, 0, 0, 255),
                    new Point(0, rampHeight), new Color(0, 0, 0, 0)));
            rampBottomG.fillRect(0, 0, width, rampHeight);

            BufferedImage tempBottom = getBlankUnscaledImage(width, height - startY);
            Graphics2D tempBottomG = (Graphics2D) tempBottom.getGraphics();
            tempBottomG.drawImage(imageBottom, 0, 0, width, height - startY, 0, startY, width,
                    height, null);
            tempBottomG.setComposite(AlphaComposite.DstOut);
            tempBottomG.drawImage(rampBottom, 0, 0, null);

            tempBottomG.setComposite(AlphaComposite.SrcOver);
            graphics.drawImage(imageTop, 0, 0, null);
            graphics.drawImage(tempBottom, 0, startY, null);
        }
        graphics.dispose();
        return result;
    }

    /**
     * Blends two images along X-axis.
     * 
     * @param imageLeft
     *            The left image.
     * @param imageRight
     *            The right image.
     * @param start
     *            Relative start of the blend area (in 0.0-1.0 range).
     * @param end
     *            Relative end of the blend area (in 0.0-1.0 range).
     * @return Blended image.
     */
    public static BufferedImage blendImagesHorizontal(BufferedImage imageLeft,
            BufferedImage imageRight, double start, double end) {
        int width = imageLeft.getWidth();
        if (width != imageRight.getWidth())
            throw new IllegalArgumentException("Widths are not the same: " + imageLeft.getWidth()
                    + " and " + imageRight.getWidth());
        int height = imageLeft.getHeight();
        if (height != imageRight.getHeight())
            throw new IllegalArgumentException("Heights are not the same: " + imageLeft.getHeight()
                    + " and " + imageRight.getHeight());

        BufferedImage result = getBlankUnscaledImage(imageLeft);
        Graphics2D graphics = (Graphics2D) result.createGraphics();

        int startX = (int) (start * width);
        int endX = (int) (end * width);
        int rampWidth = endX - startX;

        if (rampWidth == 0) {
            graphics.drawImage(imageLeft, 0, 0, startX, height, 0, 0, startX, height, null);
            graphics.drawImage(imageRight, startX, 0, width, height, startX, 0, width, height,
                    null);
        } else {
            BufferedImage rampRight = getBlankUnscaledImage(rampWidth, height);
            Graphics2D rampRightG = (Graphics2D) rampRight.getGraphics();
            rampRightG.setPaint(new GradientPaint(new Point(0, 0), new Color(0, 0, 0, 255),
                    new Point(rampWidth, 0), new Color(0, 0, 0, 0)));
            rampRightG.fillRect(0, 0, rampWidth, height);

            BufferedImage tempRight = getBlankUnscaledImage(width - startX, height);
            Graphics2D tempRightG = (Graphics2D) tempRight.getGraphics();
            tempRightG.drawImage(imageRight, 0, 0, width - startX, height, startX, 0, width, height,
                    null);
            tempRightG.setComposite(AlphaComposite.DstOut);
            tempRightG.drawImage(rampRight, 0, 0, null);

            tempRightG.setComposite(AlphaComposite.SrcOver);
            graphics.drawImage(imageLeft, 0, 0, null);
            graphics.drawImage(tempRight, startX, 0, null);
        }
        graphics.dispose();
        return result;
    }

    public static boolean shouldUseThemedIconsOnOptionPanes() {
        Object globalSetting = UIManager.get(SubstanceSynapse.USE_THEMED_ICONS_ON_OPTION_PANES);
        if (globalSetting instanceof Boolean) {
            return (Boolean) globalSetting;
        }

        return true;
    }

    /**
     * Returns the color scheme for the icon of option panes with the specified message type.
     * 
     * @param messageType
     *            Option pane message type.
     * @param mainScheme
     *            Main color scheme.
     * @return Color scheme for the icon of option panes with the specified message type.
     */
    public static SubstanceColorScheme getOptionPaneColorScheme(int messageType,
            SubstanceColorScheme mainScheme) {
        Object globalSetting = UIManager.get(SubstanceSynapse.USE_THEMED_ICONS_ON_OPTION_PANES);
        if (Boolean.FALSE.equals(globalSetting)) {
            return mainScheme;
        }

        switch (messageType) {
            case JOptionPane.INFORMATION_MESSAGE:
                return new BottleGreenColorScheme();
            case JOptionPane.QUESTION_MESSAGE:
                return new LightAquaColorScheme();
            case JOptionPane.WARNING_MESSAGE:
                return new SunsetColorScheme();
            case JOptionPane.ERROR_MESSAGE:
                return new SunfireRedColorScheme();
        }
        return null;
    }

    /**
     * Returns the popup prototype display value for the specified combo box. This value is used to
     * compute the width of the combo popup.
     * 
     * @param combo
     *            Combo box.
     * @return The popup prototype display value for the specified combo box.
     */
    public static Object getComboPopupPrototypeDisplayValue(JComboBox combo) {
        Object callback = combo
                .getClientProperty(SubstanceSynapse.COMBOBOX_POPUP_PROTOTYPE_CALLBACK);
        if (callback == null)
            callback = UIManager.get(SubstanceSynapse.COMBOBOX_POPUP_PROTOTYPE_CALLBACK);
        if (callback instanceof ComboPopupPrototypeCallback) {
            return ((ComboPopupPrototypeCallback) callback).getPopupPrototypeDisplayValue(combo);
        }

        Object displayValue = combo
                .getClientProperty(SubstanceSynapse.COMBOBOX_POPUP_PROTOTYPE_OBJECT);
        if (displayValue == null)
            displayValue = UIManager.get(SubstanceSynapse.COMBOBOX_POPUP_PROTOTYPE_OBJECT);

        // check if this object is in the model ???
        return displayValue;
    }

    /**
     * Returns the set of sides registered on the specified button.
     * 
     * @param component
     *            Button.
     * @param propertyName
     *            Client property name for retrieving the registered sides.
     * @return Set of sides registered on the specified button.
     */
    public static Set<Side> getSides(JComponent component, String propertyName) {
        if (component == null) {
            return null;
        }

        Object prop = component.getClientProperty(propertyName);
        if (prop == null)
            return null;

        if (prop instanceof Set) {
            return (Set<Side>) prop;
        }

        if (prop != null) {
            if (prop instanceof Side) {
                Set<Side> result = EnumSet.noneOf(Side.class);
                result.add((Side) prop);
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the corner radius of the specified toolbar button.
     * 
     * @param button
     *            Toolbar button.
     * @param insets
     *            Button insets.
     * @return Corner radius of the specified toolbar button.
     * @see SubstanceLookAndFeel#TOOLBAR_BUTTON_CORNER_RADIUS
     */
    public static float getToolbarButtonCornerRadius(JComponent button, float insets) {

        JToolBar toolbar = null;
        Component c = button.getParent();
        while (c != null) {
            if (c instanceof JToolBar) {
                toolbar = (JToolBar) c;
                break;
            }
            c = c.getParent();
        }
        if (toolbar == null)
            return 2.0f;

        float width = button.getWidth() - 2 * insets;
        float height = button.getHeight() - 2 * insets;
        float maxRadius = (width > height) ? (height) / 2.0f : (width) / 2.0f;

        Object buttonProp = button.getClientProperty(SubstanceSynapse.TOOLBAR_BUTTON_CORNER_RADIUS);
        if (buttonProp instanceof Float)
            return Math.min(maxRadius, ((Float) buttonProp).floatValue());

        Object toolbarProp = toolbar
                .getClientProperty(SubstanceSynapse.TOOLBAR_BUTTON_CORNER_RADIUS);
        if (toolbarProp instanceof Float)
            return Math.min(maxRadius, ((Float) toolbarProp).floatValue());

        Object globalProp = UIManager.get(SubstanceSynapse.TOOLBAR_BUTTON_CORNER_RADIUS);
        if (globalProp instanceof Float)
            return Math.min(maxRadius, ((Float) globalProp).floatValue());

        return 2.0f;
    }

    /**
     * Returns the number of echo characters per each password character.
     * 
     * @param jpf
     *            Password field.
     * @return The number of echo characters per each password character.
     */
    public static int getEchoPerChar(JPasswordField jpf) {
        Object obj = jpf.getClientProperty(SubstanceSynapse.PASSWORD_ECHO_PER_CHAR);
        if ((obj != null) && (obj instanceof Integer)) {
            int result = (Integer) obj;
            if (result >= 1)
                return result;
        }

        obj = UIManager.get(SubstanceSynapse.PASSWORD_ECHO_PER_CHAR);
        if ((obj != null) && (obj instanceof Integer)) {
            int result = (Integer) obj;
            if (result >= 1)
                return result;
        }
        return 1;
    }

    /**
     * Creates a soft-clipped image. Code taken from
     * <a href= "http://weblogs.java.net/blog/campbell/archive/2006/07/java_2d_tricker.html"
     * >here</a>.
     * 
     * @author Chris Campbell.
     */
    public static BufferedImage softClip(int width, int height, BufferedImage source,
            Shape clipShape) {
        // Create a translucent intermediate image in which we can perform
        // the soft clipping
        BufferedImage img = SubstanceCoreUtilities.getBlankImage(width, height);
        Graphics2D g2 = img.createGraphics();

        // Clear the image so all pixels have zero alpha
        g2.setComposite(AlphaComposite.Clear);
        g2.fillRect(0, 0, width, height);

        // Render our clip shape into the image. Note that we enable
        // antialiasing to achieve the soft clipping effect. Try
        // commenting out the line that enables antialiasing, and
        // you will see that you end up with the usual hard clipping.
        g2.setComposite(AlphaComposite.Src);
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(Color.WHITE);
        g2.fill(clipShape);

        // Here's the trick... We use SrcAtop, which effectively uses the
        // alpha value as a coverage value for each pixel stored in the
        // destination. For the areas outside our clip shape, the destination
        // alpha will be zero, so nothing is rendered in those areas. For
        // the areas inside our clip shape, the destination alpha will be fully
        // opaque, so the full color is rendered. At the edges, the original
        // antialiasing is carried over to give us the desired soft clipping
        // effect.
        g2.setComposite(AlphaComposite.SrcAtop);
        g2.drawImage(source, 0, 0, null);
        g2.dispose();

        return img;
    }

    /**
     * Checks whether the specified component has extra Substance-specific UI elements.
     * 
     * @param component
     *            Component.
     * @return <code>true</code> if the specified component has extra Substance-specific UI
     *         elements, <code>false</code> otherwise.
     * @see SubstanceLookAndFeel#SHOW_EXTRA_WIDGETS
     */
    public static boolean toShowExtraWidgets(Component component) {
        Component c = component;
        while (c != null) {
            if (c instanceof JComponent) {
                JComponent jcomp = (JComponent) c;
                Object componentProp = jcomp.getClientProperty(SubstanceSynapse.SHOW_EXTRA_WIDGETS);
                if (componentProp != null) {
                    if (Boolean.TRUE.equals(componentProp))
                        return false;
                    if (Boolean.FALSE.equals(componentProp))
                        return true;
                }
            }
            c = c.getParent();
        }
        return Boolean.TRUE.equals(UIManager.get(SubstanceSynapse.SHOW_EXTRA_WIDGETS));
    }

    public static SubstanceIconUIResource getThemedIcon(Component comp, Icon orig) {
        SubstanceColorScheme colorScheme = SubstanceColorSchemeUtilities.getColorScheme(comp,
                ComponentState.ENABLED);
        return getThemedIcon(comp, orig, colorScheme);
    }

    public static SubstanceIconUIResource getThemedIcon(JTabbedPane tab, int tabIndex, Icon orig) {
        SubstanceColorScheme colorScheme = SubstanceColorSchemeUtilities.getColorScheme(tab,
                tabIndex, ColorSchemeAssociationKind.TAB, ComponentState.ENABLED);
        return getThemedIcon(tab, orig, colorScheme);
    }

    public static SubstanceIconUIResource getThemedIcon(Component comp, Icon orig,
            SubstanceColorScheme colorScheme) {
        float brightnessFactor = colorScheme.isDark() ? 0.2f : 0.8f;
        return new SubstanceIconUIResource(SubstanceImageCreator.getColorSchemeImage(comp, orig,
                colorScheme, brightnessFactor));
    }

    public static Icon getOriginalIcon(AbstractButton b, Icon defaultIcon) {
        ButtonModel model = b.getModel();
        Icon icon = b.getIcon();
        if (icon == null)
            icon = defaultIcon;

        if (icon.getClass().isAnnotationPresent(TransitionAware.class))
            return icon;

        Icon tmpIcon = null;

        if (icon != null) {
            if (!model.isEnabled()) {
                if (model.isSelected()) {
                    tmpIcon = b.getDisabledSelectedIcon();
                } else {
                    tmpIcon = b.getDisabledIcon();
                }
            } else if (model.isPressed() && model.isArmed()) {
                tmpIcon = b.getPressedIcon();
            } else if (b.isRolloverEnabled() && model.isRollover()) {
                if (model.isSelected()) {
                    tmpIcon = b.getRolloverSelectedIcon();
                    if (tmpIcon == null) {
                        tmpIcon = b.getSelectedIcon();
                    }
                } else {
                    tmpIcon = b.getRolloverIcon();
                }
            } else if (model.isSelected()) {
                tmpIcon = b.getSelectedIcon();
            }

            if (tmpIcon != null) {
                icon = tmpIcon;
            }
        }
        return icon;
    }

    /**
     * Returns the global menu gutter fill kind.
     * 
     * @return The global menu gutter fill kind.
     */
    public static MenuGutterFillKind getMenuGutterFillKind() {
        Object globalSetting = UIManager.get(SubstanceSynapse.MENU_GUTTER_FILL_KIND);
        if (globalSetting instanceof MenuGutterFillKind)
            return (MenuGutterFillKind) globalSetting;
        return MenuGutterFillKind.HARD_FILL;
    }

    /**
     * Given a component, returns the parent for computing the {@link SubstanceDecorationPainter}.
     * 
     * @param c
     *            Component.
     * @return The parent for computing the {@link SubstanceDecorationPainter}.
     */
    public static Container getHeaderParent(Component c) {
        Component comp = c.getParent();
        Container result = null;
        while (comp != null) {
            // the second part fixes the incorrect alignments on
            // internal frames.
            if ((comp instanceof JLayeredPane) && (result == null))
                result = (Container) comp;
            if ((result == null) && (comp instanceof Window))
                result = (Container) comp;
            comp = comp.getParent();
        }
        return result;
    }

    /**
     * Paints the focus ring on the specified component.
     * 
     * @param g
     *            Graphics context.
     * @param mainComp
     *            The main component for the focus painting.
     * @param focusedComp
     *            The actual component that has the focus. For example, the main component can be a
     *            {@link JSpinner}, while the focused component is a text field inside the the
     *            spinner editor.
     * @param focusShape
     *            Focus shape. May be <code>null</code> - in this case, the bounds of
     *            <code>mainComp</code> will be used.
     * @param textRect
     *            Text rectangle (if relevant).
     * @param maxAlphaCoef
     *            Maximum alpha coefficient for painting the focus. Values lower than 1.0 will
     *            result in a translucent focus ring (can be used to paint a focus ring that doesn't
     *            draw too much attention away from the content, for example on text components).
     * @param extraPadding
     *            Extra padding between the component bounds and the focus ring painting.
     */
    public static void paintFocus(Graphics g, Component mainComp, Component focusedComp,
            TransitionAwareUI transitionAwareUI, Shape focusShape, Rectangle textRect,
            float maxAlphaCoef, float extraPadding) {
        float focusStrength = transitionAwareUI.getTransitionTracker()
                .getFocusStrength(focusedComp.hasFocus());
        if (focusStrength == 0.0f)
            return;

        FocusKind focusKind = SubstanceCoreUtilities.getFocusKind(mainComp);
        if (focusKind == FocusKind.NONE)
            return;

        Graphics2D graphics = (Graphics2D) g.create();
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        float alpha = maxAlphaCoef * focusStrength;
        graphics.setComposite(WidgetUtilities.getAlphaComposite(mainComp, alpha, g));

        Color color = SubstanceColorUtilities.getFocusColor(mainComp, transitionAwareUI);
        graphics.setColor(color);
        focusKind.paintFocus(mainComp, focusedComp, transitionAwareUI, graphics, focusShape,
                textRect, extraPadding);
        graphics.dispose();
    }

    /**
     * Returns indication whether the specified button is a close button on some title pane.
     * 
     * @param ab
     *            Button.
     * @return <code>true</code> if the specified button is a close button on some title pane,
     *         <code>false</code> otherwise.
     */
    public static boolean isTitleCloseButton(JComponent ab) {
        if ((ab instanceof SubstanceTitleButton) && Boolean.TRUE
                .equals(ab.getClientProperty(SubstanceButtonUI.IS_TITLE_CLOSE_BUTTON)))
            return true;
        return false;
    }

    /**
     * Uninstalls the specified menu item.
     * 
     * @param menuItem
     *            Menu item.
     */
    public static void uninstallMenu(JMenuItem menuItem) {
        if (menuItem instanceof JMenu) {
            JMenu menu = (JMenu) menuItem;
            for (Component comp : menu.getMenuComponents())
                if (comp instanceof JMenuItem)
                    SubstanceCoreUtilities.uninstallMenu((JMenuItem) comp);
        }

        ButtonUI menuItemUI = menuItem.getUI();
        if (menuItemUI instanceof SubstanceMenu) {
            SubstanceMenu sMenu = (SubstanceMenu) menuItemUI;
            if (sMenu.getAssociatedMenuItem() != null) {
                menuItemUI.uninstallUI(menuItem);
            }
        }

        for (ActionListener actionListener : menuItem.getActionListeners())
            menuItem.removeActionListener(actionListener);

        menuItem.removeAll();
    }

    /**
     * Returns the class loader for loading the resource files. It is a fix by Dag Joar and
     * Christian Schlichtherle for application running with -Xbootclasspath VM flag. In this case,
     * the using MyClass.class.getClassLoader() would return null, but the context class loader will
     * function properly that classes will be properly loaded regardless of whether the lib is added
     * to the system class path, the extension class path and regardless of the class loader
     * architecture set up by some frameworks.
     * 
     * @return The class loader for loading the resource files.
     */
    public static ClassLoader getClassLoaderForResources() {
        ClassLoader cl = (ClassLoader) UIManager.get("ClassLoader");
        if (cl == null)
            cl = Thread.currentThread().getContextClassLoader();
        return cl;
    }

    public static boolean isCoveredByLightweightPopups(final Component comp) {
        JRootPane rootPane = SwingUtilities.getRootPane(comp);
        if (rootPane == null)
            return false;
        Component[] popups = rootPane.getLayeredPane()
                .getComponentsInLayer(JLayeredPane.POPUP_LAYER);
        if (popups == null)
            return false;

        // System.out.println("Has " + popups.length + " popups");

        // Convert the component bounds to the layered pane.
        // Can't use the SwingUtilities.convertRectangle() as that
        // eventually will try to acquire the lock on the container
        Rectangle compBoundsConverted = SwingUtilities.convertRectangle(comp.getParent(),
                comp.getBounds(), rootPane.getLayeredPane());

        // System.out.println("Bounds : \n\torig : " + comp.getBounds()
        // + "\n\ttrans:" + compBoundsConverted);

        int popupIndexToStartWith = getPopupParentIndexOf(comp, popups) - 1;
        // String txt = (comp instanceof JMenuItem) ? ((JMenuItem) comp)
        // .getText() : "";
        // System.out.println("Starting scan from popup "
        // + popupIndexToStartWith + " for " + txt);
        for (int i = popupIndexToStartWith; i >= 0; i--) {
            Component popup = popups[i];
            // System.out.println("Popup " +
            // popup.getClass().getName());
            // System.out.println("Popup bounds " + popup.getBounds());
            if (compBoundsConverted.intersects(popup.getBounds())) {
                return true;
            }
        }
        return false;
    }

    /**
     * Gets a component and a list of popups and returns the index of the popup that is a parent of
     * the specified component. Is used to track issue 297 and prevent visual artifacts.
     * 
     * @param comp
     *            Component.
     * @param popups
     *            List of popups.
     * @return Index of the popup which is component's parent if any, or the popup list length
     *         otherwise.
     */
    public static int getPopupParentIndexOf(Component comp, Component[] popups) {
        for (int i = 0; i < popups.length; i++) {
            Component popup = popups[i];

            Component currComp = comp;
            while (currComp != null) {
                if (currComp == popup) {
                    return i;
                }
                currComp = currComp.getParent();
            }
        }
        return popups.length;
    }

    /**
     * Returns the border painter for the specified component.
     * 
     * @param comp
     *            Component.
     * @return Border painter for the specified component.
     * @see SubstanceSkin#getBorderPainter()
     */
    public static SubstanceBorderPainter getBorderPainter(Component comp) {
        return SubstanceCoreUtilities.getSkin(comp).getBorderPainter();
    }

    /**
     * Returns the highlight border painter for the specified component.
     * 
     * @param comp
     *            Component.
     * @return Highlight border painter for the specified component.
     * @see SubstanceSkin#getBorderPainter()
     * @see SubstanceSkin#getHighlightBorderPainter()
     */
    public static SubstanceBorderPainter getHighlightBorderPainter(Component comp) {
        SubstanceBorderPainter result = SubstanceCoreUtilities.getSkin(comp)
                .getHighlightBorderPainter();
        if (result != null)
            return result;
        return getBorderPainter(comp);
    }

    /**
     * Returns the component hierarchy.
     * 
     * @param comp
     *            Component.
     * @return Component hierarchy string.
     */
    public static String getHierarchy(Component comp) {
        StringBuffer buffer = new StringBuffer();
        getHierarchy(comp, buffer, 0);
        while (true) {
            if (comp instanceof Window) {
                Window w = (Window) comp;
                comp = w.getOwner();
                if (comp != null) {
                    buffer.append("Owner --->\n");
                    getHierarchy(comp, buffer, 0);
                }
            } else {
                break;
            }
        }
        return buffer.toString();
    }

    /**
     * Computes the component hierarchy.
     * 
     * @param comp
     *            Component.
     * @param buffer
     *            Hierarchy representation buffer.
     * @param level
     *            Hierarchy level.
     */
    public static void getHierarchy(Component comp, StringBuffer buffer, int level) {
        for (int i = 0; i < level; i++)
            buffer.append("   ");
        String name = comp.getName();
        if (comp instanceof Dialog)
            name = ((Dialog) comp).getTitle();
        if (comp instanceof Frame)
            name = ((Frame) comp).getTitle();
        buffer.append(comp.getClass().getName() + "[" + name + "]\n");
        if (comp instanceof Container) {
            Container cont = (Container) comp;
            for (int i = 0; i < cont.getComponentCount(); i++)
                getHierarchy(cont.getComponent(i), buffer, level + 1);
        }
    }

    /**
     * Returns the arrow icon.
     * 
     * @param comp
     *            Component.
     * @param component
     *            Button.
     * @param orientation
     *            Arrow orientation.
     * @return Arrow icon.
     */
    public static Icon getArrowIcon(AbstractButton button, int orientation) {
        Icon result = new ArrowButtonTransitionAwareIcon(button, orientation);
        return result;
    }

    /**
     * Returns the arrow icon.
     * 
     * @param comp
     *            Component.
     * @param component
     *            Button.
     * @param orientation
     *            Arrow orientation.
     * @return Arrow icon.
     */
    public static Icon getArrowIcon(JComponent comp,
            TransitionAwareIcon.TransitionAwareUIDelegate transitionAwareUIDelegate,
            int orientation) {
        Icon result = new ArrowButtonTransitionAwareIcon(comp, transitionAwareUIDelegate,
                orientation);
        return result;
    }

    /**
     * Returns the colorization factor for the specified component.
     * 
     * @param c
     *            Component.
     * @return The colorization factor for the specified component.
     * @see SubstanceLookAndFeel#COLORIZATION_FACTOR
     */
    public static double getColorizationFactor(Component c) {
        JPopupMenu popupMenu = null;
        while (c != null) {
            if (c instanceof JComponent) {
                JComponent jcomp = (JComponent) c;
                Object compProp = jcomp.getClientProperty(SubstanceSynapse.COLORIZATION_FACTOR);
                if (compProp instanceof Double)
                    return (Double) compProp;
            }
            if (c instanceof JPopupMenu) {
                popupMenu = (JPopupMenu) c;
            }
            c = c.getParent();
        }

        if (popupMenu != null) {
            Component invoker = popupMenu.getInvoker();
            if (popupMenu != invoker)
                return getColorizationFactor(popupMenu.getInvoker());
        }

        Object globalProp = UIManager.get(SubstanceSynapse.COLORIZATION_FACTOR);
        if (globalProp instanceof Double) {
            return (Double) globalProp;
        }

        return 0.5;
    }

    /**
     * Returns the skin of the specified component.
     * 
     * @param c
     *            Component.
     * @return The skin of the specified component.
     */
    public static SubstanceSkin getSkin(Component c) {
        if (!SubstanceCoreUtilities.isCurrentLookAndFeel())
            return null;

        if (!SubstanceRootPaneUI.hasCustomSkinOnAtLeastOneRootPane())
            return SubstanceCortex.GlobalScope.getCurrentSkin();

        SubstanceComboPopup comboPopup = (SubstanceComboPopup) SwingUtilities
                .getAncestorOfClass(SubstanceComboPopup.class, c);
        if (comboPopup != null) {
            // special case for combobox popup - take the skin
            // of the combobox itself - issue 439
            return getSkin(comboPopup.getCombobox());
        }

        JRootPane rootPane = SwingUtilities.getRootPane(c);

        if (c instanceof SubstanceInternalFrameTitlePane) {
            // use correct root pane for painting the
            // title panes of internal frames
            Component frame = c.getParent();
            if ((frame != null) && (frame instanceof JInternalFrame)) {
                rootPane = ((JInternalFrame) frame).getRootPane();
            }
        }
        if ((c != null) && (c.getParent() instanceof SubstanceInternalFrameTitlePane)) {
            // use correct root pane for painting the
            // title buttons of internal frames
            Component frame = c.getParent().getParent();
            if ((frame != null) && (frame instanceof JInternalFrame)) {
                rootPane = ((JInternalFrame) frame).getRootPane();
            }
        }
        if (rootPane != null) {
            Object skinProp = rootPane.getClientProperty(SubstanceSynapse.ROOT_PANE_SKIN);
            if (skinProp instanceof SubstanceSkin)
                return (SubstanceSkin) skinProp;
        }
        return SubstanceCortex.GlobalScope.getCurrentSkin();
    }

    /**
     * Returns a hash key for the specified parameters.
     * 
     * @param objects
     *            Key components.
     * @return Hash key.
     */
    public static HashMapKey getHashKey(Object... objects) {
        return new HashMapKey(objects);
    }

    /**
     * Stops all Substance threads. Improper use may result in UI artifacts and runtime exceptions.
     */
    public static void stopThreads() {
        TrackableThread.requestStopAllThreads();
    }

    /**
     * Retrieves a single parameter from the VM flags.
     * 
     * @param parameterName
     *            Parameter name.
     * @return Parameter value.
     */
    public static String getVmParameter(String parameterName) {
        String paramValue = null;
        try {
            paramValue = System.getProperty(parameterName);
            return paramValue;
        } catch (Exception exc) {
            // probably running in unsecure JNLP - ignore
            return null;
        }
    }

    /**
     * Tests UI threading violations on creating the specified component.
     * 
     * @param comp
     *            Component.
     * @throws UiThreadingViolationException
     *             If the component is created off Event Dispatch Thread.
     */
    public static void testComponentCreationThreadingViolation(Component comp) {
        if (!SwingUtilities.isEventDispatchThread()) {
            UiThreadingViolationException uiThreadingViolationError = new UiThreadingViolationException(
                    "Component creation must be done on Event Dispatch Thread");
            uiThreadingViolationError.printStackTrace(System.err);
            throw uiThreadingViolationError;
        }
    }

    /**
     * Tests UI threading violations on changing the state the specified component.
     * 
     * @param comp
     *            Component.
     * @throws UiThreadingViolationException
     *             If the component is changing state off Event Dispatch Thread.
     */
    public static void testComponentStateChangeThreadingViolation(Component comp) {
        if (!SwingUtilities.isEventDispatchThread()) {
            UiThreadingViolationException uiThreadingViolationError = new UiThreadingViolationException(
                    "Component state change must be done on Event Dispatch Thread");
            uiThreadingViolationError.printStackTrace(System.err);
            throw uiThreadingViolationError;
        }
    }

    /**
     * Tests UI threading violations on closing the specified window.
     * 
     * @param w
     *            Window.
     * @throws UiThreadingViolationException
     *             If the window is closed off Event Dispatch Thread.
     */
    public static void testWindowCloseThreadingViolation(Window w) {
        if (!SwingUtilities.isEventDispatchThread()) {
            UiThreadingViolationException uiThreadingViolationError = new UiThreadingViolationException(
                    "Window close must be done on Event Dispatch Thread");
            uiThreadingViolationError.printStackTrace(System.err);
            throw uiThreadingViolationError;
        }
    }

    public static void traceSubstanceApiUsage(Component comp, String message) {
        Window w = SwingUtilities.getWindowAncestor(comp);
        String wTitle = null;
        if (w instanceof Frame) {
            wTitle = ((Frame) w).getTitle();
        }
        if (w instanceof Dialog) {
            wTitle = ((Dialog) w).getTitle();
        }
        String wClassName = (w != null) ? w.getClass().getName() : null;
        throw new IllegalArgumentException(message + " [component "
                + comp.getClass().getSimpleName() + " in window " + wClassName + ":'" + wTitle
                + "' under " + UIManager.getLookAndFeel().getName() + "]");
    }

    /**
     * Scans {@code imageList} for best-looking image of specified dimensions. Image can be scaled
     * and/or padded with transparency.
     */
    public static BufferedImage getScaledIconImage(java.util.List<Image> imageList, int width,
            int height) {
        if (width == 0 || height == 0) {
            return null;
        }
        Image bestImage = null;
        int bestWidth = 0;
        int bestHeight = 0;
        double bestSimilarity = 3; // Impossibly high value
        for (Iterator<Image> i = imageList.iterator(); i.hasNext();) {
            // Iterate imageList looking for best matching image.
            // 'Similarity' measure is defined as good scale factor and small
            // insets.
            // Best possible similarity is 0 (no scale, no insets).
            // It's found while the experiments that good-looking result is
            // achieved with scale factors x1, x3/4, x2/3, xN, x1/N.
            Image im = i.next();
            if (im == null) {
                continue;
            }
            int iw;
            int ih;
            try {
                iw = im.getWidth(null);
                ih = im.getHeight(null);
            } catch (Exception e) {
                continue;
            }
            if (isHiDpiAwareImage(im)) {
                iw /= 2;
                ih /= 2;
            }
            if (iw > 0 && ih > 0) {
                // Calc scale factor
                double scaleFactor = Math.min((double) width / (double) iw,
                        (double) height / (double) ih);
                // Calculate scaled image dimensions
                // adjusting scale factor to nearest "good" value
                int adjw = 0;
                int adjh = 0;
                double scaleMeasure = 1; // 0 - best (no) scale, 1 - impossibly
                // bad
                if (scaleFactor >= 2) {
                    // Need to enlarge image more than twice
                    // Round down scale factor to multiply by integer value
                    scaleFactor = Math.floor(scaleFactor);
                    adjw = iw * (int) scaleFactor;
                    adjh = ih * (int) scaleFactor;
                    scaleMeasure = 1.0 - 0.5 / scaleFactor;
                } else if (scaleFactor >= 1) {
                    // Don't scale
                    scaleFactor = 1.0;
                    adjw = iw;
                    adjh = ih;
                    scaleMeasure = 0;
                } else if (scaleFactor >= 0.75) {
                    // Multiply by 3/4
                    scaleFactor = 0.75;
                    adjw = iw * 3 / 4;
                    adjh = ih * 3 / 4;
                    scaleMeasure = 0.3;
                } else if (scaleFactor >= 0.6666) {
                    // Multiply by 2/3
                    scaleFactor = 0.6666;
                    adjw = iw * 2 / 3;
                    adjh = ih * 2 / 3;
                    scaleMeasure = 0.33;
                } else {
                    // Multiply size by 1/scaleDivider
                    // where scaleDivider is minimum possible integer
                    // larger than 1/scaleFactor
                    double scaleDivider = Math.ceil(1.0 / scaleFactor);
                    scaleFactor = 1.0 / scaleDivider;
                    adjw = (int) Math.round(iw / scaleDivider);
                    adjh = (int) Math.round(ih / scaleDivider);
                    scaleMeasure = 1.0 - 1.0 / scaleDivider;
                }
                double similarity = ((double) width - (double) adjw) / width
                        + ((double) height - (double) adjh) / height + // Large
                        // padding
                        // is
                        // bad
                        scaleMeasure; // Large rescale is bad
                if (similarity < bestSimilarity) {
                    bestSimilarity = similarity;
                    bestImage = im;
                    bestWidth = adjw;
                    bestHeight = adjh;
                }
                if (similarity == 0)
                    break;
            }
        }
        if (bestImage == null) {
            // No images were found, possibly all are broken
            return null;
        }
        BufferedImage bimage = getBlankImage(width, height);
        Graphics2D g = bimage.createGraphics();
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BILINEAR);

        int x = (width - bestWidth) / 2;
        int y = (height - bestHeight) / 2;
        g.drawImage(bestImage, x, y, bestWidth, bestHeight, null);
        g.dispose();
        return bimage;
    }

    public static boolean canReplaceChildBackgroundColor(Color background) {
        return (background instanceof UIResource) || (background instanceof SubstanceColorResource);
    }

    public static JTextComponent getTextComponentForTransitions(Component c) {
        if (!(c instanceof JComponent))
            return null;

        TextComponentAware tcaui = (TextComponentAware) ((JComponent) c)
                .getClientProperty(TEXT_COMPONENT_AWARE);
        if (tcaui != null) {
            return tcaui.getTextComponent(c);
        }

        if (c instanceof JTextComponent) {
            return (JTextComponent) c;
        }
        return null;
    }

    public static SwingRepaintCallback getTextComponentRepaintCallback(
            JTextComponent textComponent) {
        Component c = textComponent;
        while (c != null) {
            if (c instanceof JComponent) {
                TextComponentAware tcaui = (TextComponentAware) ((JComponent) c)
                        .getClientProperty(TEXT_COMPONENT_AWARE);
                if (tcaui != null) {
                    return new SwingRepaintCallback(c);
                }
            }
            c = c.getParent();
        }
        return new SwingRepaintCallback(textComponent);
    }

    public static boolean isOpaque(JComponent c) {
        return c.isOpaque();
    }

    /**
     * Checks whether Substance is the current look-and-feel. This method is for internal use only.
     * 
     * @return <code>true</code> if Substance is the current look-and-feel, <code>false</code>
     *         otherwise.
     */
    public static boolean isCurrentLookAndFeel() {
        return (SubstanceCortex.GlobalScope.getCurrentSkin() != null);
    }

    public static int getButtonBarGravity(Container c) {
        boolean isLeftToRight = c.getComponentOrientation().isLeftToRight();
        SubstanceSlices.HorizontalGravity buttonBarGravity = SubstanceCortex.GlobalScope
                .getButtonBarGravity();
        switch (buttonBarGravity) {
            case PLATFORM:
                // On macOS the buttons are aligned to the trailing edge of
                // the container (right under LTR and left under RTL)
                return LookUtils.IS_OS_MAC
                        ? (isLeftToRight ? SwingConstants.RIGHT : SwingConstants.LEFT)
                        : SwingConstants.CENTER;
            case LEADING:
                return isLeftToRight ? SwingConstants.LEFT : SwingConstants.RIGHT;
            case CENTERED:
            case SWING_DEFAULT:
                return SwingConstants.CENTER;
            case TRAILING:
                return isLeftToRight ? SwingConstants.RIGHT : SwingConstants.LEFT;
        }
        throw new IllegalStateException("Unknown button alignment " + buttonBarGravity);
    }

    public static synchronized Platform getPlatform() {
        if (platform != null) {
            return platform;
        }

        if (LookUtils.IS_OS_WINDOWS) {
            return (platform = Platform.WINDOWS);
        }
        if (LookUtils.IS_OS_MAC) {
            return (platform = Platform.MACOS);
        }
        try {
            if (DefaultKDEFontPolicy.isKDERunning()) {
                return (platform = Platform.KDE);
            }
        } catch (Throwable t) {
            // security access - too bad for KDE desktops.
        }
        try {
            String desktop = AccessController.doPrivileged(new PrivilegedAction<String>() {
                public String run() {
                    return System.getProperty("sun.desktop");
                }
            });
            if ("gnome".equals(desktop)) {
                return (platform = Platform.GNOME);
            }
        } catch (Throwable t) {
            // security access - too bad for Gnome desktops.
        }

        return (platform = Platform.DEFAULT);
    }

    /**
     * Returns the title pane of the specified top-level window.
     * 
     * @param window
     *            Top-level window.
     * @return If the parameter is either {@link JFrame} or {@link JDialog} and has custom
     *         decorations, the result is the title pane, <code>null</code> otherwise.
     */
    public static JComponent getTitlePaneComponent(Window window) {
        JRootPane rootPane = SwingUtilities.getRootPane(window);
        if (rootPane != null) {
            SubstanceRootPaneUI ui = (SubstanceRootPaneUI) rootPane.getUI();
            return ui.getTitlePane();
        }
        return null;
    }

    public static void updateActiveUi() {
        for (Window window : Window.getWindows()) {
            SwingUtilities.updateComponentTreeUI(window);
        }

        for (MenuElement menuElement : MenuSelectionManager.defaultManager().getSelectedPath()) {
            if (menuElement instanceof JPopupMenu) {
                SwingUtilities.updateComponentTreeUI((JPopupMenu) menuElement);
            }
        }
    }
}
