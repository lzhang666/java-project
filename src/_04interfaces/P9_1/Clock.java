package _04interfaces.P9_1;

/*
Implement a class Clock whose getHours and getMinutes methods return the current time at your location.
(Call java.time.LocalTime.now().toString() or,
if you are not using Java 8, new java.util.Date().toString() and extract the time from that string.)
Also provide a getTime method that returns a string with the hours and minutes
by calling the getHours and getMinutes methods. Provide a subclass WorldClock whose constructor accepts a time offset.
For example, if you live in California, a new WorldClock(3) should show the time in New York, three time zones ahead.
Which methods did you override? (You should not override getTime.)
 */


public class Clock {
    private String time = java.time.LocalTime.now().toString();

    public String getHours(){
        return time.substring(0, 2);
    }
    public String getMinutes(){
        return time.substring(3, 5);
    }
    public String getTime(){
        return getHours()+":"+getMinutes();
    }
}
