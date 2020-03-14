package _06design.P12_1;


/*
Write a program that simulates a vending machine. Products can be purchased by inserting coins with
a value at least equal to the cost of the product. A user selects a product from a list of available
products, adds coins, and either gets the product or gets the coins returned. The coins are returned
if insufficient money was supplied or if the product is sold out. The machine does not give change
if too much money was added. Products can be restocked and money removed by an operator.
Follow the design process that was described in this chapter. Your solution should include a class
VendingMachine that is not coupled with the Scanner or PrintStream classes.

 */


import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;


public class Driver {
    //public Scanner that all methods can use
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //DecimalFormat dF = new DecimalFormat("$0.00");
        VendingMachine machine = new VendingMachine();
        machine.removeMoney();

        //stocking products
        machine.stockMachine(new Product("Pepsi", 1.00,9));
        machine.stockMachine(new Product("Coke", 0.99,3));
        machine.stockMachine(new Product("Spring Water", 0.50,10));
        machine.stockMachine(new Product("Ice Coffee", 0.60,4));
        machine.stockMachine(new Product("Tooth Paste", 0.20,5));
        machine.stockMachine(new Product("Chocolate Bar", 1.20,2));
        machine.stockMachine(new Product("Gum", 0.40,3));
        machine.stockMachine(new Product("Deodorant", 0.55,9));
        machine.stockMachine(new Product("Rice Cooker", 2.00));




        while(true){
            System.out.println("Enter \"i\" to insert coins, \"s\" to see the stock, and \"exit\" to exit program");
            //System.out.println("start");
            String option = in.nextLine().toUpperCase();
            if(option.equals("I")){
                //coin insertion
                System.out.println("Enter \"q\" for quarter, \"d\" for dime, \"n\" for nickle, \"p\" for penny. Example: q q q d");
                String coinString = in.nextLine().toUpperCase();
                String[] coinArray = coinString.split(" ");

                for (int i = 0; i < coinArray.length; i++) {
                    Coin coin = new Coin(coinArray[i]);
                    machine.insertCoins(coin.getValue());
                }
                System.out.println("The vending machine has products:");
                machine.showStock();
                System.out.println("You inserted: $" + machine.showCoins());
                System.out.println("Enter the slot number: ");
                int choice = in.nextInt();
                int machSize = machine.listSize();


                if (choice < machSize){
                    Product prodGet = machine.getProductList().get(choice);
                    if(prodGet.getPrice() < machine.showCoins() && prodGet.getQuantity() > 0) {
                        prodGet.decreaseQuantity();
                        System.out.println("Enjoy the " + prodGet.getName() + "!");
                        machine.decreaseBalance(prodGet.getPrice());
                        System.out.println("You have $" + machine.showCoins() + " remaining");
                    }
                    else if(prodGet.getPrice() > machine.showCoins()){
                        System.out.println("Insufficient fund");
                    }
                    else if (prodGet.getQuantity() == 0){
                        System.out.println("Sorry, " + prodGet.getName() + " is sold out.");
                    }

                }
                else {
                    System.out.println("Invalid slot selection");
                }
            }
            else if (option.equals("S")){
                machine.showStock();
                System.out.println("You have $" + machine.showCoins() + " remaining");
            }
            else if (option.equals("EXIT")){
                break;
            }
            //System.out.println("end");

        }

    }

}
