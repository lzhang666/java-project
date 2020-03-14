package _03objects.P8_6;

public class Car {
    /*
    Implement a class Car with the following properties.
    A car has a certain fuel efficiency (measured in miles/gallon)
    and a certain amount of fuel in the gas tank.
    The efficiency is specified in the constructor, and the initial fuel level is 0.
    Supply a method drive that simulates driving the car for a certain distance,
    reducing the fuel level in the gas tank, and methods getGasLevel,
    to return the current fuel level, and addGas, to tank up. Sample usage:

        Car myHybrid = new Car(50); // 50 miles per gallon
        myHybrid.addGas(20); // Tank 20 gallons
        myHybrid.drive(100); // Drive 100 miles
        System.out.println(myHybrid.getGasLevel()); // Print fuel remaining
     */
    private int mPerGallon;
    private int fuel = 0;
    //constructor
    public Car(int Efficiency){
        mPerGallon = Efficiency;
    }

    public void addGas(int gas){
        fuel += gas;
    }

    public void drive(int mileage){
        int fuelUsage = mileage/mPerGallon;
        if (fuelUsage > fuel) fuel = 0;
        fuel -= fuelUsage;
    }

    public int getGasLevel(){
        return fuel;
    }

}
