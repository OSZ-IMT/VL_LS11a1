package de.oszimt.ls11a1.view.customer;

import de.oszimt.ls11a1.controller.BaseController;
import de.oszimt.ls11a1.helper.ConsoleHelper;
import de.oszimt.ls11a1.model.customer.Customer;
import de.oszimt.ls11a1.view.IActualView;

public class ViewCustomersConsole implements IActualView {

    @Override
    public void init(BaseController controller, Object... data) {

        //alle Kunden ausgeben
        int count = 0;
        for (Customer c : controller.getModel().getCustomers()){
            System.out.printf("[%2s] %s\n", count, c);
            count++;
        }

        int size = controller.getModel().getCustomers().size();
        ConsoleHelper.printController(controller, "viewMain", size);

        int x = ConsoleHelper.inputInt("Wählen Sie den Kunden",0,size);

        if (x == size){
            controller.getMainController().setController("viewMain");
        } else {
            controller.getMainController().setController("viewCustomer", x);
        }
    }
}
