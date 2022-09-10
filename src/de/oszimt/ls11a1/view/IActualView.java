package de.oszimt.ls11a1.view;

import de.oszimt.ls11a1.controller.BaseController;
import de.oszimt.ls11a1.controller.MainController;

public interface IActualView {

    /**
     * Launch the application  and apply the controller     *
     * @param controller, actual controller
     */
    public void init(BaseController controller);

    /**
     * Launch the application  and apply the controller     *
     * @param controller, actual controller
     * @param data, special data
     */
    public void init(BaseController controller, Object data);
}
