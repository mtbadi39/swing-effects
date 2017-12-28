/**
 * 
 */
package test.common;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

import org.pushingpixels.flamingo.api.common.JCommandButtonPanel;
import org.pushingpixels.flamingo.api.common.JCommandToggleButton;
import org.pushingpixels.flamingo.api.common.icon.DecoratedResizableIcon;
import org.pushingpixels.flamingo.api.common.icon.ResizableIcon;

import test.svg.transcoded.font_x_generic;

public class QuickStylesPanel extends JCommandButtonPanel {
	public QuickStylesPanel(ResourceBundle resourceBundle, Locale locale) {
		super(32);

		MessageFormat mf = new MessageFormat(resourceBundle
				.getString("PanelStyles.text"));
		mf.setLocale(locale);

		for (int groupIndex = 0; groupIndex < 4; groupIndex++) {
			String iconGroupName = mf.format(new Object[] { groupIndex });
			this.addButtonGroup(iconGroupName, groupIndex);
			for (int i = 0; i < 15; i++) {
				final String deco = groupIndex + "/" + i;
				ResizableIcon fontIcon = new font_x_generic();
				ResizableIcon finalIcon = new DecoratedResizableIcon(fontIcon,
						new DecoratedResizableIcon.IconDecorator() {
							@Override
							public void paintIconDecoration(Component c,
									Graphics g, int x, int y, int width,
									int height) {
								Graphics2D g2d = (Graphics2D) g.create();
								g2d.setColor(Color.black);
								if (getComponentOrientation().isLeftToRight()) {
									g2d.drawString(deco, x + 2, y + height - 2);
								} else {
									g2d.drawString(deco, x
											+ width
											- g2d.getFontMetrics().stringWidth(
													deco) - 2, y + height - 2);
								}
								g2d.dispose();
							}
						});
				JCommandToggleButton jrb = new JCommandToggleButton(null,
						finalIcon);
				jrb.setName("Group " + groupIndex + ", index " + i);
				jrb.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.out.println("Invoked action on " + deco);
					}
				});
				this.addButtonToLastGroup(jrb);
			}
		}
		this.setSingleSelectionMode(true);
		this.setToShowGroupLabels(false);
	}
}