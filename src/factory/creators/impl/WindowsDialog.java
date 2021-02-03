package factory.creators.impl;

import factory.buttons.Button;
import factory.buttons.impl.WindowsButton;
import factory.creators.Dialog;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
