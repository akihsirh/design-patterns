package factory.creators.impl;

import factory.buttons.Button;
import factory.buttons.impl.HtmlButton;
import factory.creators.Dialog;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
