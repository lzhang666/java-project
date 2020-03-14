package _03objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        /*
        Scanner in = new Scanner(System.in);
        int[] arr = new int[3];

        for (int i = 0; i < 3; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
         */
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);

        System.out.println(nums.get(0));


    }
}
