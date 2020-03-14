package _05dice;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            words.add("a");
        }

        System.out.println(words);


    }

    public static String printArrList(ArrayList<String> arrList){
        String result = "";
        for (String element : arrList){
            result += element + "\n";
        }
        return result;
    }
}
