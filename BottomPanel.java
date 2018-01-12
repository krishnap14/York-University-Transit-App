package resources;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

/**
 * This class contains the Reminder Panel and the back button, they both float
 * on the bottom of all views
 * 
 * @authors HA and KP
 *
 */
public class BottomPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 11L;
	static long interval;
	static Timer timer;
	private JButton btnBack;
	private JLabel lblVillagesShuttleEast;

	/**
	 * Create the panel.
	 */
	public BottomPanel() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 80, 270, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel lblClockIcon = new JLabel();
		Image img = new ImageIcon(this.getClass().getResource("/timer-icon.png")).getImage();
		img = img.getScaledInstance(42, 42, Image.SCALE_SMOOTH);
		lblClockIcon.setIcon(new ImageIcon(img));

		GridBagConstraints gbc_lblClockIcon = new GridBagConstraints();
		gbc_lblClockIcon.insets = new Insets(0, 0, 5, 5);
		gbc_lblClockIcon.gridx = 0;
		gbc_lblClockIcon.gridy = 0;
		add(lblClockIcon, gbc_lblClockIcon);

		lblVillagesShuttleEast = new JLabel("No reminder set.");
		GridBagConstraints gbc_lblVillagesShuttleEast = new GridBagConstraints();
		gbc_lblVillagesShuttleEast.fill = GridBagConstraints.BOTH;
		gbc_lblVillagesShuttleEast.insets = new Insets(0, 0, 5, 0);
		gbc_lblVillagesShuttleEast.gridx = 1;
		gbc_lblVillagesShuttleEast.gridy = 0;
		add(lblVillagesShuttleEast, gbc_lblVillagesShuttleEast);

		btnBack = new JButton("Back");

		btnBack.setHorizontalTextPosition(SwingConstants.LEADING);

		Image img1 = new ImageIcon(this.getClass().getResource("/back.png")).getImage();
		img1 = img1.getScaledInstance(42, 42, Image.SCALE_SMOOTH);
		btnBack.setIcon(new ImageIcon(img1));

		GridBagConstraints gbc_btnBack = new GridBagConstraints();
		gbc_btnBack.fill = GridBagConstraints.VERTICAL;
		gbc_btnBack.gridwidth = 2;
		gbc_btnBack.gridx = 0;
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

	public void runTimer(long interval) {
		if (lblVillagesShuttleEast.getText() == "No reminder set.")
			startTimer(interval);
	}

	private void setLabelTime(String t) {
		lblVillagesShuttleEast.setText("<html><p>** Reminder Set ** </p>" + "<p>Villages Shuttle East- </p>"
				+ "<p> Leaving in " + t + "</p><html>");
	}

	private void startTimer(long milli) {
		int delay = 1000;
		int period = 1000;
		timer = new Timer();
		interval = milli;
		timer.scheduleAtFixedRate(new TimerTask() {
			public void run() {
				String t = getElapsedTimeHoursMinutesFromMilliseconds(setInterval());
				setLabelTime(t);
			}

		}, delay, period);
	}

	private static final long setInterval() {
		if (interval == 1)
			timer.cancel();
		interval = interval - 1000;
		return interval;
	}

	/**
	 * elapsed time in hours/minutes/seconds
	 * 
	 * @return String
	 */
	public static String getElapsedTimeHoursMinutesFromMilliseconds(long milliseconds) {
		String format = String.format("%%0%dd", 2);
		long elapsedTime = milliseconds / 1000;
		String seconds = String.format(format, elapsedTime % 60);
		String minutes = String.format(format, (elapsedTime % 3600) / 60);
		// String hours = String.format(format, elapsedTime / 3600);
		String time = minutes + "m " + seconds + "s ";
		// System.out.println(time);
		return time;
	}
}
