package factory.creators;

import factory.buttons.Button;

/**
 * Base factory class.
 */
public abstract class Dialog {
    public void renderWindow() {

        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
