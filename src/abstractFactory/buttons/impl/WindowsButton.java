package abstractFactory.buttons.impl;

import abstractFactory.buttons.PaintButton;

/**
 * Windows implementation of a paint button.
 */
public class WindowsButton implements PaintButton {
    @Override
    public void paint() {
        System.out.println("You have created Windows Button.");
    }
}
