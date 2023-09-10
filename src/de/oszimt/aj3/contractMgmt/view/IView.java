package de.oszimt.aj3.contractMgmt.view;

import de.oszimt.aj3.contractMgmt.model.HaseGmbHManagement;

public interface IView {

    /**
     * Display this view
     * @param model, datamodel
     */
    void show(HaseGmbHManagement model);

    /**
     * Display an error message
     * @param mess, Message to display
     */
    void showError(String mess);

}
