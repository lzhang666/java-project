package _04interfaces.E9_13;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the x and y coordinates of the top left corner of the rectangle: ");
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.println("Enter the width and height of the rectangle: ");
        int width = in.nextInt();
        int height = in.nextInt();
        BetterRectangle box1 = new BetterRectangle(x, y, width, height);

        System.out.println("The perimeter of the rectangle is: "+box1.getPerimeter());
        System.out.println("The area of the rectangle is: "+box1.getArea());
    }
}
