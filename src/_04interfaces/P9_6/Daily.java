package _04interfaces.P9_6;

import java.util.Date;

public class Daily extends Appointment {
    //Daily appointments happens everyday, it only needs a description

    public Daily(String text){
        setDescription(text);
    }

    public boolean occursOn(int year2, int month2, int date2){
        if (getDescription() != null){
            return true;
        }
        return false;
    }






}
