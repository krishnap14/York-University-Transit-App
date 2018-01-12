package resources;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.util.Timer;
import java.util.TimerTask;

/**
 * This class encapsulates the Village Shuttle's Menu page
 * 
 * @authors HA and KP
 *
 */
public class Village extends JPanel {
	private static final long serialVersionUID = 1L;
	private JButton btnEast;
	private JButton btnBellimg;
	static long interval;
	static Timer timer;
	private JLabel lblTimer;

	/**
	 * Create the panel.
	 */
	public Village() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 20, 80, 150, 80, 20, 0 };
		gridBagLayout.rowHeights = new int[] { 80, 20, 60, 20, 60, 20, 60, 20, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel lblVillageShuttlesLeaving = new JLabel("Village Shuttles Leaving In");
		lblVillageShuttlesLeaving.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		GridBagConstraints gbc_lblVillageShuttlesLeaving = new GridBagConstraints();
		gbc_lblVillageShuttlesLeaving.gridwidth = 3;
		gbc_lblVillageShuttlesLeaving.insets = new Insets(0, 0, 5, 5);
		gbc_lblVillageShuttlesLeaving.gridx = 1;
		gbc_lblVillageShuttlesLeaving.gridy = 0;
		add(lblVillageShuttlesLeaving, gbc_lblVillageShuttlesLeaving);

		btnEast = new JButton("East");
		GridBagConstraints gbc_btnEast = new GridBagConstraints();
		gbc_btnEast.fill = GridBagConstraints.BOTH;
		gbc_btnEast.insets = new Insets(0, 0, 5, 5);
		gbc_btnEast.gridx = 1;
		gbc_btnEast.gridy = 2;
		add(btnEast, gbc_btnEast);

		lblTimer = new JLabel("Timer1");
		GridBagConstraints gbc_lblTimer = new GridBagConstraints();
		gbc_lblTimer.insets = new Insets(0, 0, 5, 5);
		gbc_lblTimer.gridx = 2;
		gbc_lblTimer.gridy = 2;
		add(lblTimer, gbc_lblTimer);

		btnBellimg = new JButton("");
		Image img = new ImageIcon(this.getClass().getResource("/bell-icon.png")).getImage();
		img = img.getScaledInstance(42, 42, Image.SCALE_SMOOTH);
		btnBellimg.setIcon(new ImageIcon(img));

		GridBagConstraints gbc_btnBellimg = new GridBagConstraints();
		gbc_btnBellimg.insets = new Insets(0, 0, 5, 5);
		gbc_btnBellimg.gridx = 3;
		gbc_btnBellimg.gridy = 2;
		add(btnBellimg, gbc_btnBellimg);

		JButton btnWest = new JButton("West");
		btnWest.setEnabled(false);
		GridBagConstraints gbc_btnWest = new GridBagConstraints();
		gbc_btnWest.fill = GridBagConstraints.BOTH;
		gbc_btnWest.insets = new Insets(0, 0, 5, 5);
		gbc_btnWest.gridx = 1;
		gbc_btnWest.gridy = 4;
		add(btnWest, gbc_btnWest);

		JLabel lblTimer_1 = new JLabel("-");
		GridBagConstraints gbc_lblTimer_1 = new GridBagConstraints();
		gbc_lblTimer_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblTimer_1.gridx = 2;
		gbc_lblTimer_1.gridy = 4;
		add(lblTimer_1, gbc_lblTimer_1);

		JButton btnBellimg_1 = new JButton("");
		btnBellimg_1.setEnabled(false);
		btnBellimg_1.setIcon(new ImageIcon(img));

		GridBagConstraints gbc_btnBellimg_1 = new GridBagConstraints();
		gbc_btnBellimg_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnBellimg_1.gridx = 3;
		gbc_btnBellimg_1.gridy = 4;
		add(btnBellimg_1, gbc_btnBellimg_1);

		JButton btnExpress = new JButton("Express");
		btnExpress.setEnabled(false);
		GridBagConstraints gbc_btnExpress = new GridBagConstraints();
		gbc_btnExpress.fill = GridBagConstraints.BOTH;
		gbc_btnExpress.insets = new Insets(0, 0, 5, 5);
		gbc_btnExpress.gridx = 1;
		gbc_btnExpress.gridy = 6;
		add(btnExpress, gbc_btnExpress);

		JLabel lblTimer_2 = new JLabel("-");
		GridBagConstraints gbc_lblTimer_2 = new GridBagConstraints();
		gbc_lblTimer_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblTimer_2.gridx = 2;
		gbc_lblTimer_2.gridy = 6;
		add(lblTimer_2, gbc_lblTimer_2);

		JButton btnBellimg_2 = new JButton("");
		btnBellimg_2.setEnabled(false);
		btnBellimg_2.setIcon(new ImageIcon(img));

		GridBagConstraints gbc_btnBellimg_2 = new GridBagConstraints();
		gbc_btnBellimg_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnBellimg_2.gridx = 3;
		gbc_btnBellimg_2.gridy = 6;
		add(btnBellimg_2, gbc_btnBellimg_2);

	}

	/*
	 * Button add Action listener
	 */
	public void setbtnEastActionListener(ActionListener listener) {
		// set buttons action listener
		btnEast.addActionListener(listener);
	}

	public void setbtnBellimgActionListener(ActionListener listener) {
		// set buttons action listener
		btnBellimg.addActionListener(listener);
	}

	public void runTimer() {
		long milli = 0;
		milli = Long.parseLong("1000");
		milli = milli * 1000;
		startTimer(milli);
	}

	private void setLabelTime(String t) {
		lblTimer.setText(t);
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

	public long getnterval() {
		return interval;
	}
}
