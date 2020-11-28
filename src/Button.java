import javax.swing.*;
import java.awt.*;

public class Button {
    private JButton button;
    private Color color;
    private String name;
    private int width;
    private int height;

    public Button(String name, int width, int height) {
        this.name = name;
        this.width = width;
        this.height = height;
        createJButton();
    }

    private void createJButton() {

    }
}
