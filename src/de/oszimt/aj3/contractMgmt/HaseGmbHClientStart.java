package de.oszimt.aj3.contractMgmt;

import de.oszimt.aj3.contractMgmt.view.IView;
import de.oszimt.aj3.contractMgmt.view.console.StartConsole;
import de.oszimt.aj3.contractMgmt.model.HaseGmbHManagement;
import de.oszimt.aj3.contractMgmt.view.gui.StartGUI;

public class HaseGmbHClientStart {
	enum View {GUI, CONSOLE};

	public static void main(String[] args) {
		new HaseGmbHClientStart();
	}


	public HaseGmbHClientStart() {
		IView view = getView(View.CONSOLE); //getView(View.GUI); //

		// connect and start
		HaseGmbHManagement model = new HaseGmbHManagement(view);
		model.getEmployee().loadData();
		model.getCustomer().loadData();
		model.getContract().loadData();
		view.show(model);
	}

	/**
	 * Get the requested view
	 * @param type
	 * @return the requested view
	 */
	private IView getView(View type){
		return switch (type) {
			case CONSOLE -> new StartConsole();
			case GUI -> new StartGUI();
        };
	}

}
