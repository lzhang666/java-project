package _02arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class E6_12 {

    public static void main(String[] args) {
        //initialize an array with 20 integers
        Random rand = new Random();
        int[] arr = new int[20];

        //fill array w/ random ints from 0 to 99
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        System.out.println("Randomly generated array:");
        System.out.println(Arrays.toString(arr));

        //implement sort method from library
        Arrays.sort(arr);
        System.out.println("After sorting:");
        System.out.println(Arrays.toString(arr));
    }
}
