import javax.swing.*;
import java.awt.*;

public class Button {
    private JButton button;
    private Color color;
    private String name;
    private int width;
    private int height;

    public Button(String name, int width, int height, Color color) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.color = color;
        createJButton();
    }

    private void createJButton() {
        button = new JButton(name);
        button.setSize(width, height);
        button.setBackground(color);
    }

    public JButton getButton() {
        return button;
    }
}
