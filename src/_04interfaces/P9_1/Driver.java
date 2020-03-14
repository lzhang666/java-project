package _04interfaces.P9_1;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        Clock time = new Clock();
        System.out.println("Current hours is: "+time.getHours());
        System.out.println("Current minutes is: "+time.getMinutes());
        System.out.println("Current minutes is: "+time.getTime());

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the time zones ahead: ");
        int timeZonesAhead = in.nextInt();
        WorldClock newTime = new WorldClock(timeZonesAhead);
        System.out.println("Current hours at "+timeZonesAhead+" time zones ahead is: "+newTime.getHours());
        System.out.println("Current minutes at "+timeZonesAhead+" time zones ahead is: "+newTime.getMinutes());
        System.out.println("Current time at "+timeZonesAhead+" time zones ahead is: "+newTime.getTime());



    }
}
