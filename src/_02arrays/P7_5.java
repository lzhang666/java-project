package _02arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class P7_5 {


    public static int numberOfRows(File inputFile) throws FileNotFoundException {
        //initialize scanner
        Scanner in = new Scanner(inputFile);
        int rowNum = 0;
        while(in.hasNextLine()){
            rowNum ++; //increment row number
            in.nextLine(); // iterate to next line
        }
        in.close();
        System.out.print("The number of rows in the csv file is: ");
        return rowNum;
    }

    public static int numberOfFields(File inputFile, int row) throws FileNotFoundException {
        Scanner in = new Scanner(inputFile);
        int rowNum = 0;
        while (in.hasNextLine()){
            rowNum++;
            if (rowNum == row){
                String rowWanted = in.nextLine();
                //counting the # of double quotes
                int dQuoteCount = 0;
                //counting the # of commas
                int commaCount = 0;
                for (int i = 0; i < rowWanted.length(); i++) {
                    if(rowWanted.charAt(i) == '\"')
                        dQuoteCount ++;
                    //only count the comma if there is even number of double quotes before it
                    if(rowWanted.charAt(i) == ',' && dQuoteCount % 2 ==0)
                        commaCount++;
                }
                in.close();
                System.out.print("The number of fields in row "+ row + " is: ");
                return commaCount+1;
            }
            in.nextLine();
        }
        in.close();
        return 0;
    }

    public static String field(File inputFile, int row, int column) throws FileNotFoundException {
        //initialize scanner
        Scanner in = new Scanner(inputFile);
        ArrayList<String> rowlist = new ArrayList<>();
        int rowNum = 0;
        while (in.hasNextLine()){
            rowNum++;
            if (rowNum == row){
                String strLookUp = "";
                String rowWanted = in.nextLine();
                //counting the # of double quotes
                int dQuoteCount = 0;
                //counting the # of commas
                int commaCount = 0;
                for (int i = 0; i < rowWanted.length(); i++) {
                    //start string look up if the right comma count is reach
                    if(commaCount == (column - 1)){
                        strLookUp += rowWanted.charAt(i);
                    }
                    if(rowWanted.charAt(i) == '\"')
                        dQuoteCount ++;
                    //only count the comma if there is even number of double quotes before it
                    if(rowWanted.charAt(i) == ',' && dQuoteCount % 2 ==0)
                        commaCount++;

                }
                in.close();

                //if the 1st character is a space ' ', remove it
                if(strLookUp.charAt(0)==' ')
                    strLookUp = strLookUp.substring(1);
                //if the last character is a comma ',', remove it
                if(strLookUp.charAt(strLookUp.length()-1)==',')
                    strLookUp = strLookUp.substring(0,strLookUp.length()-1);

                System.out.print("The string at row "+ row +" and column "+ column +" is: ");
                return strLookUp;
            }
            in.nextLine();
        }
        in.close();
        return null;
    }



    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        System.out.println("Input csv file name/path:");
        String inputFileName = console.next();

        //local input file path: /Users/lizhang/Desktop/p75.csv
        File inputFile = new File(inputFileName);

        int ansA = numberOfRows(inputFile);
        System.out.println(ansA);

        int ansB = numberOfFields(inputFile, 4);
        System.out.println(ansB);

        String ansC = field(inputFile, 4,3);
        System.out.println(ansC);

    }
}