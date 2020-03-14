package _04interfaces.P9_1;

public class WorldClock extends Clock{
    private int tzAhead; //number of timezones ahead

    public WorldClock(int hourAhead){
       tzAhead = hourAhead;
    }

    @Override
    public String getHours(){
        //convert original hours to integer for calculation
        int newTime = Integer.parseInt(super.getHours()) + tzAhead;
        if(newTime>=24){
            return Integer.toString(newTime%24);
        }
        //cast back to string for return
        return Integer.toString(newTime);
    }


}
