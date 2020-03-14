package _03objects.P8_5;

public class SodaCan {
    /*
    Implement a class SodaCan with methods getSurfaceArea() and getVolume().
    In the constructor, supply the height and radius of the can.
     */
    //variables
    private double height;
    private double radius;

    //constructor
    public SodaCan(double ht, double rad){
        height = ht;
        radius = rad;
    }

    //surface area
    public double getSurfaceArea(){
        double bottomArea = Math.PI * radius * radius;
        double sideArea = Math.PI * radius * 2 * height;
        return 2*bottomArea+sideArea;
    }

    //volume
    public double getVolume(){
        double bottomArea = Math.PI * radius * radius;
        return bottomArea * height;
    }

}
