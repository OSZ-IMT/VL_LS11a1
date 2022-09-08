/*
 * Created on 01.05.2022 by Kay Patzwald
 */
package de.oszimt.ls11a1.controller;

import de.oszimt.ls11a1.model.dao.IDao;
import de.oszimt.ls11a1.view.MainWindow;

import java.util.Hashtable;

/** The MainController of the app
 * @author Kay Patzwald
 */
public class MainController {
	private final IDao dao;
	private final MainWindow mainWindow;
	private BaseController activController;

	private Hashtable<String, BaseController> controllerTable;

	/** 
	 * Main Controller of the app
	 */
	public MainController(IDao dao, MainWindow mainWindow) {
		this.mainWindow = mainWindow;
		this.dao = dao;
		initController();
	}
	
	/**
	 * Init the controller.
	 */
	private void initController() {
//		model.init();
		mainWindow.init();
		controllerTable = new Hashtable<>();
		controllerTable.put("mainView", new MainViewController(this));
		controllerTable.put("viewCustomers", new ViewCustomersController(this));
		setController("mainView");
	}
	
	/** COMMENT missing
	 * @param controllerName
	 */
	public void setController(String controllerName) {
		this.activController = controllerTable.get(controllerName);
		this.activController.initController();
	}
	
	/** COMMENT missing
	 * @param controllerName
	 */
	public void setController(String controllerName, Object data) {
		this.activController = controllerTable.get(controllerName);
		this.activController.initController(data);
	}

	/**
	 * @return the dao
	 */
	public IDao getDao() {
		return dao;
	}

	/**
	 * @return the mainView
	 */
	public MainWindow getMainWindow() {
		return mainWindow;
	}
}
