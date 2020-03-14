package _04interfaces.P9_6;

public class Onetime extends Appointment {
    //monthly appointments has a single year, single month, single date
    public Onetime(int year, int month, int date, String description){
        super(year, month, date, description);
    };

    public boolean occursOn(int year2, int month2, int date2){
        if (year2 == getYear() && month2 == getMonth() && date2 == getDate()){
            return true;
                    //"There is a one time appointment \""+getDescription()+"\" on "+getYear()+"-"+getMonth()+"-"+getDate();
        }
        return false;
                //"There is no one time appointment on "+getYear()+"-"+getMonth()+"-"+getDate();
    }

}
