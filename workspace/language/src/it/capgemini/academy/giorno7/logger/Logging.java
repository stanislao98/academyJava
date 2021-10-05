package it.capgemini.academy.giorno7.logger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Logging {

	public static void main(String[] args) {

		Logger logger = Logger.getLogger("myLogger");
		logger.setLevel(Level.ALL);

		FileHandler fileHandler = null;

		try {
			fileHandler = new FileHandler("movimenti.xml");
		} catch (SecurityException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		logger.addHandler(fileHandler);

		logger.severe("situazione grave");
		logger.warning("avviso");
		logger.info("informazioni");
		logger.fine("messaggio");

	}

}
