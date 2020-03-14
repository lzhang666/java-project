package _03objects.P8_5;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter can height: ");
        int height = in.nextInt();
        System.out.print("Enter can radius: ");
        int radius = in.nextInt();

        SodaCan someCan = new SodaCan(height, radius);
        double surfA = someCan.getSurfaceArea();
        double vol = someCan.getVolume();

        System.out.println("the can surface area is: "+(int)surfA+", and the can volume is: "+(int)vol);

    }
}
