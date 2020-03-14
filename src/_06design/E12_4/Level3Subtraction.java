package _06design.E12_4;

import java.util.Random;

public class Level3Subtraction extends Arithmetic {
    public Level3Subtraction(){
        Random rand = new Random();
        int num1 = rand.nextInt(10);
        int num2 = rand.nextInt(num1+1);
        int answer = num1 - num2;
        setNum1(num1);
        setNum2(num2);
        setAnswer(answer);
    }
}
