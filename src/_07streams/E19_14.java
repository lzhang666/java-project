package _07streams;

/*
Read all words from a file into an ArrayList<String>, then turn it into a parallel stream.
Use the dictionary file words.txt provided with the book’s companion code.
Use filters and the findAny method to find any palindrome that has at least five letters,
then print the word. What happens when you run the program multiple times?

Parellel stream - you can use this txt version of War and Peace
-> https://archive.org/stream/warandpeace030164mbp/warandpeace030164mbp_djvu.txt
 */


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class E19_14 {
    public static void main(String[] args) throws IOException {
        String filename = "/Users/lizhang/projava/src/_07streams/war_and_peace.txt";
        List<String> words = new ArrayList<>();
        try(Stream<String> lines = Files.lines(Paths.get(filename))) {
            lines.forEach(w -> {
                String[] tempWords = w.split(" ");
                words.addAll(Arrays.asList(tempWords));
            });
            Stream<String> wordsCandidate = words.stream();
            String result = wordsCandidate
                    .parallel()
                    .filter(w -> w.length()>=5)
                    .filter(w -> isPal(w))
                    .findAny()
                    .orElse("Not Found");
            System.out.println("Palindrome found: " + result);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public static boolean isPal(String word){
        if(word.length() == 0 || word.length() == 1){
            return true;
        }
        else if(word.substring(0,1).equals(word.substring(word.length()-1))){
            return isPal(word.substring(1,word.length()-1));
        }
        return false;
    }
}

