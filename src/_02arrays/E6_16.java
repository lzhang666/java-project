package _02arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class E6_16 {
    public static void main(String[] args) {

        //1) enter the size of the array
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = in.nextInt();
        int[] arr = new int[size];

        //2) enter each element into the array
        System.out.println("Enter the elements of the array, separated by space");
        for (int i = 0; i < size; i++) {
            int element = in.nextInt();
            arr[i] = element;
        }
        //System.out.println(Arrays.toString(arr));

        //3) find the maximum value in the array
        int maxVal = arr[0];
        for (int i = 0; i <size; i++) {
            if(maxVal < arr[i])
                maxVal = arr[i];
        }
        //System.out.println("The max value is: " + maxVal);


        //4) create a string array with each entry includes the representation of stars and spaces
        String[] starsArr = new String[size];
        for (int i = 0; i < size; i++) {
            //number of the stars
            int starsNum = arr[i]*20/maxVal;
            //number of spaces
            int spaceNum = 20 - starsNum;

            //initialize string
            starsArr[i] = "";
            //adding stars
            for (int j = 0; j < starsNum; j++) {
                starsArr[i] += "*";
            }
            //adding spaces
            for (int k = 0; k < spaceNum; k++) {
                starsArr[i] += " ";
            }
        }
        //System.out.println(Arrays.toString(starsArr));

        //5)print out histogram vertically
        //starting from the last character of the string
        for (int i = 19; i >= 0 ; i--) {
            for (int j = 0; j < size; j++) {
                System.out.print(starsArr[j].charAt(i));
            }
            System.out.println();
        }
    }
}
