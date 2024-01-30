package Playground.buttons;

import javax.swing.*;
import java.awt.*;

public class BoxLayout1 {

    public static void main(String[] args) {
        BoxLayout1 gui = new BoxLayout1();
        gui.go();
    }
    public void go() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JButton button = new JButton("Shock me");
        JButton button2 = new JButton("Bliss");
        JButton button3 = new JButton("huh?");
        panel.add(button);
        panel.add(button2);
        panel.add(button3);
        panel.setBackground(Color.darkGray);
        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.setSize(250, 200);
        frame.setVisible(true);
    }
}
