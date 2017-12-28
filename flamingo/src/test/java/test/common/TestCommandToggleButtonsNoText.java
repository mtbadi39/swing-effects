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
import java.awt.Container;
import java.awt.color.ColorSpace;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ColorConvertOp;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.plaf.metal.MetalLookAndFeel;

import org.pushingpixels.flamingo.api.common.CommandButtonDisplayState;
import org.pushingpixels.flamingo.api.common.JCommandToggleButton;
import org.pushingpixels.flamingo.api.common.icon.FilteredResizableIcon;

import test.svg.transcoded.edit_paste;

public class TestCommandToggleButtonsNoText extends TestCommandToggleButtons {
	@Override
	protected JCommandToggleButton createToggleButton(
			CommandButtonDisplayState state, String title) {
		JCommandToggleButton mainButton = new JCommandToggleButton(
				new edit_paste());
		mainButton.setDisabledIcon(new FilteredResizableIcon(new edit_paste(),
				new ColorConvertOp(ColorSpace.getInstance(ColorSpace.CS_GRAY),
						null)));
		mainButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(stamp() + ": Main selection");
			}
		});
		mainButton.setDisplayState(state);
		mainButton.setFlat(false);
		return mainButton;
	}

	@Override
	protected void configureControlPanel(JPanel controlPanel) {
		super.configureControlPanel(controlPanel);
		final JCheckBox noText = new JCheckBox("no text");
		noText.setSelected(true);
		noText.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(new Runnable() {
					@Override
					public void run() {
						apply(TestCommandToggleButtonsNoText.this,
								new Command() {
									public void apply(
											JCommandToggleButton button) {
										button
												.setText(noText.isSelected() ? null
														: "New caption");
										button
												.setExtraText(noText
														.isSelected() ? null
														: "New extra text");
									};
								});
						TestCommandToggleButtonsNoText.this.getContentPane()
								.invalidate();
						TestCommandToggleButtonsNoText.this.getContentPane()
								.validate();
					}
				});
			}
		});
		controlPanel.add(noText);
	}

	private static interface Command {
		void apply(JCommandToggleButton button);
	}

	private static void apply(Container cont, Command cmd) {
		for (int i = 0; i < cont.getComponentCount(); i++) {
			Component comp = cont.getComponent(i);
			if (comp instanceof JCommandToggleButton) {
				JCommandToggleButton cb = (JCommandToggleButton) comp;
				cmd.apply(cb);
			}
			if (comp instanceof Container) {
				apply((Container) comp, cmd);
			}
		}
	}

	/**
	 * Main method for testing.
	 * 
	 * @param args
	 *            Ignored.
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(new MetalLookAndFeel());
				} catch (Exception e) {
				}
				TestCommandToggleButtonsNoText frame = new TestCommandToggleButtonsNoText();
				frame.setSize(800, 400);
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
	}
}
