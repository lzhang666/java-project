package _04interfaces.E9_8;

public class BasicAccount extends BankAccount {
    /*
    Implement a subclass of BankAccount from How To 9.1 called BasicAccount
    whose withdraw method will not withdraw more money than is currently in the account.
     */
    public void withdraw (double amount){
        if(getBalance() - amount >= 0){
            super.withdraw(amount);
        }
        else {
            System.out.println("Insufficient balance. Enter withdrawal amount <= " + super.getBalance());
        }
    }
}
