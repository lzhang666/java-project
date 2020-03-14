package _01control;

import java.util.Scanner;

public class E4_1d {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input lower bound: ");
        int a = in.nextInt();
        System.out.print("Input lower bound: ");
        int b = in.nextInt();
        int oddSum = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                oddSum += i;
            }
        }
        System.out.println(oddSum);
    }
}
