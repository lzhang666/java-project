package _03objects.P8_14;

public class Country {
    private String name = new String();
    private int population;
    private int area; //in square km

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
    public int getPopulation(){
        return population;
    }


    public void setArea(int area) {
        this.area = area;
    }
    public int getArea(){
        return area;
    }

    public int getPopDensity(){
        return population/area;
    }
}
