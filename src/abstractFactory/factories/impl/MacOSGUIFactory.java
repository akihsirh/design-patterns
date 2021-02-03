package abstractFactory.factories.impl;

import abstractFactory.buttons.PaintButton;
import abstractFactory.buttons.impl.MacOSButton;
import abstractFactory.checkboxes.PaintCheckbox;
import abstractFactory.checkboxes.impl.MacOSCheckbox;
import abstractFactory.factories.PaintGUIFactory;

/**
 * Factory for MAC OS GUI.
 */
public class MacOSGUIFactory implements PaintGUIFactory {

    @Override
    public PaintButton createButton() {
        return new MacOSButton();
    }

    @Override
    public PaintCheckbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
