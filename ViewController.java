package resources;

import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;

/**
 * This class encapsulates a GUI, a component of which is a view-controller
 * delegate. This object is an observer of the Model.
 * 
 * This GUI presents views that are tailored to the current state of the Model.
 * Changes to the view are driven by state changes to the Model. View
 * initializes with an active button labeled "Press to start". This action
 * launches the first state change to the Model.
 * 
 * @author mb and Hassaan Abid
 *
 */
public class ViewController extends JFrame implements Observer, ActionListener {
	// needed by serializers
	private static final long serialVersionUID = 2L;

	// private SwingWorker<Void, Void> displayWorker;

	/*
	 * here we maintain a reference to the model so that the view-controller
	 * delegate may query the model about its state, using the model's services for
	 * doing so.
	 */
	private Model theModel;
	/*
	 * Variables Decelerations
	 */

	/**
	 * 
	 */
	private BottomPanel bottomPanel;
	private EastVillageSchedulePanel eastVillageSchedulePanel;
	private EastVillageStops eastVillageStops;
	private LoginBottomPanel loginBottomPanel;
	private MainMenuPanel mainMenuPanel;
	private ReminderBottomPanel reminderBottomPanel;
	private ReminderMenuPanel reminderMenuPanel;
	private ScheduleStopsMenu scheduleStopsMenu;
	private SignInPanel signInPanel;
	private TitlePanel titlePanel;
	private Village village;

	/**
	 * Creates the view-controller delegate
	 * 
	 * @param model
	 *            the Model
	 */
	public ViewController(Model model) {

		theModel = model;
		super.setTitle("EECS 3461 A2 - by H.A and K.P");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setSize(350, 680);
		this.setLocationByPlatform(true);
		this.setLocationRelativeTo(null);

		this.getContentPane().setBackground(new Color(255, 250, 250));
		this.getContentPane().setLayout(new BorderLayout());

		bottomPanel = new BottomPanel();
		eastVillageSchedulePanel = new EastVillageSchedulePanel();
		eastVillageStops = new EastVillageStops();
		loginBottomPanel = new LoginBottomPanel();
		mainMenuPanel = new MainMenuPanel();
		reminderMenuPanel = new ReminderMenuPanel();
		scheduleStopsMenu = new ScheduleStopsMenu();
		signInPanel = new SignInPanel();
		titlePanel = new TitlePanel();
		village = new Village();
		reminderBottomPanel = new ReminderBottomPanel();

		titlePanel = new TitlePanel();
		this.getContentPane().add(titlePanel, BorderLayout.NORTH);

		signInPanel = new SignInPanel();
		this.getContentPane().add(signInPanel, BorderLayout.CENTER);

		loginBottomPanel = new LoginBottomPanel();
		this.getContentPane().add(loginBottomPanel, BorderLayout.SOUTH);

		/**
		 * setting all button listeners
		 */
		// setAllBtnslisteners();
		/**
		 * Repainting the UI
		 */
		this.setVisible(true);
		this.repaint();

		setallButtonListners();
		village.runTimer();
	}

