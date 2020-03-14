package _06design;

import java.util.ArrayList;
import java.util.Random;

public class test {
    public static void main(String[] args) {
//        Random rand = new Random();
//        for (int i = 0; i < 100; i++) {
//            int num1 = rand.nextInt(10);
//            int num2 = rand.nextInt(10-num1);
//            System.out.println(num1+"+"+num2+"="+(num1+num2));
//        }

        ArrayList<Integer> num = new ArrayList<>();
        num.add(2);
        num.add(3);
        System.out.println(num.indexOf(3));
        num.remove(0);
        System.out.println(num.get(0));
    }
}
