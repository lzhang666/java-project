package _05dice.P10_10;

import javax.swing.*;


public class ringViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setSize(300,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JComponent ring = new ringComponent(40,40,70);
        frame.add(ring);

        frame.setVisible(true);
    }
}
