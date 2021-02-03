package abstractFactory.app;

import abstractFactory.buttons.PaintButton;
import abstractFactory.checkboxes.PaintCheckbox;
import abstractFactory.factories.PaintGUIFactory;

/**
 * Client code using the factory
 */
public class Application {
    private PaintButton button;
    private PaintCheckbox checkbox;

    public Application(PaintGUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
