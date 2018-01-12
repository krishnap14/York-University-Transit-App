package resources;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.Font;

/**
 * This class encapsulates the bottom panel view
 * 
 * @authors HA and KP
 *
 */
public class ReminderBottomPanel extends JPanel {

	private static final long serialVersionUID = 7L;
	private JButton btnBack;
	private JButton btnSetReminder;

	/**
	 * Create the panel.
	 */
	public ReminderBottomPanel() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 20, 310, 20, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);
		Image img = new ImageIcon(this.getClass().getResource("/timer-icon.png")).getImage();
		img = img.getScaledInstance(42, 42, Image.SCALE_SMOOTH);

		btnBack = new JButton("Cancel");

		btnBack.setHorizontalTextPosition(SwingConstants.LEADING);

		Image img1 = new ImageIcon(this.getClass().getResource("/back.png")).getImage();
		img1 = img1.getScaledInstance(42, 42, Image.SCALE_SMOOTH);

		btnSetReminder = new JButton("Set Reminder");
		btnSetReminder.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		GridBagConstraints gbc_btnSetReminder = new GridBagConstraints();
		gbc_btnSetReminder.fill = GridBagConstraints.BOTH;
		gbc_btnSetReminder.insets = new Insets(0, 0, 5, 5);
		gbc_btnSetReminder.gridx = 1;
		gbc_btnSetReminder.gridy = 0;
		add(btnSetReminder, gbc_btnSetReminder);
		btnBack.setIcon(new ImageIcon(img1));

		GridBagConstraints gbc_btnBack = new GridBagConstraints();
		gbc_btnBack.insets = new Insets(0, 0, 0, 5);
		gbc_btnBack.fill = GridBagConstraints.VERTICAL;
		gbc_btnBack.gridx = 1;
		gbc_btnBack.gridy = 1;
		add(btnBack, gbc_btnBack);

	}

	/*
	 * Button add Action listener
	 */
	public void setbtnBackActionListener(ActionListener listener) {
		// set buttons action listener
		btnBack.addActionListener(listener);
	}

	public void setbtnSetReminderActionListener(ActionListener listener) {
		// set buttons action listener
		btnSetReminder.addActionListener(listener);
	}

}
