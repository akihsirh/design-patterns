package abstractFactory.checkboxes.impl;

import abstractFactory.checkboxes.PaintCheckbox;

/**
 *  MacOS implementation of a Paint checkbox.
 */
public class MacOSCheckbox implements PaintCheckbox {
    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }
}
