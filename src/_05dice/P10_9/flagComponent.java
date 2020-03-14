package _05dice.P10_9;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

public class flagComponent extends JComponent {
    private Color color1;
    private Color color2;
    private Color color3;
    private int xLeft;
    private int yTop;
    private int width;

    public flagComponent(Color c1, Color c2, Color c3, int x, int y, int width) {
        color1 = c1;
        color2 = c2;
        color3 = c3;
        xLeft = x;
        yTop = y;
        this.width = width;
    }

    public void paintComponent(Graphics g) {
        g.setColor(color1);
        g.fillRect(xLeft, yTop, width, width * 2 / 9);
        g.setColor(color2);
        g.fillRect(xLeft, yTop + width * 2 / 9, width, width * 2 / 9);
        g.setColor(color3);
        g.fillRect(xLeft, yTop + width * 4 / 9, width, width * 2 / 9);
    }

}