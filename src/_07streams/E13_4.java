package _07streams;

/*
Write a recursive method for computing a string with the binary digits of a number.
If n is even, then the last digit is 0. If n is odd, then the last digit is 1.
Recursively obtain the remaining digits.
 */

import java.util.Scanner;

public class E13_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int num = in.nextInt();
        System.out.print("The binary representation of " + num + " is: " );
        System.out.println(binaryRep(num));
    }

    public static String binaryRep(int n){
        if (n == 0) return "0";
        if (n == 1) return "1";
        return binaryRep(n/2) + Integer.toString(n%2);

    }

}
