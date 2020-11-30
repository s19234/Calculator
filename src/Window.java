import javax.swing.*;
import java.awt.*;

public class Window {
    protected int width;
    protected int height;

    public boolean isResizable;
    /** Should only be used with WindowsConstants or any other interface
     hat supports closing operation on JFrame window. */
    public int closeOperation;
    public boolean isVisible;

    /** Should be null if desired position is center of the screen. */
    public Component component;
    public static Window getInstance = new Window(600, 400);

    private JFrame frame;

    protected Window() {}

    private Window(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void run() {
        frame = new JFrame();
        frame.setSize(width, height);
        frame.setResizable(isResizable);
        frame.setLocationRelativeTo(component);
        frame.setDefaultCloseOperation(closeOperation);
        frame.setVisible(isVisible);
    }
}
