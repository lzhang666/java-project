package _05dice.P10_10;

import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Color;


public class ringComponent extends JComponent {
    /*
    Write a program that displays the Olympic rings. Color the rings in the Olympic colors.
    Provide a method drawRing that draws a ring of a given position and color.
     */
    private int xLeft;
    private int yTop;
    private int width;

    public ringComponent(int x, int y, int w){
        xLeft = x;
        yTop = y;
        width = w;
    }

    public void paintComponent(Graphics g){
        drawRing(g, Color.blue, xLeft, yTop, width);
        drawRing(g, Color.black, xLeft+width, yTop, width);
        drawRing(g, Color.red, xLeft+width*2, yTop, width);
        drawRing(g, Color.yellow, xLeft+width/2, yTop+width/2, width);
        drawRing(g, Color.green, xLeft+width*3/2, yTop+width/2, width);
    }

    void drawRing(Graphics g, Color c, int xLeft, int yTop, int width){
        g.setColor(c);
        g.drawOval(xLeft,yTop,width,width);
    }

}
