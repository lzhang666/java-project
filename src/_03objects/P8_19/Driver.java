package _03objects.P8_19;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the starting angle in degrees: ");
        double angle = in.nextDouble();
        System.out.print("Enter the initial velocity: ");
        double initVel = in.nextDouble();
        Canonball ball1 = new Canonball(0);
        ball1.shoot(angle, initVel);



    }
}
