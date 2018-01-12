package resources;

import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.GridBagLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.Image;
import java.awt.Insets;

/**
 * This class encapsulates the title and logo of the application
 * 
 * @authors HA and KP
 *
 */
public class TitlePanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5L;

	/**
	 * Create the panel.
	 */
	public TitlePanel() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel lblNewLabel = new JLabel();
		Image img = new ImageIcon(this.getClass().getResource("/York-University.png")).getImage();
		img = img.getScaledInstance(348, 112, Image.SCALE_SMOOTH);

		lblNewLabel.setIcon(new ImageIcon(img));

		// JLabel lblNewLabel = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		add(lblNewLabel, gbc_lblNewLabel);

		/**
		 * TITLE
		 */
		JLabel lblNewLabel_1 = new JLabel("Shuttle Transportation Services");
		lblNewLabel_1.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
		lblNewLabel_1.setBackground(Color.RED);
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);

		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		add(lblNewLabel_1, gbc_lblNewLabel_1);

	}

}
