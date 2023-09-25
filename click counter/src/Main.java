import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Main implements ActionListener{
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JLabel label = new JLabel();
    Font font = new Font("SAN_SERIF", Font.BOLD, 30);

//    default value
    int count = 0;
    Main(){
        frame.setLayout(null);
        panel.setBackground(Color.darkGray);
        panel.setBounds(0, 0, 420, 720);
        frame.add(panel);
        panel.setLayout(null);

//        output
        countAmount(count);
        increment();

        frame.setSize(420, 720);
        frame.setTitle("Simple java application");
        frame.getContentPane().setBackground(Color.darkGray);
        frame.getContentPane().setFont(font);

        frame.setResizable(false);
        frame.setVisible(true);
    }
    public static void main(String[] args){
        new Main();
    }


    public void actionPerformed(ActionEvent e) {
        System.out.println(e);
    }

    public void countAmount (int count){
        label.setText(String.valueOf(count));
        label.setBounds(160, 220, 150, 100);
        label.setForeground(Color.white);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        label.setFont(new Font("poppins", Font.BOLD, 50));
        panel.add(label);
    }

    public void increment(){
        Button btnObj = new Button();
       panel.add(btnObj.button("+", font, Color.orange, 120, 340, 50, 50));
    }

    public void decrement(){

    }


}