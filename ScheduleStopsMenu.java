package resources;

import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

/**
 * This class encapsulates the sub-menu called the Stops and Schedule
 * 
 * @authors HA and KP
 *
 */
public class ScheduleStopsMenu extends JPanel {

	private static final long serialVersionUID = 2L;
	private JButton btnSchedule;
	private JButton btnStops;
	private JLabel label;

	/**
	 * Create the panel.
	 */
	public ScheduleStopsMenu() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 20, 310, 20 };
		gridBagLayout.rowHeights = new int[] { 80, 20, 60, 20, 60, 20, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0 };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		label = new JLabel("Village Shuttle #1 East");
		label.setOpaque(true);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		label.setBackground(Color.ORANGE);
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.fill = GridBagConstraints.HORIZONTAL;
		gbc_label.gridwidth = 3;
		gbc_label.insets = new Insets(0, 0, 5, 0);
		gbc_label.gridx = 0;
		gbc_label.gridy = 0;
		add(label, gbc_label);

		btnSchedule = new JButton("Schedule");
		btnSchedule.setOpaque(true);
		GridBagConstraints gbc_btnSchedule = new GridBagConstraints();
		gbc_btnSchedule.fill = GridBagConstraints.BOTH;
		gbc_btnSchedule.insets = new Insets(0, 0, 5, 5);
		gbc_btnSchedule.gridx = 1;
		gbc_btnSchedule.gridy = 2;
		add(btnSchedule, gbc_btnSchedule);

		btnStops = new JButton("Stops");
		btnStops.setOpaque(true);

		GridBagConstraints gbc_btnStops = new GridBagConstraints();
		gbc_btnStops.insets = new Insets(0, 0, 5, 5);
		gbc_btnStops.fill = GridBagConstraints.BOTH;
		gbc_btnStops.gridx = 1;
		gbc_btnStops.gridy = 4;
		add(btnStops, gbc_btnStops);

	}

	/*
	 * Button add Action listener
	 */
	public void setbtnScheduleActionListener(ActionListener listener) {
		// set buttons action listener
		btnSchedule.addActionListener(listener);
	}

	public void setbtnStopsActionListener(ActionListener listener) {
		// set buttons action listener
		btnStops.addActionListener(listener);
	}
}
