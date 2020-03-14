package _05dice.P10_9;


import javax.swing.*;
import java.awt.Color;
import java.awt.FlowLayout;

public class flagViewer {
    public static void main(String[] args) {
        JFrame frame1 = new JFrame();
        JFrame frame2 = new JFrame();

        frame1.setSize(300,300);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setLayout(new FlowLayout());

        frame2.setSize(300,300);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JComponent germanFlag = new flagComponent(Color.BLACK, Color.RED, Color.YELLOW,50,50,200);
        JComponent hungarianFlag = new flagComponent(Color.RED, Color.WHITE, Color.GREEN, 50,50,200);


        frame1.add(germanFlag);
        frame2.add(hungarianFlag);


        frame1.setVisible(true);
        frame2.setVisible(true);
    }
}
