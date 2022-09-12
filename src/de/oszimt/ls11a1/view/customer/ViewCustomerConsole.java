package de.oszimt.ls11a1.view.customer;

import de.oszimt.ls11a1.controller.BaseController;
import de.oszimt.ls11a1.helper.ConsoleHelper;
import de.oszimt.ls11a1.model.customer.Customer;
import de.oszimt.ls11a1.view.IActualView;

public class ViewCustomerConsole implements IActualView {

    @Override
    public void init(BaseController controller) {
    }

    @Override
    public void init(BaseController controller, Object data) {
        Customer c = controller.getModel().getCustomers().get((int) data);

        System.out.println(c);

        //generate the menu
        String[] menuAry = {"viewCustomers","viewMain"};
        for (int i = 0; i< menuAry.length;i++) {
            ConsoleHelper.printController(controller, menuAry[i], i);
        }

        int x = ConsoleHelper.inputInt("Was wollen Sie tun?",0,menuAry.length-1);
        controller.getMainController().setController(menuAry[x]);
    }
}
