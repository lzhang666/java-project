package _02arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class E7_4 {

    public static void main(String[] args) throws FileNotFoundException {
        //prompt for input and output file names
        Scanner console = new Scanner(System.in);
        System.out.println("Input file path/name:");
        String inputFileName = console.next();
        System.out.println("Output file path/name:");
        String outputFileName = console.next();

        //local input file path: /Users/lizhang/Desktop/maryLamb.txt
        //local output file path: /Users/lizhang/Desktop/outMaryLamb.txt

        File inputFile = new File(inputFileName);
        Scanner in = new Scanner(inputFile);
        PrintWriter outputFile = new PrintWriter(outputFileName);

        int lineNum = 1;
        while(in.hasNextLine()){
            String line = in.nextLine();
            String lineIn = "/* "+lineNum + " */ " + line;
            //System.out.println(lineIn);
            //write to file
            outputFile.println(lineIn);
            lineNum ++;
        }

        in.close();
        outputFile.close(); //close file
    }
}
