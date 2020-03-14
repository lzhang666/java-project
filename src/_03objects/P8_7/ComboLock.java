package _03objects.P8_7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ComboLock {
    private int[] secret = new int[3];
    private int[] input = new int[3];
    private int index;
    private int dial;


    public ComboLock(int num1, int num2, int num3){
        secret[0] = num1;
        secret[1] = num2;
        secret[2] = num3;
    }

    public void reset(){
        dial = 0;
    }

    public void turnRight(int ticks){
        if (ticks % 40 != 0) {
            int tickNum = ticks % 40;
            if(tickNum<=dial)
                dial -= tickNum;
            else
                dial = dial - tickNum + 40;
        }
        input[index]= dial;
        index++;
    }

    public void turnLeft(int ticks){
        if (ticks % 40 != 0) {
            int tickNum = ticks % 40;
            if(tickNum <= 40 - dial)
                dial += tickNum;
            else
                dial = dial + tickNum - 40;
        }
        input[index]= dial;
        index++;
    }

    public int getDial(){
        return dial;
    }

    public boolean open(){
        if(Arrays.equals(secret, input))
            return true;
        else
            return false;
    }

}
