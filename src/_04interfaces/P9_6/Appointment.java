package _04interfaces.P9_6;

/*
Implement a superclass Appointment and subclasses Onetime, Daily, and Monthly.
An appointment has a description (for example, “see the dentist”) and a date.
Write a method occursOn(int year, int month, int day) that checks whether the appointment occurs on that date.
For example, for a monthly appointment, you must check whether the day of the month matches.
Then fill an array of Appointment objects with a mixture of appointments.
Have the user enter a date and print out all appointments that occur on that date.
 */

public class Appointment {
    private int year;
    private int month;
    private int date;
    private String description;

    public Appointment(){
    }

    //for one time apps
    public Appointment(int year, int month, int date, String description){
        setYear(year);
        setMonth(month);
        setDate(date);
        setDescription(description);
    };

    //for daily apps
//    public Appointment(String description){
//        setDescription(description);
//    }

    public void setYear(int yr){
        year = yr;
    }
    public void setMonth(int mn){
        month = mn;
    }
    public void setDate(int dt){
        date = dt;
    }

    public void setDescription(String text){
        description = text;
    }

    public int getYear(){
        return year;
    }
    public int getMonth(){
        return month;
    }
    public int getDate(){
        return date;
    }
    public String getDescription(){
        return description;
    }

}
