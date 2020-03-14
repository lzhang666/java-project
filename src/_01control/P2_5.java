package _01control;

import java.util.Scanner;

public class P2_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input ten digits phone number:");
        String numPhone = in.next();
        String aCode = numPhone.substring(0,3);
        String aCode2 = "(" + aCode + ")";
        String num1 = numPhone.substring(3,6);
        String num2 = numPhone.substring(6,10);

        System.out.println(aCode2+num1+"-"+num2);

    }
}
