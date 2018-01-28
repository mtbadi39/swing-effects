/*
 * Copyright (c) 2005-2018 Flamingo Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.flamingo.api.ribbon;

import java.awt.event.ActionListener;

import javax.swing.JComponent;

import org.pushingpixels.flamingo.api.common.icon.ResizableIcon;
import org.pushingpixels.flamingo.api.ribbon.resize.CoreRibbonResizePolicies;
import org.pushingpixels.flamingo.internal.ui.ribbon.JFlowBandControlPanel;

/**
 * Flow ribbon band component. Hosts components added with
 * {@link #addFlowComponent(JComponent)} in flowing rows. Depending on the
 * current resize policy, the content is shown in either two or three rows.
 * 
 * @author Kirill Grouchnikov
 */
public class JFlowRibbonBand extends AbstractRibbonBand<JFlowBandControlPanel> {
	/**
	 * Creates a new flow ribbon band.
	 * 
	 * @param title
	 *            Band title.
	 * @param icon
	 *            Associated icon (for collapsed state).
	 */
	public JFlowRibbonBand(String title, ResizableIcon icon) {
		this(title, icon, null);
	}

	/**
	 * Creates a new flow ribbon band.
	 * 
	 * @param title
	 *            Band title.
	 * @param icon
	 *            Associated icon (for collapsed state).
	 * @param expandActionListener
	 *            Expand action listener (can be <code>null</code>).
	 */
	public JFlowRibbonBand(String title, ResizableIcon icon,
			ActionListener expandActionListener) {
		super(title, icon, expandActionListener, new JFlowBandControlPanel());
		this.resizePolicies = CoreRibbonResizePolicies
				.getCoreFlowPoliciesRestrictive(this, 3);
		updateUI();
	}

	/**
	 * Adds the specified component to this flow ribbon band.
	 * 
	 * @param comp
	 *            Component to add.
	 */
	public void addFlowComponent(JComponent comp) {
		this.controlPanel.addFlowComponent(comp);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jvnet.flamingo.ribbon.AbstractRibbonBand#cloneBand()
	 */
	@Override
	public AbstractRibbonBand<JFlowBandControlPanel> cloneBand() {
		AbstractRibbonBand<JFlowBandControlPanel> result = new JFlowRibbonBand(
				this.getTitle(), this.getIcon(), this.getExpandActionListener());
		result.applyComponentOrientation(this.getComponentOrientation());
		return result;
	}
}
