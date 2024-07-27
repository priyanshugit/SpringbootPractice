package Lambda_Expression;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow {
    public static void main(String[] args) {
        //window : object Jframe
        JFrame frame = new JFrame("My Window");
        frame.setSize(400, 400);
        frame.setLayout(new FlowLayout());

        //create Button and add jframe
        JButton button = new JButton("Click Me !!");
        //implementation using anonymous class
//        button.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Button clicked");
//                JOptionPane.showMessageDialog(null,"Hey button clicked");
//            }
//        });
        button.addActionListener(e->{
            System.out.println("Button clicked");
            JOptionPane.showMessageDialog(null,"Hey button clicked");
        });

        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
