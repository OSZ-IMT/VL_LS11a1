/*
 * Created on 21.05.2022 by Kay Patzwald (patzwald@oszimt.de)
 */
package de.oszimt.ls11a1;

import java.awt.EventQueue;

import de.oszimt.ls11a1.controller.MainController;
import de.oszimt.ls11a1.model.dao.DaoFactory;
import de.oszimt.ls11a1.model.dao.IDao;
import de.oszimt.ls11a1.view.MainWindow;

import javax.swing.*;

/**
 * @author Kay Patzwald (patzwald@oszimt.de)
 *
 */
public class App {

	/**
	 * @param args, default
	 */
	public static void main(String[] args) {
	// Assemble all the pieces of the MVC

			EventQueue.invokeLater(() -> {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				} catch (Throwable ignored) {}
				MainWindow mainView = new MainWindow();
				IDao dao = DaoFactory.get("dummy");
				new MainController(dao, mainView);
			});

	}

}
