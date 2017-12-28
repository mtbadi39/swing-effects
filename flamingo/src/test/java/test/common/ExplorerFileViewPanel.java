/*
 * Copyright (c) 2005-2007 Flamingo Kirill Grouchnikov. 
 * All Rights Reserved.
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
 *  o Neither the name of Rainbow, Kirill Grouchnikov 
 *    and Alexander Potochkin nor the names of
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
package test.common;

import java.awt.Dimension;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import javax.swing.filechooser.FileSystemView;

import org.pushingpixels.flamingo.api.bcb.JBreadcrumbBar;
import org.pushingpixels.flamingo.api.common.AbstractFileViewPanel;
import org.pushingpixels.flamingo.api.common.CommandButtonDisplayState;
import org.pushingpixels.flamingo.api.common.JCommandButton;
import org.pushingpixels.flamingo.api.common.ProgressListener;
import org.pushingpixels.flamingo.api.common.StringValuePair;
import org.pushingpixels.flamingo.api.common.icon.IcoWrapperResizableIcon;
import org.pushingpixels.flamingo.api.common.icon.ImageWrapperResizableIcon;
import org.pushingpixels.flamingo.api.common.icon.ResizableIcon;
import org.pushingpixels.flamingo.api.svg.SvgBatikResizableIcon;

/**
 * Panel that hosts image-based buttons.
 * 
 * @author Kirill Grouchnikov
 * @param <
 * 		T> Type tag.
 */
public class ExplorerFileViewPanel<T> extends AbstractFileViewPanel<T> {
	protected JBreadcrumbBar<T> bar;

	// protected static Map<String, String> extensionMapping;

	protected static Map<String, ResizableIcon> iconMapping = new HashMap<String, ResizableIcon>();

	protected static ResizableIcon defaultIcon;

	protected boolean useNativeIcons;

	/**
	 * Creates a new panel.
	 * 
	 * @param bar
	 * 		The breadcrumb bar that is used to browse local or remote repository
	 * 		of image files.
	 * @param startingDimension
	 * 		Initial dimension for image icons.
	 * @param progressListener
	 * 		Progress listener to report back on loaded SVG images.
	 */
	public ExplorerFileViewPanel(JBreadcrumbBar<T> bar, int startingDimension,
			ProgressListener progressListener) {
		super(startingDimension, progressListener);
		this.bar = bar;
		this.useNativeIcons = false;
	}

	/**
	 * Creates a new panel.
	 * 
	 * @param bar
	 * 		The breadcrumb bar that is used to browse local or remote repository
	 * 		of image files.
	 * @param startingState
	 * 		Initial state for image icons.
	 * @param progressListener
	 * 		Progress listener to report back on loaded SVG images.
	 */
	public ExplorerFileViewPanel(JBreadcrumbBar<T> bar,
			CommandButtonDisplayState startingState, ProgressListener progressListener) {
		super(startingState, progressListener);
		this.bar = bar;
		this.useNativeIcons = false;
	}

	public void setUseNativeIcons(boolean useNativeIcons) {
		this.useNativeIcons = useNativeIcons;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.jvnet.flamingo.common.AbstractFileViewPanel#toShowFile(org.jvnet.
	 * flamingo.bcb.BreadcrumbBarCallBack.KeyValuePair)
	 */
	@Override
	protected boolean toShowFile(StringValuePair<T> pair) {
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.jvnet.flamingo.common.AbstractFileViewPanel#getResizableIcon(org.
	 * jvnet.flamingo.common.AbstractFileViewPanel.Leaf, java.io.InputStream,
	 * org.jvnet.flamingo.common.ElementState, java.awt.Dimension)
	 */
	@Override
	protected ResizableIcon getResizableIcon(
			org.pushingpixels.flamingo.api.common.AbstractFileViewPanel.Leaf leaf,
			InputStream stream, CommandButtonDisplayState state, Dimension dimension) {
		int prefSize = state.getPreferredIconSize();
		if (prefSize > 0) {
			dimension = new Dimension(prefSize, prefSize);
		}

		if (this.useNativeIcons) {
			Object sourceProp = leaf.getLeafProp("source");
			if (sourceProp instanceof File) {
				return new IconWrapperResizableIcon(FileSystemView
						.getFileSystemView().getSystemIcon((File) sourceProp));
			} else {
				return null;
			}
		}

		String name = leaf.getLeafName();
		// if ("CIMG2164.JPG".compareTo(name) != 0)
		// return null;
		int lastPointIndex = name.lastIndexOf('.');
		String ext = "*";
		if (lastPointIndex >= 0) {
			ext = name.substring(lastPointIndex + 1);
		}
		ext = ext.toLowerCase();
		if ((ext.compareTo("jpg") == 0) || (ext.compareTo("jpeg") == 0)
				|| (ext.compareTo("gif") == 0) || (ext.compareTo("png") == 0)
				|| (ext.compareTo("bmp") == 0)) {
			return ImageWrapperResizableIcon.getIcon(stream, dimension);
		}

		if (ext.compareTo("svg") == 0) {
			return SvgBatikResizableIcon.getSvgIcon(stream, dimension);
		}

		if (ext.compareTo("svgz") == 0) {
			return SvgBatikResizableIcon.getSvgzIcon(stream, dimension);
		}

		if (ext.compareTo("ico") == 0) {
			return IcoWrapperResizableIcon.getIcon(stream, dimension);
		}

		ResizableIcon icon = iconMapping.get(ext);
		if (icon == null) {
			try {
				File iconFile = new File("C:/jtools/icons/File Icons Vs3/"
						+ ext.toUpperCase() + ".ico");
				if (iconFile.exists()) {
					icon = IcoWrapperResizableIcon.getIcon(new FileInputStream(
							iconFile), dimension);
				} else {
					if (defaultIcon == null) {
						defaultIcon = IcoWrapperResizableIcon
								.getIcon(
										new FileInputStream(
												new File(
														"C:/jtools/icons/File Icons Vs3/Default.ico")),
										dimension);
					}
					return defaultIcon;
				}
				iconMapping.put(ext, icon);
			} catch (FileNotFoundException fnfe) {
				fnfe.printStackTrace();
			}
		}
		return icon;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.jvnet.flamingo.common.AbstractFileViewPanel#configureCommandButton
	 * (org.jvnet.flamingo.common.AbstractFileViewPanel.Leaf,
	 * org.jvnet.flamingo.common.JCommandButton,
	 * org.jvnet.flamingo.common.icon.ResizableIcon)
	 */
	@Override
	protected void configureCommandButton(
			org.pushingpixels.flamingo.api.common.AbstractFileViewPanel.Leaf leaf,
			JCommandButton button, ResizableIcon icon) {
		String filename = leaf.getLeafName();
		String ext = "Generic";
		int lastDot = filename.lastIndexOf('.');
		if (lastDot >= 0)
			ext = filename.substring(lastDot + 1).toUpperCase();
		button.setExtraText(ext + " file");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.jvnet.flamingo.common.AbstractFileViewPanel#getLeafContent(java.lang
	 * .Object)
	 */
	@Override
	protected InputStream getLeafContent(T leaf) {
		return bar.getCallback().getLeafContent(leaf);
	}
}
