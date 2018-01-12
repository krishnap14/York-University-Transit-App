package resources;

import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import java.awt.Color;

/**
 * This class encapsulates the Village East Shuttle Stops View
 * 
 * @authors HA and KP
 *
 */
public class EastVillageStops extends JPanel {

	private static final long serialVersionUID = 6L;

	/**
	 * Create the panel.
	 */
	public EastVillageStops() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 350, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel lblVillageEast = new JLabel("Village #1 East (Orange) Monday - Friday");
		lblVillageEast.setOpaque(true);
		lblVillageEast.setHorizontalAlignment(SwingConstants.CENTER);
		lblVillageEast.setBackground(Color.ORANGE);
		lblVillageEast.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		GridBagConstraints gbc_lblVillageEast = new GridBagConstraints();
		gbc_lblVillageEast.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblVillageEast.insets = new Insets(0, 0, 5, 0);
		gbc_lblVillageEast.gridx = 0;
		gbc_lblVillageEast.gridy = 0;
		add(lblVillageEast, gbc_lblVillageEast);

		JLabel lblStopsAt = new JLabel("Stops At");
		GridBagConstraints gbc_lblStopsAt = new GridBagConstraints();
		gbc_lblStopsAt.insets = new Insets(0, 0, 5, 0);
		gbc_lblStopsAt.gridx = 0;
		gbc_lblStopsAt.gridy = 1;
		add(lblStopsAt, gbc_lblStopsAt);

		JLabel lblVariHall = new JLabel("Vari Hall");
		GridBagConstraints gbc_lblVariHall = new GridBagConstraints();
		gbc_lblVariHall.insets = new Insets(0, 0, 5, 0);
		gbc_lblVariHall.gridx = 0;
		gbc_lblVariHall.gridy = 2;
		add(lblVariHall, gbc_lblVariHall);

		JLabel lblBoakeSt = new JLabel("Boake St.");
		GridBagConstraints gbc_lblBoakeSt = new GridBagConstraints();
		gbc_lblBoakeSt.insets = new Insets(0, 0, 5, 0);
		gbc_lblBoakeSt.gridx = 0;
		gbc_lblBoakeSt.gridy = 3;
		add(lblBoakeSt, gbc_lblBoakeSt);

		JLabel lblCookRdAt = new JLabel("Cook Rd. at Haynes Ave");
		GridBagConstraints gbc_lblCookRdAt = new GridBagConstraints();
		gbc_lblCookRdAt.insets = new Insets(0, 0, 5, 0);
		gbc_lblCookRdAt.gridx = 0;
		gbc_lblCookRdAt.gridy = 4;
		add(lblCookRdAt, gbc_lblCookRdAt);

		JLabel lblHaynesAve = new JLabel("Haynes Ave.");
		GridBagConstraints gbc_lblHaynesAve = new GridBagConstraints();
		gbc_lblHaynesAve.insets = new Insets(0, 0, 5, 0);
		gbc_lblHaynesAve.gridx = 0;
		gbc_lblHaynesAve.gridy = 5;
		add(lblHaynesAve, gbc_lblHaynesAve);

		JLabel lblHackettAve = new JLabel("Hackett Ave.");
		GridBagConstraints gbc_lblHackettAve = new GridBagConstraints();
		gbc_lblHackettAve.insets = new Insets(0, 0, 5, 0);
		gbc_lblHackettAve.gridx = 0;
		gbc_lblHackettAve.gridy = 6;
		add(lblHackettAve, gbc_lblHackettAve);

		JLabel lblCookRdAt_1 = new JLabel("Cook Rd. at Leitch Ave.");
		GridBagConstraints gbc_lblCookRdAt_1 = new GridBagConstraints();
		gbc_lblCookRdAt_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblCookRdAt_1.gridx = 0;
		gbc_lblCookRdAt_1.gridy = 7;
		add(lblCookRdAt_1, gbc_lblCookRdAt_1);

		JLabel lblLeitchAve = new JLabel("Leitch Ave.");
		GridBagConstraints gbc_lblLeitchAve = new GridBagConstraints();
		gbc_lblLeitchAve.insets = new Insets(0, 0, 5, 0);
		gbc_lblLeitchAve.gridx = 0;
		gbc_lblLeitchAve.gridy = 8;
		add(lblLeitchAve, gbc_lblLeitchAve);

		JLabel lblJeWigginsDr = new JLabel("J.E. Wiggins Dr.\n");
		GridBagConstraints gbc_lblJeWigginsDr = new GridBagConstraints();
		gbc_lblJeWigginsDr.insets = new Insets(0, 0, 5, 0);
		gbc_lblJeWigginsDr.gridx = 0;
		gbc_lblJeWigginsDr.gridy = 9;
		add(lblJeWigginsDr, gbc_lblJeWigginsDr);

		JLabel lblApplebaumTer = new JLabel("Applebaum Ter.\n");
		GridBagConstraints gbc_lblApplebaumTer = new GridBagConstraints();
		gbc_lblApplebaumTer.insets = new Insets(0, 0, 5, 0);
		gbc_lblApplebaumTer.gridx = 0;
		gbc_lblApplebaumTer.gridy = 10;
		add(lblApplebaumTer, gbc_lblApplebaumTer);

		JLabel lblLeitchAveAt = new JLabel("Leitch Ave. at Bowsfield Rd.");
		GridBagConstraints gbc_lblLeitchAveAt = new GridBagConstraints();
		gbc_lblLeitchAveAt.insets = new Insets(0, 0, 5, 0);
		gbc_lblLeitchAveAt.gridx = 0;
		gbc_lblLeitchAveAt.gridy = 11;
		add(lblLeitchAveAt, gbc_lblLeitchAveAt);

		JLabel lblSaywellRd = new JLabel("Saywell Rd.");
		GridBagConstraints gbc_lblSaywellRd = new GridBagConstraints();
		gbc_lblSaywellRd.insets = new Insets(0, 0, 5, 0);
		gbc_lblSaywellRd.gridx = 0;
		gbc_lblSaywellRd.gridy = 12;
		add(lblSaywellRd, gbc_lblSaywellRd);

		JLabel lblHerzbergGdns = new JLabel("Herzberg Gdns.");
		GridBagConstraints gbc_lblHerzbergGdns = new GridBagConstraints();
		gbc_lblHerzbergGdns.gridx = 0;
		gbc_lblHerzbergGdns.gridy = 13;
		add(lblHerzbergGdns, gbc_lblHerzbergGdns);

	}

}
