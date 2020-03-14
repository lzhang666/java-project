package _07streams;

import java.util.Scanner;

public class YodaSpeak {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = in.nextLine();
        String[] senArray = sentence.split(" ");
        for (int i = senArray.length - 1; i >= 0 ; i--) {
            System.out.print(senArray[i]+" ");
        }
    }
}
