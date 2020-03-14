package _04interfaces.E9_13;

/*
The Rectangle class of the standard Java library does not supply a method to
compute the area or the perimeter of a rectangle. Provide a subclass BetterRectangle
of the Rectangle class that has getPerimeter and getArea methods. Do not add any instance variables.
In the constructor, call the setLocation and setSize methods of the Rectangle class.
Provide a program that tests the methods that you supplied.
 */

import java.awt.*;

public class BetterRectangle extends Rectangle {

    public BetterRectangle(){
        super.setLocation(0, 0);
        super.setSize(0, 0);
    }


    public BetterRectangle(int x, int y, int width, int height){
        super.setLocation(x, y);
        super.setSize(width, height);
    }

    public int getPerimeter(){
        return width*2+height*2;
    }

    public int getArea(){
        return width*height;
    }


}
