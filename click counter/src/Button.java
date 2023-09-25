import javax.swing.*;
import java.awt.*;

public class Button {
    public JButton button(String text, Font font, Color color,int x, int y, int width, int height){
        JButton button = new JButton();
        button.setText(" + ");
        button.setBounds(x, y, width, height);
        button.setFont(font);
        button.setBackground(color);
        return button;
    }
}
