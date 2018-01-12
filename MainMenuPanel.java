package resources;

import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.JLabel;
import java.awt.GridBagConstraints;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

/**
 * This class encapsulates the Main Menu of the application
 * 
 * @authors HA and KP
 *
 */
public class MainMenuPanel extends JPanel {

	private static final long serialVersionUID = 3L;
	private JButton btnNewButton;

	/**
	 * Create the panel.
	 */
	public MainMenuPanel() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 20, 145, 20, 145, 20, 0 };
		gridBagLayout.rowHeights = new int[] { 70, 30, 50, 30, 50, 30, 30, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel lblMainMenu = new JLabel("Main Menu");
		lblMainMenu.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
		GridBagConstraints gbc_lblMainMenu = new GridBagConstraints();
		gbc_lblMainMenu.gridwidth = 3;
		gbc_lblMainMenu.insets = new Insets(0, 0, 5, 5);
		gbc_lblMainMenu.gridx = 1;
		gbc_lblMainMenu.gridy = 0;
		add(lblMainMenu, gbc_lblMainMenu);

		JButton btnEveningExam = new JButton("Evening Exam");
		btnEveningExam.setEnabled(false);
		GridBagConstraints gbc_btnEveningExam = new GridBagConstraints();
		gbc_btnEveningExam.fill = GridBagConstraints.BOTH;
		gbc_btnEveningExam.insets = new Insets(0, 0, 5, 5);
		gbc_btnEveningExam.gridx = 1;
		gbc_btnEveningExam.gridy = 2;
		add(btnEveningExam, gbc_btnEveningExam);

		JButton btnGlendonKeele = new JButton("Glendon - Keele");
		btnGlendonKeele.setEnabled(false);
		GridBagConstraints gbc_btnGlendonKeele = new GridBagConstraints();
		gbc_btnGlendonKeele.fill = GridBagConstraints.BOTH;
		gbc_btnGlendonKeele.insets = new Insets(0, 0, 5, 5);
		gbc_btnGlendonKeele.gridx = 3;
		gbc_btnGlendonKeele.gridy = 2;
		add(btnGlendonKeele, gbc_btnGlendonKeele);

		JButton btnGoTrains = new JButton("Go Trains");
		btnGoTrains.setEnabled(false);
		GridBagConstraints gbc_btnGoTrains = new GridBagConstraints();
		gbc_btnGoTrains.fill = GridBagConstraints.BOTH;
		gbc_btnGoTrains.insets = new Insets(0, 0, 5, 5);
		gbc_btnGoTrains.gridx = 1;
		gbc_btnGoTrains.gridy = 4;
		add(btnGoTrains, gbc_btnGoTrains);

		btnNewButton = new JButton("Village");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 3;
		gbc_btnNewButton.gridy = 4;
		add(btnNewButton, gbc_btnNewButton);

		JButton btnVanGo = new JButton("Van Go");
		btnVanGo.setHorizontalTextPosition(SwingConstants.LEADING);

		Image img = new ImageIcon(this.getClass().getResource("/handicap.png")).getImage();
		img = img.getScaledInstance(42, 42, Image.SCALE_SMOOTH);
		btnVanGo.setIcon(new ImageIcon(img));

		btnVanGo.setEnabled(false);
		GridBagConstraints gbc_btnVanGo = new GridBagConstraints();
		gbc_btnVanGo.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnVanGo.gridwidth = 3;
		gbc_btnVanGo.insets = new Insets(0, 0, 5, 5);
		gbc_btnVanGo.gridx = 1;
		gbc_btnVanGo.gridy = 6;
		add(btnVanGo, gbc_btnVanGo);

	}

	/*
	 * Button add Action listener
	 */
	public void setbtnVillageActionListener(ActionListener listener) {
		// set buttons action listener
		btnNewButton.addActionListener(listener);
	}

}
