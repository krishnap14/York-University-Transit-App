package resources;

import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 * This class encapsulates the Village East Shuttle Schedule View
 * @authors HA and KP
 *
 */
public class EastVillageSchedulePanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 10L;

	/**
	 * Create the panel.
	 */
	public EastVillageSchedulePanel() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{175, 175, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel label_2 = new JLabel("Village Shuttle #1 East Departs At");
		label_2.setOpaque(true);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		label_2.setBackground(Color.ORANGE);
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.gridwidth = 2;
		gbc_label_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_label_2.insets = new Insets(0, 0, 5, 0);
		gbc_label_2.gridx = 0;
		gbc_label_2.gridy = 0;
		add(label_2, gbc_label_2);
		
		JLabel lblPm = new JLabel("6:30 PM");
		lblPm.setBackground(Color.WHITE);
		GridBagConstraints gbc_lblPm = new GridBagConstraints();
		gbc_lblPm.insets = new Insets(0, 0, 5, 5);
		gbc_lblPm.gridx = 0;
		gbc_lblPm.gridy = 1;
		add(lblPm, gbc_lblPm);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setEnabled(false);
		Image img = new ImageIcon(this.getClass().getResource("/bell-icon.png")).getImage();
		img = img.getScaledInstance(42, 42, Image.SCALE_SMOOTH);
		btnNewButton.setIcon(new ImageIcon(img));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 1;
		add(btnNewButton, gbc_btnNewButton);
		
		JLabel lblNewLabel = new JLabel("7:30 PM");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 2;
		add(lblNewLabel, gbc_lblNewLabel);
		
		JButton button = new JButton("");
		button.setEnabled(false);
		button.setIcon(new ImageIcon(img));
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(0, 0, 5, 0);
		gbc_button.gridx = 1;
		gbc_button.gridy = 2;
		add(button, gbc_button);
		
		JLabel lblPm_1 = new JLabel("8:40 PM");
		GridBagConstraints gbc_lblPm_1 = new GridBagConstraints();
		gbc_lblPm_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblPm_1.gridx = 0;
		gbc_lblPm_1.gridy = 3;
		add(lblPm_1, gbc_lblPm_1);
		
		JButton button_1 = new JButton("");
		button_1.setEnabled(false);
		button_1.setIcon(new ImageIcon(img));
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.insets = new Insets(0, 0, 5, 0);
		gbc_button_1.gridx = 1;
		gbc_button_1.gridy = 3;
		add(button_1, gbc_button_1);
		
		JLabel lblPm_12 = new JLabel("9:40 PM");
		GridBagConstraints gbc_lblPm_12 = new GridBagConstraints();
		gbc_lblPm_12.insets = new Insets(0, 0, 5, 5);
		gbc_lblPm_12.gridx = 0;
		gbc_lblPm_12.gridy = 4;
		add(lblPm_12, gbc_lblPm_12);
		
		JButton button_2 = new JButton("");
		button_2.setEnabled(false);
		button_2.setIcon(new ImageIcon(img));
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.insets = new Insets(0, 0, 5, 0);
		gbc_button_2.gridx = 1;
		gbc_button_2.gridy = 4;
		add(button_2, gbc_button_2);
		
		JLabel lblPm_13 = new JLabel("10:40 PM");
		GridBagConstraints gbc_lblPm_13 = new GridBagConstraints();
		gbc_lblPm_13.insets = new Insets(0, 0, 5, 5);
		gbc_lblPm_13.gridx = 0;
		gbc_lblPm_13.gridy = 5;
		add(lblPm_13, gbc_lblPm_13);
		
		JButton button_3 = new JButton("");
		button_3.setEnabled(false);
		button_3.setIcon(new ImageIcon(img));
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.insets = new Insets(0, 0, 5, 0);
		gbc_button_3.gridx = 1;
		gbc_button_3.gridy = 5;
		add(button_3, gbc_button_3);
		
		JLabel lblPm_14 = new JLabel("11:40 PM");
		GridBagConstraints gbc_lblPm_14 = new GridBagConstraints();
		gbc_lblPm_14.insets = new Insets(0, 0, 0, 5);
		gbc_lblPm_14.gridx = 0;
		gbc_lblPm_14.gridy = 6;
		add(lblPm_14, gbc_lblPm_14);
		
		JButton button_4 = new JButton("");
		button_4.setEnabled(false);
		button_4.setIcon(new ImageIcon(img));
		GridBagConstraints gbc_button_4 = new GridBagConstraints();
		gbc_button_4.gridx = 1;
		gbc_button_4.gridy = 6;
		add(button_4, gbc_button_4);

	}

}
