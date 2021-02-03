package abstractFactory.checkboxes.impl;

import abstractFactory.checkboxes.PaintCheckbox;

/**
 * Windows implementation of a paint checkbox.
 */
public class WindowsCheckbox implements PaintCheckbox {

    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox.");
    }
}
