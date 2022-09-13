package de.oszimt.ls11a1.view.customer;

import de.oszimt.ls11a1.controller.BaseController;
import de.oszimt.ls11a1.controller.customer.RemoveCustomerController;
import de.oszimt.ls11a1.helper.ConsoleHelper;
import de.oszimt.ls11a1.model.customer.Customer;
import de.oszimt.ls11a1.view.IActualView;

public class RemoveCustomerConsole implements IActualView {

    @Override
    public void init(BaseController controller) {

        int size = controller.getModel().getCustomers().size();

        for(int i=0; i<size; i++) {
            Customer c = controller.getModel().getCustomers().get(i);
            System.out.printf("[%2s] %s\n",c.getCustomerID(), c);
        }

        ConsoleHelper.printController(controller, "viewMain", size);

        int x = ConsoleHelper.inputInt("Wählen Sie den zu löschenden Kunden",0,size);

        if (x != size){
            ((RemoveCustomerController)controller).removeCustomer(x);
            System.out.printf("Kunde %s gelöscht.\n",x);
        }

        controller.getMainController().setController("viewMain");
    }

    @Override
    public void init(BaseController controller, Object... data) {
    }
}
