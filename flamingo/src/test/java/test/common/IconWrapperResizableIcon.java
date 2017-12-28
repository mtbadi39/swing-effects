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
package test.common;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.Icon;

import org.pushingpixels.flamingo.api.common.icon.ResizableIcon;

public class IconWrapperResizableIcon implements ResizableIcon {
	protected Icon delegate;

	public IconWrapperResizableIcon(Icon delegate) {
		this.delegate = delegate;
	}

	@Override
	public int getIconHeight() {
		return delegate.getIconHeight();
	}

	@Override
	public int getIconWidth() {
		return delegate.getIconHeight();
	}

	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		delegate.paintIcon(c, g, x, y);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jvnet.flamingo.common.ResizableIcon#revertToOriginalDimension()
	 */
	public void revertToOriginalDimension() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jvnet.flamingo.common.ResizableIcon#setDimension(java.awt.Dimension)
	 */
	public void setDimension(Dimension dim) {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jvnet.flamingo.common.ResizableIcon#setHeight(int)
	 */
	public void setHeight(int height) {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jvnet.flamingo.common.ResizableIcon#setWidth(int)
	 */
	public void setWidth(int width) {
	}
}
