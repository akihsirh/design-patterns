package abstractFactory.factories.impl;

import abstractFactory.buttons.PaintButton;
import abstractFactory.buttons.impl.WindowsButton;
import abstractFactory.checkboxes.PaintCheckbox;
import abstractFactory.checkboxes.impl.WindowsCheckbox;
import abstractFactory.factories.PaintGUIFactory;

/**
 * Factory for Windows GUI.
 */
public class WindowsGUIFactory implements PaintGUIFactory {
    @Override
    public PaintButton createButton() {
        return new WindowsButton();
    }

    @Override
    public PaintCheckbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
