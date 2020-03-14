package _05dice.how_to_1;


import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import java.util.Random;


public class ItalianFlagComponent extends JComponent {
    public void paintComponent(Graphics g)
    {
        drawItalianFlag(g, 10, 10, 100);
        drawItalianFlag(g, 10, 100, 150);
        g.setColor(Color.YELLOW);
        g.fillOval(10, 10, 30, 30);
    }
        /**
         Draws an Italian flag at the given location and size.
         @param g the graphics object
         @param xLeft the x coordinate of the top left corner
         @param yTop the y coordinate of the top left corner
         @param width the width of the flag
         */
    void drawItalianFlag(Graphics g, int xLeft, int yTop, int width)
    {
        Random rand = new Random();
        g.setColor(new Color(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255)));
        g.fillRect(xLeft, yTop, width / 3, width * 2 / 3);
        g.setColor(new Color(255,255,255,255));
        g.fillRect(xLeft + 2 * width / 3, yTop, width / 3, width * 2 / 3);
        g.setColor(Color.BLACK);
        g.drawLine(xLeft + width / 3, yTop, xLeft + width * 2 / 3, yTop);
        g.drawLine(xLeft + width / 3, yTop + width * 2 / 3,
                xLeft + width * 2 / 3, yTop + width * 2 / 3);
    }
}
