package _03objects.P8_8;

public class VotingMachine {

    //pubic VotingMachine
    private int demoVotes;
    private int repuVotes;

    public void reset(){
        demoVotes = 0;
        repuVotes = 0;
    }

    public void voteDemocrat(){
        demoVotes ++;
    }

    public void voteRepublican(){
        repuVotes ++;
    }

    public void tallyResults(){
        System.out.println("The Democrat gets "+demoVotes+" votes; the republican gets "+repuVotes+" votes.");
    }


}
