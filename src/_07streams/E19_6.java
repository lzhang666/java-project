package _07streams;

/*
The static getAvailableCurrencies method of the java.util.Currency class yields a set of Currency objects.
Turn it into a stream and transform it into a stream of the currency display names. Print them in sorted order.
 */

import java.util.*;
import java.util.Currency;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class E19_6 {
    public static void main(String[] args) {
        Set<Currency> currency = Currency.getAvailableCurrencies();
        Stream<Currency> stream = currency.stream();
        List<String> currList = stream.map(w -> w.getDisplayName()).collect(Collectors.toList());
        currList.stream().sorted().forEach(System.out::println);
    }
}
