package _07streams;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//        int b = smallest(arr);
//        String str = "what";
//        System.out.println(str.charAt(0));
        String[] names = {"Fred", "Sam", "Ida", "Alice", "Abe"};
        Stream<String> word = Stream.of(names);
        long count = word.filter(w -> w.charAt(0) == 'A' && w.length() == 3).limit(3).count();
        System.out.println(count);

        Stream<Double> numsDouble = Stream.of(1.0, 2.0, 3.0, 4.0, 5.0);
        List<String> listString = numsDouble.map(w -> w.toString()).collect(Collectors.toList());
        Stream<String> stringStream = listString.stream();
        //change back
        List<Double> listDouble = stringStream.map(w -> Double.parseDouble(w)).collect(Collectors.toList());
        Stream<Double> doubleStream = listDouble.stream();
        List<Double> printout2 = doubleStream.collect(Collectors.toList());
        System.out.println(printout2);

        System.out.println(isPal("abaa"));






    }

    public static int smallest(int[] arr){
        if(arr.length == 1) {
            return arr[0];
        }
        else if (arr[0] < arr[1]){
            arr[1] = arr[0];
            return smallest(Arrays.copyOfRange(arr, 1, arr.length));
        }
        return smallest(Arrays.copyOfRange(arr, 1, arr.length));
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
