package _05dice.pig;

import javax.swing.*;

public class PigDriver {

    public static void main(String[] args) {
        //pig game here
        JFrame frame = new JFrame("Pig");
        frame.setContentPane(new Pig().mPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(600,400);
        frame.setVisible(true);
    }
}
