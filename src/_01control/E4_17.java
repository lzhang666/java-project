package _01control;

import java.util.Scanner;

public class E4_17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input integer: ");
        int num = in.nextInt();

        System.out.println("The binary output is: ");
        while(num > 0){
            int out = num % 2;
            num /= 2;
            System.out.println(out);
        }
    }
}
