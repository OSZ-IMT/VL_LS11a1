package de.oszimt.aj3.contractMgmt.view.console;

import de.oszimt.aj3.contractMgmt.model.HaseGmbHManagement;
import de.oszimt.aj3.contractMgmt.model.contract.Contract;
import de.oszimt.aj3.contractMgmt.model.customer.Customer;
import de.oszimt.aj3.contractMgmt.model.employee.Employee;
import de.oszimt.aj3.contractMgmt.view.IView;

public class StartConsole implements IView {

    @Override
    public void show(HaseGmbHManagement model) {
        System.out.println(" list of the test-employees:");
        for (Employee e : model.getEmployee().getAll()) {
            System.out.println(e);
        }
        System.out.println("-------------------------------\n");
        System.out.println(" list of the test-customers:");
        for (Customer c : model.getCustomer().getAll()) {
            System.out.println(c);
        }
        System.out.println("-------------------------------\n");

        System.out.println(" list of the test-contracts:");
        for (Contract c : model.getContract().getAll()) {
            System.out.println(c);
        }
    }

    @Override
    public void showError(String mess) {
        Throwable t = new Throwable();
        System.err.println(mess+" : "+t.getStackTrace()[1] + "/"+t.getStackTrace()[2]);
    }
}
