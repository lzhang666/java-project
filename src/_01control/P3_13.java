package _01control;

import java.util.Scanner;

public class P3_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the number: ");
        int num = in.nextInt();

        int digit1 = num % 10;

        int digit10 = num / 10 % 10;

        int digit100 = num/100 % 10;

        int digit1000 = num/1000;


        String greek1000 = "";
        while (digit1000>0){
            greek1000 += "M";
            digit1000--;
        }

        String greek100 = "";
        if (digit100<4){
            while (digit100>0){
                greek100 += "C";
                digit100--;
            }
        }
        else if (digit100==4){
            greek100 = "CD";
        }
        else if (digit100>4 && digit100<9){
            int counter = digit100%5;
            greek100 = "D";
            while (counter>0){
                greek100 += "C";
                counter--;
            }
        }
        else if (digit100==9){
            greek100 = "CM";
        }


        String greek10 = "";
        if (digit10<4){
            while (digit10>0){
                greek10 += "X";
                digit10--;
            }
        }
        else if (digit10==4){
            greek10 = "XL";
        }
        else if (digit10 >4 && digit10< 9){
            int counter = digit10 % 5;
            greek10 = "L";
            while (counter>0){
                greek10 += "X";
                counter--;
            }
        }
        else if (digit10==9) greek10 = "XC";

        String greek1 = "";
        if (digit1<4){
            while (digit1>0){
                greek1 += "I";
                digit1--;
            }
        }
        else if (digit1==4){
            greek1 = "IV";
        }
        else if (digit1 >4 && digit1< 9){
            int counter = digit1 % 5;
            greek1 = "V";
            while (counter>0){
                greek1 += "I";
                counter--;
            }
        }
        else if (digit1==9) greek1 = "IX";

        String ans = greek1000+greek100+greek10+greek1;
        System.out.println(ans);
    }
}
