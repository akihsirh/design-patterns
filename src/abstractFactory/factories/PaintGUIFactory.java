package abstractFactory.factories;

import abstractFactory.buttons.PaintButton;
import abstractFactory.checkboxes.PaintCheckbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface PaintGUIFactory {
    PaintButton createButton();
    PaintCheckbox createCheckbox();
}
