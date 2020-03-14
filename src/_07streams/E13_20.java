package _07streams;

/*
Given an integer price, list all possible ways of paying for it with $100, $20, $5, and $1 bills,
using recursion. Don’t list duplicates.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class E13_20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int num = in.nextInt();
        ArrayList<Integer> billList = new ArrayList<>();
        System.out.println("The minimum number of bills for $" + num + " is: ");
        System.out.println(payment100D(num, billList).toString());

    }

    //$1 representation recursion
    public static ArrayList<Integer> payment1D(int n, ArrayList<Integer> billList){
        if (n == 0) return billList;
        billList.add(1);
        return payment1D(n - 1, billList);
    }

    //$5 representation recursion
    public static ArrayList<Integer> payment5D(int n, ArrayList<Integer> billList){
        //if (n == 0) return billList;
        if (n < 5) return payment1D(n, billList);
        billList.add(5);
        return payment5D(n - 5, billList);
    }

    //$20 representation recursion
    public static ArrayList<Integer> payment20D(int n, ArrayList<Integer> billList){
        //if (n == 0) return billList;
        if (n < 20) return payment5D(n, billList);
        billList.add(20);
        return payment20D(n - 20, billList);
    }

    //$100 representation recursion
    public static ArrayList<Integer> payment100D(int n, ArrayList<Integer> billList){
        //if (n == 0) return billList;
        if (n < 100) return payment20D(n, billList);
        billList.add(100);
        return payment100D(n - 100, billList);
    }

}
