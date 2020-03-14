package _04interfaces.E9_17;

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        ArrayList<Measurable> sodaCans = new ArrayList<>();
        sodaCans.add(new SodaCan(3,11));
        sodaCans.add(new SodaCan(5,20));
        sodaCans.add(new SodaCan(7,16));
        System.out.println("The average surface area of the soda cans is: "+average(sodaCans));

    }

    public static double average(ArrayList<Measurable> objects){
        if (objects.size() == 0){
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < objects.size(); i++) {
            sum += objects.get(i).getMeasure();
        }
        return sum/objects.size();
    }
}


