/*
 * Copyright (c) 2005-2016 Flamingo Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Flamingo Kirill Grouchnikov nor the names of 
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
package test.svg;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;

import org.pushingpixels.flamingo.api.bcb.BreadcrumbBarCallBack;
import org.pushingpixels.flamingo.api.common.JCommandButton;
import org.pushingpixels.flamingo.api.common.RichTooltip;
import org.pushingpixels.flamingo.api.common.StringValuePair;
import org.pushingpixels.flamingo.api.common.icon.EmptyResizableIcon;
import org.pushingpixels.flamingo.api.common.icon.ResizableIcon;
import org.pushingpixels.flamingo.api.svg.SvgBatikResizableIcon;
import org.pushingpixels.flamingo.api.svg.SvgStreamTranscoder;

/**
 * Panel that hosts SVG-based gallery buttons.
 * 
 * @author Kirill Grouchnikov
 */
public class SvgFileViewPanel extends JPanel {
	/**
	 * All icon groups.
	 */
	protected ArrayList<JCommandButton> allButtons;

	/**
	 * Current icon dimension.
	 */
	protected int currDimension;

	/**
	 * Callback into the underlying breadcrumb bar.
	 */
	protected BreadcrumbBarCallBack<File> callback;

	/**
	 * The main worker that loads the SVG images off EDT.
	 */
	private SwingWorker<Void, StringValuePair<InputStream>> mainWorker;

	/**
	 * Creates a new panel.
	 * 
	 * @param callback
	 *            Callback into the underlying breadcrumb bar.
	 * @param startingDimension
	 *            Initial dimension for SVG icons.
	 */
	public SvgFileViewPanel(BreadcrumbBarCallBack<File> callback,
			int startingDimension) {
		this.callback = callback;
		this.currDimension = startingDimension;
		this.allButtons = new ArrayList<JCommandButton>();
		this.setLayout(new SvgFileViewPanelLayout());
	}

