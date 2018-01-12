package resources;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * This class encapsulates the login Panel's bottom buttons
 * 
 * @authors HA and KP
 *
 */
public class LoginBottomPanel extends JPanel {

	private static final long serialVersionUID = 9L;
	private JButton btnLogin;

	/**
	 * Create the panel.
	 */
	public LoginBottomPanel() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 75, 200, 75, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 8, 0, 10, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		btnLogin = new JButton("Login");

		GridBagConstraints gbc_btnLogin = new GridBagConstraints();
		gbc_btnLogin.insets = new Insets(0, 0, 5, 5);
		gbc_btnLogin.gridx = 1;
		gbc_btnLogin.gridy = 0;
		add(btnLogin, gbc_btnLogin);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBackground(Color.RED);
		btnExit.setOpaque(true);
		btnExit.setForeground(Color.WHITE);
		GridBagConstraints gbc_btnExit = new GridBagConstraints();
		gbc_btnExit.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnExit.insets = new Insets(0, 0, 5, 5);
		gbc_btnExit.gridx = 1;
		gbc_btnExit.gridy = 2;
		add(btnExit, gbc_btnExit);

	}

	/*
	 * Button add Action listener
	 */
	public void setbtnLoginActionListener(ActionListener listener) {
		// set buttons action listener
		btnLogin.addActionListener(listener);
	}

}
