package _06design.P12_1;

import java.util.ArrayList;

public class VendingMachine {
    private double totalCoins = 0;
    private ArrayList<Product> productList = new ArrayList<>();



    public void removeMoney(){
        totalCoins = 0;
    }


    public void insertCoins(double value){
        totalCoins += value;
    }

    public void decreaseBalance(double value){
        totalCoins -= value;
    }

    public double showCoins(){
        return totalCoins;
    }

    public void stockMachine(Product product){
        productList.add(product);
    }

    public void showStock(){
        for(Product element:productList){
            System.out.println("Slot: "+productList.indexOf(element) + " / " + element);
        }
    }

    public int listSize(){
        return productList.size();
    }

    public ArrayList<Product> getProductList(){
        return productList;
    }


//    public void productSelect(int slot){
//        if (slot < productList.size()){
//            Product prodGet = productList.get(slot);
//            if(prodGet.getPrice() < totalCoins && prodGet.getQuantity() > 0) {
//                prodGet.decreaseQuantity();
//                System.out.println("Enjoy the " + prodGet.getName() + "!");
//                decreaseBalance(prodGet.getPrice());
//                System.out.println("You have $" + totalCoins + " remaining");
//            }
//            else if(prodGet.getPrice() > totalCoins){
//                System.out.println("Insufficient fund");
//            }
//            else if (prodGet.getQuantity() == 0){
//                System.out.println("Sorry, " + prodGet.getName() + " is sold out.");
//            }
//
//        }
//        else {
//            System.out.println("Invalid slot selection");
//        }
//
//    }


}
