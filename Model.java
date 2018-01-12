package resources;

import java.util.Observable;

/**
 * This class encapsulates the data model of a very simple data collection
 * protocol. The model has three possible states: init state (has an associated
 * sting containing initial instructions), elicitation state (has an associated
 * ordered set of prompts), and end state (has an associated final message).
 * This class provides services for iterating over the ordered set of prompts.
 * 
 * This Model is an Observable.
 * 
 * @author mb , ha and kp
 *
 */

public class Model extends Observable {

	/*
	 * Varibales
	 */
	private int currentState;
	private int prevState = 1;

	/**
	 * NEW STATES
	 */

	// start page
	public static final int STATE_LOGIN = 1;
	// MAIN MEU
	public static final int STATE_MAIN_MENU = 2;
	// 5 categories

	public static final int STATE_VILLAGE_SHUTTLE = 3;
	// schedule stops menu
	public static final int STATE_SCHEDULE_STOPS_MENU = 4;
	// reminder state
	public static final int STATE_SET_REMINDER = 5;

	// schedule and stops lists
	public static final int STATE_SCHEDULE = 6;
	public static final int STATE_STOPS = 7;

	public static int transition = 1;

	/**
	 * Create an instance of this model. The iterator over the prompts has not been
	 * initialized.
	 */
	public Model() {
		/**
		 * NEW
		 */

		this.setState(Model.STATE_LOGIN);

	}

	private void modelNotify(Object o) {
		// indicate that the state of this Observable has changed
		setChanged();
		// notify the observers that the state has changed
		notifyObservers(o);
	}

	/**
	 * @param modelState
	 *            the state for the model. Passed parameter must be one of the class
	 *            fields.
	 * 
	 *            Mutate the current state of this model.
	 */
	public void setState(int modelState) {
		currentState = modelState;
		modelNotify(currentState);
	}

	/**
	 * @return the current state of this model (value will be one of the class
	 *         fields).
	 */
	public int getCurrentState() {
		return currentState;
	}

	public int getPrevState() {
		return prevState;
	}

	public void setPrevState(int prevState) {
		this.prevState = prevState;
	}

}
