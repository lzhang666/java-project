package _01control;

import java.util.Scanner;

public class E2_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input measurement in meters: ");
        int metric = in.nextInt();

        double metricToMile = 0.000621371192237 * metric;
        int mile = (int) Math.floor(metricToMile);

        double mileToFeet = 5280 * (metricToMile - mile);
        int feet = (int) Math.floor(mileToFeet);

        double feetToIn = 12 * (mileToFeet - feet);
        int inch = (int) Math.floor(feetToIn);

        System.out.printf("It converts to %d miles, %d feet, %d inches %n", mile, feet, inch);
    }
}
