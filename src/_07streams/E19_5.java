package _07streams;


/*
Write a method

public static <T> String toString(Stream<T> stream, int n)
that turns a Stream<T> into a comma-separated list of its first n elements.
 */


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class E19_5 {
    public static void main(String[] args) {
        String[] names = {"Fred", "Sam", "Ida", "Alice", "Abe"};
        Stream<String> stream1 = Stream.of(names);
        Integer[] nums = {1, 2, 3, 4, 5};
        Stream<Integer> stream2 = Stream.of(nums);
        System.out.println(toString(stream1,2));
        System.out.println(toString(stream2,2));
    }

    public static <T> String toString(Stream<T> stream, int n){
        String result = stream.map(w -> w.toString()).limit(n).collect(Collectors.joining(","));
        return result;
    }

}
