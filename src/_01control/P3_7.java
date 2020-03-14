package _01control;

import java.util.Scanner;

public class P3_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the income: $");

        int income = in.nextInt();

        double tax = 0.0;

        if(income <= 50000 ){
            tax = 0.01*50000;
        }
        else if(income > 50000 && income <= 75000){
            double tax1 = 0.01*50000;
            double tax2 = 0.02*(income - 50000);
            tax = tax1+tax2;
        }
        else if(income > 75000 && income <= 100000){
            double tax1 = 0.01*50000;
            double tax2 = 0.02*(75000 - 50000);
            double tax3 = 0.03*(income - 75000);
            tax = tax1+tax2+tax3;
        }
        else if(income > 100000 && income <= 250000){
            double tax1 = 0.01*50000;
            double tax2 = 0.02*(75000 - 50000);
            double tax3 = 0.03*(100000 - 75000);
            double tax4 = 0.04*(income - 100000);
            tax = tax1+tax2+tax3+tax4;
        }
        else if(income > 250000 && income <= 500000){
            double tax1 = 0.01*50000;
            double tax2 = 0.02*(75000 - 50000);
            double tax3 = 0.03*(100000 - 75000);
            double tax4 = 0.04*(250000 - 100000);
            double tax5 = 0.05*(income - 250000);
            tax = tax1+tax2+tax3+tax4+tax5;
        }
        else if(income > 500000){
            double tax1 = 0.01*50000;
            double tax2 = 0.02*(75000 - 50000);
            double tax3 = 0.03*(100000 - 75000);
            double tax4 = 0.04*(250000 - 100000);
            double tax5 = 0.05*(500000 - 250000);
            double tax6 = 0.06*(income - 250000);
            tax = tax1+tax2+tax3+tax4+tax5+tax6;
        }
        System.out.print("The total income tax is: $");
        System.out.println(tax);
    }
}
