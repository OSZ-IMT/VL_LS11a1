package de.oszimt.aj3.contractMgmt.view.gui;

import de.oszimt.aj3.contractMgmt.model.HaseGmbHManagement;
import de.oszimt.aj3.contractMgmt.view.IView;

import javax.swing.*;

public class StartGUI implements IView {

    @Override
    public void show(HaseGmbHManagement model) {
        showError("Nicht implementiert");
    }

    @Override
    public void showError(String mess) {
        JOptionPane.showMessageDialog(null, mess, "Fehler aufgetreten", JOptionPane.ERROR_MESSAGE);
    }
}
