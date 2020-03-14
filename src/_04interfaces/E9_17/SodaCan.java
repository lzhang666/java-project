package _04interfaces.E9_17;

/*
Modify the SodaCan class of Exercise P8.5 to implement the Measurable interface.
The measure of a soda can should be its surface area.
Write a program that computes the average surface area of an array of soda cans.
 */


public class SodaCan implements Measurable{
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

    public double getMeasure(){
        return getSurfaceArea();
    }

}
