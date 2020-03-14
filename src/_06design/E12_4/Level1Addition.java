package _06design.E12_4;

import java.util.Random;

public class Level1Addition extends Arithmetic {



    public Level1Addition(){
        Random rand = new Random();
        int num1 = rand.nextInt(10);
        int num2 = rand.nextInt(10 - num1);
        int answer = num1 + num2;
        setNum1(num1);
        setNum2(num2);
        setAnswer(answer);
    }

//    public void test(Level1Addition ques, int input){
//        if(compareResult(ques, input)){
//            updateScore();
//            setCount(1);
//            ques = new Level1Addition();
//            System.out.println("Score = " + getScore());
//        }
//        else{
//            if(getCount() > 0 ){
//                System.out.println(getCount() + " more try left:");
//                updateCount();
//            }
//            else if (getCount() == 0){
//                //reset count to 1
//                setCount(1);
//                //get a new question if wrong twice
//                System.out.println("No more tries on previous question. Starting new question:");
//                ques = new Level1Addition();
//            }
//        }
//
//
//    }



}
