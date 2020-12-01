import javax.swing.*;

/** Operates on an instance of a Window. */
public class WindowManager {
    private Window window = Window.getInstance;
    public static WindowManager getInstance = new WindowManager();

    private WindowManager() {}
    public void run() {
        window.isResizable = false;
        window.component = null;
        window.closeOperation = WindowConstants.EXIT_ON_CLOSE;
        window.isVisible = true;
        window.run();
    }
}
