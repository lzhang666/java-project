package _07streams;

/*
Write a lambda expression for a function that turns a string into a string made of the first letter,
three periods, and the last letter, such as "W...d". (Assume the string has at least two letters.)
Then write a program that reads words into a stream, applies the lambda expression to each element,
and prints the result. Filter out any words with fewer than two letters.
 */

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class E19_7 {
    public static void main(String[] args) {
        String[] names = {"Fred", "S", "Ida", "Alice", "Abe"};
        Stream<String> words = Stream.of(names);
        List<String> wordMod = words
                                .filter(w -> w.length() >= 2)
                                .map(w -> w.substring(0,1)+"..."+w.substring(w.length()-1))
                                .collect(Collectors.toList());
        System.out.println(wordMod);
    }
}
