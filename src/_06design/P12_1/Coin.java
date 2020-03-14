package _06design.P12_1;

public class Coin {
    private String name;
    private double value;

    public Coin(String initial){
        name = initial;
        if(initial.equals("P")) value = 0.01;
        else if (initial.equals("N")) value = 0.05;
        else if (initial.equals("D")) value = 0.1;
        else if (initial.equals("Q")) value = 0.25;
        else value = 0;
    }

    public double getValue() {
        return value;
    }


}
