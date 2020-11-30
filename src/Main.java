import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Window window = Window.getInstance;
        window.isResizable = false;
        window.component = null;
        window.closeOperation = WindowConstants.EXIT_ON_CLOSE;
        window.isVisible = true;
        window.run();
    }
}
