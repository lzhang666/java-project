package _03objects.P8_7;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] input = new int[3];
        System.out.println("Enter 3 combination numbers in the range from 0 to 39, separated by space: ");
        for (int i = 0; i < 3; i++)
            input[i] = in.nextInt();

        ComboLock lock = new ComboLock(input[0],input[1],input[2]);
        lock.reset();

        System.out.println("The dial is now reset to "+lock.getDial());

        System.out.print("1) Enter the number of ticks turing right: ");
        int firstTurn = in.nextInt();
        lock.turnRight(firstTurn);
        System.out.println("The dial is now at "+lock.getDial());

        System.out.print("2) Enter the number of ticks turing left: ");
        int secondTurn = in.nextInt();
        lock.turnLeft(secondTurn);
        System.out.println("The dial is now at "+lock.getDial());

        System.out.print("3) Enter the number of ticks turing right: ");
        int thirdTurn = in.nextInt();
        lock.turnRight(thirdTurn);
        System.out.println("The dial is now at "+lock.getDial());

        if(lock.open())
            System.out.println("The combination is correct. The lock is open.");
        else
            System.out.println("The input does not match the combination.");

    }
}
