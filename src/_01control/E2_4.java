package _01control;

import java.util.Scanner;

public class E2_4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Type 1st integer: ");
        int a = in.nextInt();
        System.out.print("Type 2nd integer: ");
        int b = in.nextInt();
        System.out.printf("Sum: %d%n", a+b );
        System.out.printf("Difference: %d%n", a-b );
        System.out.printf("Product: %d%n", a*b );
        System.out.printf("Average: %d%n", (a+b)/2 );
        System.out.printf("Distance: %d%n", Math.abs(a-b) );
        System.out.printf("Maximum: %d%n", Math.max(a,b) );
        System.out.printf("Minimum: %d%n", Math.min(a,b) );
    }
}
