package _07streams;

/*
Read all words in a file and group them by the first letter (in lowercase).
Print the average word length for each initial letter. Use collect and Collectors.groupingBy.
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class E19_16 {
    public static void main(String[] args) throws IOException {
        String filename = "/Users/lizhang/projava/src/_07streams/read_word.txt";
        List<String> words = new ArrayList<>();

        try(Stream<String> lines = Files.lines(Paths.get(filename))) {
            lines.forEach(w -> {
                String[] tempWords = w.split(" ");
                words.addAll(Arrays.asList(tempWords));
            });

            Stream<String> stream = words.stream();
            Map<String, Double> groups = stream.collect(Collectors.groupingBy(
                    w -> w.substring(0,1).toLowerCase(),
                    Collectors.averagingDouble(w -> w.length())));
            System.out.println(groups.toString());
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
