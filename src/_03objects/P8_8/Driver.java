package _03objects.P8_8;

import java.util.Scanner;
import java.util.Random;

public class Driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //set the total number of people
        System.out.print("Enter the number of people participating the vote: ");
        int totalP = in.nextInt();

        //within the bound, randomly generate the number of people voting for each party
        Random ran = new Random();
        int demVotes = ran.nextInt(totalP+1);
        int repVotes = totalP - demVotes;

        VotingMachine tally = new VotingMachine();
        tally.reset();

        for (int i = 0; i < demVotes; i++) {
            tally.voteDemocrat();
        }
        for (int i = 0; i < repVotes; i++) {
            tally.voteRepublican();
        }

        tally.tallyResults();
    }
}
