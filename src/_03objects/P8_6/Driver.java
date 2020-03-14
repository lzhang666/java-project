package _03objects.P8_6;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the fuel efficiency in miles/gallon: ");
        int efficiency = in.nextInt();
        System.out.print("Enter the amount of fuel in gallons added to the tank: ");
        int fuelAdd = in.nextInt();
        System.out.print("Enter the miles to be driven: ");
        int miles = in.nextInt();

        Car myHybrid = new Car(efficiency);
        myHybrid.addGas(fuelAdd);
        myHybrid.drive(miles);
        System.out.println("The current gas level is "+myHybrid.getGasLevel()+" gallons");
    }
}
