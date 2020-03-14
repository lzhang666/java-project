package _07streams;

import java.util.Scanner;

public class YodaSpeakRecursive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = in.nextLine();
        String[] senArray = sentence.split(" ");
        YodaRecur(senArray,senArray.length-1);
    }

    public static void YodaRecur(String[] senArray, int idx){
        if(idx == 0){
            System.out.print(senArray[idx]);
        }
        else{
            System.out.print(senArray[idx]+" ");
            YodaRecur(senArray, idx-1);
        }
    }
}
