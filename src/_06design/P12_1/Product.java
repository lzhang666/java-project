package _06design.P12_1;

public class Product {
    private String name;
    private double price;
    private int quantity = 0;


    public Product(String pName, double pPrice){
        name = pName;
        price = pPrice;
        increaseQuantity(1);
    }

    public Product(String pName, double pPrice ,int num){
        name = pName;
        price = pPrice;
        increaseQuantity(num);
    }

    public void setName(String pName) {
        name = pName;
    }
    public String getName(){
        return name;
    }

    public void setPrice(int pPrice) {
        price = pPrice;
    }

    public double getPrice() {
        return price;
    }

    public void increaseQuantity(int num){
        quantity += num;
    }

    public void decreaseQuantity(){
        if(quantity > 0) quantity--;
        else quantity = 0;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString(){
        return name+" $"+price+"\tquantity: "+ quantity;
    }
}
