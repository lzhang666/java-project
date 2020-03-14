package _01control;

import java.util.Scanner;

public class E4_1e {
    public static void main(String[] args) {
        //5)
        Scanner str = new Scanner(System.in);
        System.out.print("Input : ");
        String strNum = str.next();
        int OddDSum = 0;

        for (int i = 0; i < strNum.length(); i++) {
            String temp;
            int temp2;
            temp = strNum.charAt(i) + "";
            temp2 = Integer.parseInt(temp);
            if(temp2%2 != 0){
                OddDSum += temp2;
            }
        }
        System.out.println(OddDSum);
    }
}
