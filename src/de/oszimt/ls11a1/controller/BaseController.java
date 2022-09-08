/*
 * Created on 21.05.2022 by Kay Patzwald (patzwald@oszimt.de)
 */
package de.oszimt.ls11a1.controller;

/**
 * @author Kay Patzwald (patzwald@oszimt.de)
 *
 */
public abstract class BaseController {

	protected MainController controller;

	public BaseController(MainController controller) {
		super();
		this.controller = controller;
	}

	protected abstract void initView();

	protected abstract void initController();
	
	protected abstract void initController(Object data);

	protected abstract void initModel();
	
	public MainController getMainController() {
		return controller;
	}
}