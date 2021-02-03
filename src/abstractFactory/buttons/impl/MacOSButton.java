package abstractFactory.buttons.impl;

import abstractFactory.buttons.PaintButton;

/**
 * MacOS implementation of a Paint button
 */
public class MacOSButton implements PaintButton {
    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}
