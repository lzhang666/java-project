package _03objects.P8_1;

public class MWPanel {
    //variables: time, power
    private int time;
    private int power;

    //1) increment button
    public void increment() {
        time += 30;
    }

    //2) switch button
    public void switchP(){
        if(power == 1) power = 2;
        else power =1;
    }

    //3) reset
    public void reset() {
        time = 0;
        power = 1;
    }

    //4) start
    public void start(){
        System.out.println("Cooking for "+time+" seconds at level "+power);
    }

}