	/**
	 * Sets the current files to show. The current contents of the panel are
	 * discarded. The file list is scanned for files ending with
	 * <code>.svg</code>. For each such file a new {@link JCommandButton}
	 * hosting an SVG-based implementation of {@link ResizableIcon} is added to
	 * the panel.
	 * 
	 * @param leafs
	 *            Information on the files to show in the panel.
	 */
	public void setFolder(final java.util.List<StringValuePair<File>> leafs) {
		for (JCommandButton rb : this.allButtons)
			this.remove(rb);
		this.allButtons.clear();

		final Map<String, JCommandButton> newButtons = new HashMap<String, JCommandButton>();
		for (StringValuePair<File> leaf : leafs) {
			String name = leaf.getKey();
			if (!name.endsWith(".svg") && !name.endsWith(".svgz"))
				continue;

			JCommandButton svgButton = new JCommandButton(name
					.replace('-', ' '), new EmptyResizableIcon(currDimension));
			RichTooltip richTooltip = new RichTooltip("Transcode",
					"Click to generate Java2D class");
			svgButton.setActionRichTooltip(richTooltip);
			svgButton.updateCustomDimension(currDimension);

			allButtons.add(svgButton);
			add(svgButton);

			newButtons.put(name, svgButton);
		}
		doLayout();
		repaint();

		mainWorker = new SwingWorker<Void, StringValuePair<InputStream>>() {
			@Override
			protected Void doInBackground() throws Exception {
				for (final StringValuePair<File> leafPair : leafs) {
					if (isCancelled())
						break;
					final String name = leafPair.getKey();
					if (!name.endsWith(".svg") && !name.endsWith(".svgz"))
						continue;
					InputStream stream = callback.getLeafContent(leafPair
							.getValue());
					StringValuePair<InputStream> pair = new StringValuePair<InputStream>(
							name, stream);
					publish(pair);
				}
				return null;
			}

			@Override
			protected void process(List<StringValuePair<InputStream>> pairs) {
				for (final StringValuePair<InputStream> pair : pairs) {
					final String name = pair.getKey();
					InputStream svgStream = pair.getValue();
					Dimension svgDim = new Dimension(currDimension,
							currDimension);
					final SvgBatikResizableIcon svgIcon = name.endsWith(".svg") ? SvgBatikResizableIcon
							.getSvgIcon(svgStream, svgDim)
							: SvgBatikResizableIcon.getSvgzIcon(svgStream,
									svgDim);
					JCommandButton svgButton = newButtons.get(name);
					svgButton.setIcon(svgIcon);

					RichTooltip richTooltip = new RichTooltip("Transcode",
							"Click to generate Java2D class");
					svgButton.setActionRichTooltip(richTooltip);
					svgButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							try {
								System.out.println(name);
								String svgClassName = name.substring(0, name
										.lastIndexOf('.'));
								svgClassName = svgClassName.replace('-', '_');
								svgClassName = svgClassName.replace(' ', '_');

								String javaClassFilename = System
										.getProperty("java.io.tmpdir")
										+ File.separator
										+ svgClassName
										+ ".java";

								PrintWriter pw = new PrintWriter(
										javaClassFilename);

								SvgStreamTranscoder transcoder = new SvgStreamTranscoder(
										new ByteArrayInputStream(svgIcon
												.getSvgBytes()), svgClassName);

								transcoder.setPrintWriter(pw);
								transcoder.transcode();
								JOptionPane
										.showMessageDialog(
												SwingUtilities
														.getWindowAncestor(SvgFileViewPanel.this),
												"Finished with '"
														+ javaClassFilename
														+ "'");
							} catch (Throwable exc) {
								exc.printStackTrace();
							}
						}
					});

					svgButton.updateCustomDimension(currDimension);
				}
			}
			//
			// @Override
			// protected void done() {
			// doLayout();
			// repaint();
			// }
		};
		mainWorker.execute();
	}

	/**
	 * Changes the current dimension of all displayed icons.
	 * 
	 * @param dimension
	 */
	public void setIconDimension(int dimension) {
		for (JCommandButton rb : this.allButtons) {
			rb.updateCustomDimension(dimension);
			rb.revalidate();
			rb.doLayout();
		}
		this.revalidate();
		this.doLayout();
		this.repaint();
		this.currDimension = dimension;
	}

	/**
	 * Layout manager for <code>this</code> popup gallery.
	 * 
	 * @author Kirill Grouchnikov
	 */
	protected class SvgFileViewPanelLayout implements LayoutManager {
		/**
		 * Strut dimension.
		 */
		public static final int STRUT = 2;

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.awt.LayoutManager#addLayoutComponent(java.lang.String,
		 * java.awt.Component)
		 */
		public void addLayoutComponent(String name, Component comp) {
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.awt.LayoutManager#removeLayoutComponent(java.awt.Component)
		 */
		public void removeLayoutComponent(Component comp) {
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.awt.LayoutManager#layoutContainer(java.awt.Container)
		 */
		public void layoutContainer(Container parent) {
			Insets bInsets = SvgFileViewPanel.this.getInsets();
			int left = bInsets.left + STRUT;
			int right = bInsets.right + STRUT;
			int top = bInsets.top + STRUT;
			// int bottom = bInsets.bottom + STRUT;
			int y = top;
			// compute max width of icon buttons
			int maxButtonWidth = 0;
			int maxButtonHeight = 0;
			for (JCommandButton gb : allButtons) {
				maxButtonWidth = Math.max(maxButtonWidth,
						gb.getPreferredSize().width);
				maxButtonHeight = Math.max(maxButtonHeight, gb
						.getPreferredSize().height);
			}
			int currX = left;
			int maxWidth = parent.getWidth() - left - right;
			for (JCommandButton gb : allButtons) {
				int endX = currX + maxButtonWidth;
				if (endX > (maxWidth - right)) {
					currX = left;
					y += (maxButtonHeight + STRUT);
				}
				gb.setBounds(currX, y, maxButtonWidth, maxButtonHeight);
				currX += maxButtonWidth;
			}
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.awt.LayoutManager#minimumLayoutSize(java.awt.Container)
		 */
		public Dimension minimumLayoutSize(Container parent) {
			return this.preferredLayoutSize(parent);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.awt.LayoutManager#preferredLayoutSize(java.awt.Container)
		 */
		public Dimension preferredLayoutSize(Container parent) {
			if (allButtons.size() == 0)
				return new Dimension(0, 0);
			// go over all groups and see how many rows each one needs
			Insets bInsets = SvgFileViewPanel.this.getInsets();
			int left = bInsets.left + STRUT;
			int right = bInsets.right + STRUT;
			int top = bInsets.top + STRUT;
			int bottom = bInsets.bottom + STRUT;
			int height = top + bottom;

			// compute max width of icon buttons
			int maxButtonWidth = 0;
			int maxButtonHeight = 0;
			for (JCommandButton gb : allButtons) {
				maxButtonWidth = Math.max(maxButtonWidth,
						gb.getPreferredSize().width);
				maxButtonHeight = Math.max(maxButtonHeight, gb
						.getPreferredSize().height);
			}
			int maxWidth = parent.getWidth() - left - right;
			int buttonsInRow = maxWidth / maxButtonWidth;

			// total height
			int iconRows = (int) (Math.ceil((double) allButtons.size()
					/ (double) buttonsInRow));
			height += iconRows * (maxButtonHeight + STRUT);
			return new Dimension(maxWidth, height);
		}
	}

	/**
	 * Cancels the main worker.
	 */
	public void cancelMainWorker() {
		if (this.mainWorker == null)
			return;
		if (this.mainWorker.isDone() || this.mainWorker.isCancelled())
			return;
		this.mainWorker.cancel(false);
	}
}
