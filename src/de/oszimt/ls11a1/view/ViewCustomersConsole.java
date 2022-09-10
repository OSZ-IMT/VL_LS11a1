package de.oszimt.ls11a1.view;

import de.oszimt.ls11a1.controller.BaseController;
import de.oszimt.ls11a1.model.Customer;

public class ViewCustomersConsole implements IActualView{

    @Override
    public void init(BaseController controller) {

        int size = controller.getModel().getCustomers().size();

        for(int i=0; i<size; i++) {
            Customer c = controller.getModel().getCustomers().getCustomer(i);
            System.out.printf("[%2s] %s, %s\n",c.getCustomerID(), c.getLastname(), c.getFirstname());
        }

        ConsoleHelper.printController(controller, "viewMain", size);

        int x = ConsoleHelper.inputInt("Wählen Sie den Kunden",0,size);

        if (x == size){
            controller.getMainController().setController("viewMain");
        } else {
            controller.getMainController().setController("viewCustomer",x);
        }
    }

    @Override
    public void init(BaseController controller, Object data) {
    }
}
