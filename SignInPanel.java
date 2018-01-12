package resources;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

/**
 * This class encapsulates View layer of the sign-in panel
 * 
 * @authors HA and KP
 *
 */
public class SignInPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4L;
	private JTextField txtUsername;
	private JPasswordField passwordField;

	/**
	 * Create the panel.
	 */
	public SignInPanel() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel lblSignIn = new JLabel("Sign In");
		lblSignIn.setFont(new Font("Lucida Grande", Font.PLAIN, 45));
		GridBagConstraints gbc_lblSignIn = new GridBagConstraints();
		gbc_lblSignIn.gridwidth = 10;
		gbc_lblSignIn.insets = new Insets(0, 0, 5, 0);
		gbc_lblSignIn.gridx = 0;
		gbc_lblSignIn.gridy = 0;
		gbc_lblSignIn.weighty = 0.1;
		add(lblSignIn, gbc_lblSignIn);
		// gbc_lblSignIn.weightx = 1;

		JLabel lblUsername = new JLabel("Username:");
		GridBagConstraints gbc_lblUsername = new GridBagConstraints();
		gbc_lblUsername.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsername.gridx = 1;
		gbc_lblUsername.gridy = 4;
		// gbc_lblUsername.weighty = 0.1;

		add(lblUsername, gbc_lblUsername);

		txtUsername = new JTextField();
		GridBagConstraints gbc_txtUsername = new GridBagConstraints();
		gbc_txtUsername.insets = new Insets(0, 0, 5, 5);
		gbc_txtUsername.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtUsername.gridx = 5;
		gbc_txtUsername.gridy = 4;
		// gbc_txtUsername.weighty = 0.1;

		add(txtUsername, gbc_txtUsername);
		txtUsername.setColumns(10);

		JLabel lblPassword = new JLabel("Password:");
		GridBagConstraints gbc_lblPassword = new GridBagConstraints();
		gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblPassword.gridx = 1;
		gbc_lblPassword.gridy = 5;
		// gbc_lblPassword.weighty = 0.1;

		add(lblPassword, gbc_lblPassword);

		passwordField = new JPasswordField();
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.insets = new Insets(0, 0, 5, 5);
		gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField.gridx = 5;
		gbc_passwordField.gridy = 5;
		add(passwordField, gbc_passwordField);

		JLabel lblloginUsingYour = new JLabel("*Login using your Passport York username and password");
		lblloginUsingYour.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		GridBagConstraints gbc_lblloginUsingYour = new GridBagConstraints();
		gbc_lblloginUsingYour.insets = new Insets(0, 0, 5, 0);
		gbc_lblloginUsingYour.gridwidth = 10;
		gbc_lblloginUsingYour.gridx = 0;
		gbc_lblloginUsingYour.gridy = 7;
		gbc_lblloginUsingYour.weighty = 0.05;

		add(lblloginUsingYour, gbc_lblloginUsingYour);

		JLabel lblNoteForThe = new JLabel("<html><p>NOTE: For the purpose of this assignment there is no Validation</p>"
				+ "<p>Hence, you can press the \"Login Button\" without PPY credentials</p></html>");
		lblNoteForThe.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		GridBagConstraints gbc_lblNoteForThe = new GridBagConstraints();
		gbc_lblNoteForThe.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNoteForThe.gridwidth = 10;
		gbc_lblNoteForThe.gridx = 0;
		gbc_lblNoteForThe.gridy = 10;
		gbc_lblNoteForThe.weighty = 0.05;

		add(lblNoteForThe, gbc_lblNoteForThe);

	}

}
