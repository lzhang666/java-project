package _01control;

import java.util.Scanner;

public class P3_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a year: ");
        int year = in.nextInt();
        boolean isLeap = false;

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            isLeap =true;
        }

        if(isLeap){
            System.out.printf("%d is a leap year", year);
        }
        else{
            System.out.printf("%d is not a leap year", year);
        }

    }
}
