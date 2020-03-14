package _05dice.pig;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;


public class Pig {
    protected JPanel mPanel;
    private JButton rollButton;
    private JButton holdButton;
    private JLabel diceNum;
    private JLabel pOutcome;
    private JLabel cOutcome;
    private JButton reset;
    private JButton computerFirst;
    private JLabel pScoreLabel;
    private JLabel cScoreLabel;
    private JLabel result;
    private Random rand = new Random();
    private int sum = 0;
    private int cSum = 0;
    private int rollNum;
    private boolean hold = false;
    private boolean cHold = false;
    private ArrayList<Integer> playerOutcome = new ArrayList<>();
    private ArrayList<Integer> computerOutcome = new ArrayList<>();


    public Pig() {
        rollButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //roll button only functional when hold button is not pressed or 1 is never rolled
                if(!hold) {
                    rollNum = rand.nextInt(6) + 1;
                    diceNum.setText(Integer.toString(rollNum));
                    playerOutcome.add(rollNum);
                    pOutcome.setText("Player outcome: " + printArrList(playerOutcome));
                    if (rollNum == 1) {
                        hold = true;
                        playerOutcome.clear();
                        //receive 1, return game to computer
                        cHold = false;
                        checkResult();
                        computerRoll();
                    }
                }
            }
        });

        holdButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //hold button only functional if it's never pressed and player has roll at least once
                if(!hold && playerOutcome.size() > 0) {
                    hold = true;
                    sum += sumArrList(playerOutcome);
                    //clear array list for next round
                    playerOutcome.clear();
                    pScoreLabel.setText("Player score = " + Integer.toString(sum));
                    //return game play to computer
                    cHold = false;
                    checkResult();
                    computerRoll();
                }
            }
        });

        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sum = 0;
                cSum = 0;
                hold = false;
                cHold = false;
                playerOutcome.clear();
                computerOutcome.clear();
                diceNum.setText("0");
                pOutcome.setText("Player outcome: ");
                pScoreLabel.setText("Player score = 0");
                cOutcome.setText("Computer outcome: ");
                cScoreLabel.setText("Computer Score = 0");
                result.setText("Result: ");
            }
        });

        computerFirst.addActionListener((new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //button only functional if player never played
                if(playerOutcome.size()==0){
                    computerRoll();
                }
            }
        }));

    }

    public void computerRoll(){
        while(!cHold) {
            rollNum = rand.nextInt(6) + 1;
            int holdIndicator = rand.nextInt(3);
            if(holdIndicator == 1) cHold = true;
            diceNum.setText(Integer.toString(rollNum));
            computerOutcome.add(rollNum);
            cOutcome.setText("Computer outcome: " + printArrList(computerOutcome));
            if (rollNum == 1) {
                cHold = true;
                computerOutcome.clear();
                //return game to player
                //hold = false;
            }
            else if(cHold && rollNum != 1){
                cSum += sumArrList(computerOutcome);
                //clear array list for next round
                computerOutcome.clear();
                cScoreLabel.setText("Computer Score = " + Integer.toString(cSum));
            }
        }
        //game play return to user
        hold = false;
        //check result
        checkResult();
    }

    public void checkResult(){
        if(sum >= 100){
            result.setText("Result: player wins!");
            hold = true;
            cHold = true;
        }
        else if(cSum >= 100){
            result.setText("Result: computer wins!");
            hold = true;
            cHold = true;
        }
        else{
            if(hold == false && cHold == true){
                result.setText("Computer finished, player's turn");
            }
        }
    }


    public static String printArrList(ArrayList<Integer> arrList){
        String result = "";
        for (Integer element : arrList){
            result += Integer.toString(element) + ", ";
        }
        return result;
    }


    public static int sumArrList(ArrayList<Integer> arrList){
        int result = 0;
        for (Integer element : arrList){
            result += element;
        }
        return result;
    }
}
