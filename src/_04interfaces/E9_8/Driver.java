package _04interfaces.E9_8;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        //create accounts
        BasicAccount account = new BasicAccount();

        //execute commands
        Scanner in = new Scanner(System.in);
        boolean done = false;
        while(!done) {
            System.out.println("Enter one of the options below: ");
            System.out.println("D)eposit  W)ithdraw  M)onth and  Q)uit: ");
            String input = in.next();
            if(input.equals("D") || input.equals("W")){
                System.out.println("Enter deposit amount: ");
                double amount = in.nextDouble();
                if (input.equals("D")){
                    account.deposit(amount);
                }
                else{
                    account.withdraw(amount);
                }
            }
            else if(input.equals("M")) {//month end processing
                account.monthEnd();
                System.out.println("This account has " + account.getBalance()+" dollars by the end of this month.");

            }
            else if(input.equals("Q")){
                done = true;
            }
        }
    }
}
