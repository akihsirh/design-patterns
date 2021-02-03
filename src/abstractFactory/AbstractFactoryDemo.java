package abstractFactory;

import abstractFactory.app.Application;
import abstractFactory.factories.PaintGUIFactory;
import abstractFactory.factories.impl.MacOSGUIFactory;
import abstractFactory.factories.impl.WindowsGUIFactory;

/**
 * Where all the magic comes together.
 */
public class AbstractFactoryDemo {
    private static Application configureApplication() {
        Application app;
        PaintGUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSGUIFactory();
            app = new Application(factory);
        } else {
            factory = new WindowsGUIFactory();
            app = new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
