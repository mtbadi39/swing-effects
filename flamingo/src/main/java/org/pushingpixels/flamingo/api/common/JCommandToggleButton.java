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
package org.pushingpixels.flamingo.api.common;

import javax.swing.JComponent;
import javax.swing.UIManager;

import org.pushingpixels.flamingo.api.common.icon.ResizableIcon;
import org.pushingpixels.flamingo.api.common.model.ActionToggleButtonModel;
import org.pushingpixels.flamingo.internal.ui.common.BasicCommandToggleButtonUI;
import org.pushingpixels.flamingo.internal.ui.common.CommandButtonUI;

/**
 * Command button.
 * 
 * @author Kirill Grouchnikov
 */
public class JCommandToggleButton extends AbstractCommandButton {
	/**
	 * The UI class ID string.
	 */
	public static final String uiClassID = "CommandToggleButtonUI";

	/**
	 * Creates a new command toggle button with empty text
	 * 
	 * @param icon
	 *            Button icon.
	 */
	public JCommandToggleButton(ResizableIcon icon) {
		this(null, icon);
	}

	/**
	 * Creates a new command toggle button without an icon.
	 * 
	 * @param title
	 *            Button title. May contain any number of words.
	 */
	public JCommandToggleButton(String title) {
		this(title, null);
	}

	/**
	 * Creates a new command toggle button.
	 * 
	 * @param title
	 *            Button title. May contain any number of words.
	 * @param icon
	 *            Button icon.
	 */
	public JCommandToggleButton(String title, ResizableIcon icon) {
		super(title, icon);
		this.setActionModel(new ActionToggleButtonModel(false));
		this.updateUI();
	}

	/**
	 * Resets the UI property to a value from the current look and feel.
	 * 
	 * @see JComponent#updateUI
	 */
	@Override
	public void updateUI() {
		if (UIManager.get(getUIClassID()) != null) {
			setUI((CommandButtonUI) UIManager.getUI(this));
		} else {
			setUI(BasicCommandToggleButtonUI.createUI(this));
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.JComponent#getUIClassID()
	 */
	@Override
	public String getUIClassID() {
		return uiClassID;
	}

	@Override
	public String toString() {
		return "Command toggle button[" + this.getText() + "]";
	}
}
