/*
 * Created on 21.05.2022 by Kay Patzwald (patzwald@oszimt.de)
 */
package de.oszimt.ls11a1.controller;

/**
 * @author Kay Patzwald (patzwald@oszimt.de)
 *
 */
public class ExitController extends BaseController {

	public ExitController(MainController controller) {
		super("exit","Beenden",controller);
	}

	@Override
	protected void initController() {
		System.exit(0);
	}

	@Override
	protected void initController(Object data) {
	}

}
