package factory;

import factory.creators.Dialog;
import factory.creators.impl.HtmlDialog;
import factory.creators.impl.WindowsDialog;

/**
 * Where all the magic comes together.
 */
public class FactoryDemo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    /**
     * Choose concrete factory based on environment.
     */
    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    /**
     * Run the business logic of the chosen implementation.
     */
    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
