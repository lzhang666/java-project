package _05dice.P11_9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class drawCircle {
    /*
    Write a program that allows the user to specify a circle with two mouse presses,
    the first one on the center and the second on a point on the periphery.

    Hint: In the mouse press handler, you must keep track of whether you already
    received the center point in a previous mouse press.
     */

    private JPanel mPanel;
    private ArrayList<Point> pointClicked = new ArrayList<>();


    public static void main(String[] args) {
        JFrame frame = new JFrame("drawCircle");
        frame.setContentPane(new drawCircle().mPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(600,600);
        frame.setVisible(true);
    }

    public drawCircle() {
        mPanel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                pointClicked.add(e.getPoint());

                if (pointClicked.size() == 2){
                    double deltaX = Math.abs(pointClicked.get(0).getX() - pointClicked.get(1).getX());
                    double deltaY = Math.abs(pointClicked.get(0).getY() - pointClicked.get(1).getY());
                    double radius = Math.sqrt(Math.pow(deltaX,2) + Math.pow(deltaY,2));
                    int centerX = pointClicked.get(0).x-(int)radius;
                    int centerY = pointClicked.get(0).y-(int)radius;
                    mPanel.getGraphics().drawOval(centerX, centerY, (int)radius*2, (int)radius*2);
                    pointClicked.clear();
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }
}
