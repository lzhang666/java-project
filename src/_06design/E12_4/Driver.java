package _06design.E12_4;

/*
Write a program that teaches arithmetic to a young child. The program tests addition and subtraction.
In level 1, it tests only addition of numbers less than ten whose sum is less than ten. In level 2,
it tests addition of arbitrary one-digit numbers. In level 3, it tests subtraction of one-digit numbers
with a nonnegative difference.

Generate random problems and get the player’s input. The player gets up to two tries per problem.
Advance from one level to the next when the player has achieved a score of five points.
*/

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        int score = 0;
        int count = 1;
        Arithmetic quesL1 = new Level1Addition();
        Arithmetic quesL2 = new Level2Addition();
        Arithmetic quesL3 = new Level3Subtraction();
        System.out.println("Starting level 1 arithmetic test:");
        while(score < 15){
            if(score < 5){
                if(test(quesL1)){
                    count = 1;
                    score ++;
                    quesL1 = new Level1Addition();
                    System.out.println("Score = " + score);
                }
                else if (count > 0){
                    System.out.println(count + " more try left:");
                    count--;
                }
                else if (count == 0){
                    //reset count to 1
                    count = 1;
                    //get a new question if wrong twice
                    System.out.println("No more tries on previous question. Starting new question:");
                    quesL1 = new Level1Addition();
                }

                if(score == 5){
                    System.out.println("Level 1 completed. Starting level 2 arithmetic test:");
                }
            }

            else if (score>=5 && score<10){
                if(test(quesL2)){
                    count = 1;
                    score ++;
                    quesL2 = new Level2Addition();
                    System.out.println("Score = "+score);
                }
                else if (count > 0){
                    System.out.println(count + " more try left:");
                    count--;
                }
                else if (count == 0){
                    //reset count to 1
                    count = 1;
                    //get a new question if wrong twice
                    System.out.println("No more tries on previous question. Starting new question:");
                    quesL2 = new Level2Addition();
                }
                if(score == 10){
                    System.out.println("Level 2 completed. Starting level 3 arithmetic test:");
                }
            }
            else {
                if(test(quesL3)){
                    count = 1;
                    score ++;
                    quesL3 = new Level3Subtraction();
                    System.out.println("Score = "+score);
                }
                else if (count > 0){
                    System.out.println(count + " more try left:");
                    count--;
                }
                else if (count == 0){
                    //reset count to 1
                    count = 1;
                    //get a new question if wrong twice
                    System.out.println("No more tries on previous question. Starting new question:");
                    quesL3 = new Level3Subtraction();
                }
                if(score == 15){
                    System.out.println("Arithmetic test completed");
                }
            }
        }

    }

    //method to run test and return boolean
    public static boolean test(Arithmetic ques){
        Scanner in = new Scanner(System.in);
        String operator = new String();
        int count = 0;


        //get different operation based on level
        if (ques instanceof Level1Addition || ques instanceof Level2Addition){
            operator = " + ";
        }
        else{
            operator = " - ";
        }

        //starting question
        System.out.println("what is " + ques.getNum1() + operator + ques.getNum2() + " = ?");
        System.out.print("Enter answer : ");
        int ans = in.nextInt();
        if (ans == ques.getAnswer()) {
            System.out.print("Correct! ");
            return true;
        }
        System.out.print("Wrong answer... ");
        return false;
    }


}
