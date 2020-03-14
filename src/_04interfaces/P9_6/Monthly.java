package _04interfaces.P9_6;

public class Monthly extends Appointment {
    //monthly appointments has a single date
    public Monthly(int date, String text){
        setDate(date);
        setDescription(text);
    }
    public boolean occursOn(int year2, int month2, int date2){
        if (date2 == getDate()){
            return true;
        }
        return false;
    }
}
