package _07streams;



//citation: https://stackoverflow.com/questions/1779850/java-recursion-phone-number-letters


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;



public class P13_3 {
    public static void main(String[] args) throws IOException {

        String[][] letters = {{"0"},
                {"1"},
                {"A", "B", "C"},
                {"D", "E", "F"},
                {"G", "H", "I"},
                {"J", "K", "L"},
                {"M", "N", "O"},
                {"P", "Q", "R", "S"},
                {"T", "U", "V"},
                {"W", "X", "Y", "Z"}};
        Scanner in = new Scanner(System.in);

        String dictFile = "/usr/share/dict/words";
        Stream<String> words = Files.lines(Paths.get(dictFile));
        Set<String> dict = new HashSet<>();
        words.parallel().forEach(w->{
            if(w.length()>1){
                dict.add(w.toUpperCase());
            }
        });

        System.out.print("Enter the number: ");
        int num = in.nextInt();
        System.out.println("The possible spellings are: ");

        //numToWord(Integer.toString(num), letters);
        restOfNum2(Integer.toString(num), letters, "", dict);
    }

    //get all combination
    private static void restOfNum2(String num, String[][] letters, String word, Set<String> dict) {
        if (num.length() == 0){
            if (isWord(word, dict))
                System.out.println(word);
        }
        else{
            for (int i = 0; i < num.length(); i++) {
                int index = Integer.parseInt(num.substring(i, i+1));
                String[] letterList = letters[index];

                for (int j = 0; j < letterList.length; j++) {
                    String res = word + letterList[j];
                    restOfNum2(num.substring(1), letters, res, dict);

                }
                return;
            }
        }
    }

    //check if word exists
    private static boolean isWord(String spelling, Set<String> dict){
        if (dict.contains(spelling)){
            return true;
        }
        return false;
    }



}