	private void setallButtonListners() {
		// TODO Auto-generated method stub
		this.loginBottomPanel.setbtnLoginActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				/**
				 * saving the id of the latest button pressed
				 */
				Model.transition = 1;
				invokeStateChange();
			}
		});

		this.bottomPanel.setbtnBackActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				/**
				 * saving the id of the latest button pressed
				 */
				Model.transition = 0;
				invokeStateChange();
			}
		});

		this.mainMenuPanel.setbtnVillageActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				/**
				 * saving the id of the latest button pressed
				 */
				Model.transition = 1;
				invokeStateChange();
			}
		});
		this.reminderBottomPanel.setbtnSetReminderActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				/**
				 * saving the id of the latest button pressed
				 */
				Model.transition = 0;

				bottomPanel.runTimer(village.getnterval());
				// reminderMenuPanel.
				invokeStateChange();
			}
		});
		this.reminderBottomPanel.setbtnBackActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				/**
				 * saving the id of the latest button pressed
				 */
				Model.transition = 0;
				invokeStateChange();
			}
		});

		this.scheduleStopsMenu.setbtnScheduleActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				/**
				 * saving the id of the latest button pressed
				 */
				Model.transition = 1;
				invokeStateChange();
			}
		});
		this.scheduleStopsMenu.setbtnStopsActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				/**
				 * saving the id of the latest button pressed
				 */
				Model.transition = 2;
				invokeStateChange();
			}
		});

		this.village.setbtnEastActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				/**
				 * saving the id of the latest button pressed
				 */
				Model.transition = 1;
				invokeStateChange();
			}
		});
		this.village.setbtnBellimgActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				/**
				 * saving the id of the latest button pressed
				 */
				Model.transition = 2;
				invokeStateChange();
			}
		});

	}

	/**
	 * The model's state has updated, this function repaints the UI to represent the
	 * current Model state
	 */
	@Override
	public void update(Observable o, Object arg) {
		// the model's state has updated

		switch (theModel.getCurrentState()) {

		case Model.STATE_LOGIN:
			// initial state of the app for now dont write anything
			this.getContentPane().remove(mainMenuPanel);
			this.getContentPane().remove(bottomPanel);
			this.getContentPane().add(signInPanel, BorderLayout.CENTER);
			this.getContentPane().add(loginBottomPanel, BorderLayout.SOUTH);
			this.setVisible(true);
			this.repaint();
			break;
		case Model.STATE_MAIN_MENU:
			if (this.theModel.getPrevState() == Model.STATE_LOGIN) {
				this.getContentPane().remove(signInPanel);
				this.getContentPane().remove(loginBottomPanel);
				this.getContentPane().add(bottomPanel, BorderLayout.SOUTH);
			} else {
				this.getContentPane().remove(village);
			}
			/**
			 * Repainting the UI
			 */
			this.getContentPane().add(mainMenuPanel, BorderLayout.CENTER);
			this.setVisible(true);
			this.repaint();
			break;
		case Model.STATE_VILLAGE_SHUTTLE:
			if (this.theModel.getPrevState() == Model.STATE_MAIN_MENU) {
				this.getContentPane().remove(mainMenuPanel);
			} else if (this.theModel.getPrevState() == Model.STATE_SET_REMINDER) {
				this.getContentPane().remove(reminderMenuPanel);
				this.getContentPane().remove(reminderBottomPanel);
				this.getContentPane().add(bottomPanel, BorderLayout.SOUTH);
			} else {
				this.getContentPane().remove(scheduleStopsMenu);
			}
			/**
			 * Repainting the UI
			 */
			this.getContentPane().add(village, BorderLayout.CENTER);
			this.setVisible(true);
			this.repaint();
			break;
		case Model.STATE_SCHEDULE_STOPS_MENU:
			if (this.theModel.getPrevState() == Model.STATE_VILLAGE_SHUTTLE) {
				this.getContentPane().remove(village);
			} else if (this.theModel.getPrevState() == Model.STATE_SCHEDULE) {
				this.getContentPane().remove(eastVillageSchedulePanel);
			} else {
				this.getContentPane().remove(eastVillageStops);
			}
			/**
			 * Repainting the UI
			 */
			this.getContentPane().add(scheduleStopsMenu, BorderLayout.CENTER);
			this.setVisible(true);
			this.repaint();
			break;
		case Model.STATE_SET_REMINDER:
			this.getContentPane().remove(village);
			this.getContentPane().remove(bottomPanel);

			this.getContentPane().add(reminderMenuPanel, BorderLayout.CENTER);
			this.getContentPane().add(reminderBottomPanel, BorderLayout.SOUTH);

			/**
			 * Repainting the UI
			 */
			this.setVisible(true);
			this.repaint();
			break;
		case Model.STATE_SCHEDULE:
			this.getContentPane().remove(scheduleStopsMenu);

			this.getContentPane().add(eastVillageSchedulePanel, BorderLayout.CENTER);
			/**
			 * Repainting the UI
			 */
			this.setVisible(true);
			this.repaint();
			break;
		case Model.STATE_STOPS:
			this.getContentPane().remove(scheduleStopsMenu);

			this.getContentPane().add(eastVillageStops, BorderLayout.CENTER);
			/**
			 * Repainting the UI
			 */
			this.setVisible(true);
			this.repaint();
			break;

		default:
			break;
		}
	}

	public void invokeStateChange() {
		switch (theModel.getCurrentState()) {
		case Model.STATE_LOGIN:
			theModel.setState(Model.STATE_MAIN_MENU);
			theModel.setPrevState(theModel.getCurrentState());
			break;

		case Model.STATE_MAIN_MENU:
			if (Model.transition == 1)
				theModel.setState(Model.STATE_VILLAGE_SHUTTLE);
			else
				theModel.setState(Model.STATE_LOGIN);
			theModel.setPrevState(theModel.getCurrentState());
			break;

		case Model.STATE_VILLAGE_SHUTTLE:
			if (Model.transition == 1)
				theModel.setState(Model.STATE_SCHEDULE_STOPS_MENU);
			else if (Model.transition == 2)
				theModel.setState(Model.STATE_SET_REMINDER);
			else
				theModel.setState(Model.STATE_MAIN_MENU);
			theModel.setPrevState(theModel.getCurrentState());
			break;

		case Model.STATE_SCHEDULE_STOPS_MENU:
			if (Model.transition == 1)
				theModel.setState(Model.STATE_SCHEDULE);
			else if (Model.transition == 2)
				theModel.setState(Model.STATE_STOPS);
			else
				theModel.setState(Model.STATE_VILLAGE_SHUTTLE);
			theModel.setPrevState(theModel.getCurrentState());
			break;

		case Model.STATE_SET_REMINDER:
			theModel.setState(Model.STATE_VILLAGE_SHUTTLE);
			theModel.setPrevState(theModel.getCurrentState());
			break;
		case Model.STATE_SCHEDULE:
			theModel.setState(Model.STATE_SCHEDULE_STOPS_MENU);
			theModel.setPrevState(theModel.getCurrentState());
			break;
		case Model.STATE_STOPS:
			theModel.setState(Model.STATE_SCHEDULE_STOPS_MENU);
			theModel.setPrevState(theModel.getCurrentState());
			break;
		default:
			break;
		}
	}

	/**
	 * Repaints the UI
	 */
	public void repaintUI() {

		this.setVisible(true);
		this.repaint();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
