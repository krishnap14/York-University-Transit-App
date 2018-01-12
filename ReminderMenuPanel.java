package resources;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.SwingConstants;

import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.Color;

public class ReminderMenuPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8L;
	/**
	 * Create the panel.
	 */
	@SuppressWarnings("rawtypes")
	private JComboBox comboBox;
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public ReminderMenuPanel() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{350, 0};
		gridBagLayout.rowHeights = new int[]{80, 20, 30, 20, 30, 20, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		 
		 JLabel lblVillageShuttle = new JLabel("Village Shuttle #1 East Reminder");
		 lblVillageShuttle.setHorizontalAlignment(SwingConstants.CENTER);
		 lblVillageShuttle.setBackground(Color.ORANGE);
		 lblVillageShuttle.setOpaque(true);
		 lblVillageShuttle.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		 GridBagConstraints gbc_lblVillageShuttle = new GridBagConstraints();
		 gbc_lblVillageShuttle.fill = GridBagConstraints.HORIZONTAL;
		 gbc_lblVillageShuttle.insets = new Insets(0, 0, 5, 0);
		 gbc_lblVillageShuttle.gridx = 0;
		 gbc_lblVillageShuttle.gridy = 0;
		 add(lblVillageShuttle, gbc_lblVillageShuttle);
		 
		 JLabel lblMinutesBeforeThe = new JLabel("Choose time in minutes before the Shuttle Departs");
		 lblMinutesBeforeThe.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		 GridBagConstraints gbc_lblMinutesBeforeThe = new GridBagConstraints();
		 gbc_lblMinutesBeforeThe.insets = new Insets(0, 0, 5, 0);
		 gbc_lblMinutesBeforeThe.gridx = 0;
		 gbc_lblMinutesBeforeThe.gridy = 2;
		 add(lblMinutesBeforeThe, gbc_lblMinutesBeforeThe);
		
		 comboBox = new JComboBox<Object>();
		 comboBox.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", "60"}));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.gridx = 0;
		gbc_comboBox.gridy = 4;
		add(comboBox, gbc_comboBox);

	}
	/**
	 * getter for comboBox
	 * @return
	 */
	public String getComboText() {
		return this.comboBox.getSelectedItem().toString();		
	}

}
