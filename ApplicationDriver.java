import java.awt.Font;

import javax.swing.UIManager;

import resources.AppRunnable;

/**
 * This class is the main method to run the prototype
 * 
 * @author mb
 *
 */
public class ApplicationDriver {

	/**
	 * This method launches the app. The app does not make use of command line
	 * arguments. The app never terminates on its own.
	 * 
	 * @param args
	 *            none
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		setUIFont(new javax.swing.plaf.FontUIResource("Helvetica", Font.PLAIN, 16));

		// instantiate a Runnable object which can then be passed to the method
		// invocation below
		Runnable theRunnable = new AppRunnable();
		// this invocation serves to launch the event dispatching thread and
		// to place the runnable on that thread
		javax.swing.SwingUtilities.invokeLater(theRunnable);

		/*
		 * [Note: The body of this main method could potentially be reduced to a single
		 * line by using of an anonymous inner class. However, the instance has been
		 * made explicit here for the sake of clarity]
		 */
	}

	public static void setUIFont(javax.swing.plaf.FontUIResource f) {
		java.util.Enumeration keys = UIManager.getDefaults().keys();
		while (keys.hasMoreElements()) {
			Object key = keys.nextElement();
			Object value = UIManager.get(key);
			if (value instanceof javax.swing.plaf.FontUIResource)
				UIManager.put(key, f);
		}
	}

}
