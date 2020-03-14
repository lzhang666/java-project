package _02arrays;
import java.util.Scanner;

public class P5_8 {

    public static boolean isLeapYear(int year){
        boolean isLeap = false;
        //case 1: divisible by 4 but not by 100
        if (year % 4 == 0 && year % 100 != 0){
            isLeap = true;
        }
        //case 2: divisible by 400
        else if(year % 400 == 0){
            isLeap = true;
        }
        return isLeap;
    }


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a Year:");
        int year = inp.nextInt();
        if (isLeapYear(year)){
            System.out.println(year+" is a leap year");
        }
        else{
            System.out.println(year+" is not a leap year");
        }

    }
}
