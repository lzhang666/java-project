package _04interfaces.P9_6;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        //populate the appointment array
        ArrayList<Appointment> apps= new ArrayList<>();
        apps.add(new Onetime(2019,11,15,"math midterm"));
        apps.add(new Onetime(2019,11,28,"Thanksgiving"));
        apps.add(new Daily("afternoon library study"));
        apps.add(new Monthly(16,"see the dentist"));
        apps.add(new Monthly(28,"haircut"));

        //read in user input
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a date including the year, month and date, separated by spaces: ");
        int yearIn = in.nextInt();
        int monthIn = in.nextInt();
        int dateIn = in.nextInt();

        //check if any appointment occur on the input date
        System.out.println("On the date "+yearIn+"-"+monthIn+"-"+dateIn+", there will be: ");
        int count = 0;
        for (int i = 0; i < apps.size(); i++) {
            Appointment temp = apps.get(i);
            //check with one time
            if (temp instanceof Onetime && ((Onetime)temp).occursOn(yearIn, monthIn, dateIn)){
                System.out.println("- a one time "+ temp.getDescription()+" appointment");
                count++;
            }
            //check with daily
            else if (temp instanceof Daily && ((Daily)temp).occursOn(yearIn, monthIn, dateIn)){
                System.out.println("- a daily "+ temp.getDescription()+" appointment");
                count++;
            }
            //check with monthly
            else if (temp instanceof Monthly && ((Monthly)temp).occursOn(yearIn, monthIn, dateIn)){
                System.out.println("- a monthly "+ temp.getDescription()+" appointment");
                count++;
            }

        }
        //the no appointment case
        if(count ==0){
            System.out.println("no appointments");
        }
    }

}
