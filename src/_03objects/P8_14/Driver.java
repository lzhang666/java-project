package _03objects.P8_14;

import java.util.ArrayList;


public class Driver {
    public static void main(String[] args) {
        ArrayList<Country> countries= new ArrayList<>();

        Country c1 = new Country();
        c1.setName("Luxembourg");
        c1.setArea(2586);
        c1.setPopulation(613894);
        countries.add(c1); //add to the list after completion

        Country c2 = new Country();
        c2.setName("Qatar");
        c2.setArea(11571);
        c2.setPopulation(2740479);
        countries.add(c2);

        Country c3 = new Country();
        c3.setName("Italy");
        c3.setArea(301308);
        c3.setPopulation(60278616);
        countries.add(c3);

        String cArea = "";
        String cPop = "";
        String cPDen = "";

        int larArea = 0;
        int larPop = 0;
        int larPDen = 0;

        for (int i = 0; i < countries.size(); i++) {
            if (larArea < countries.get(i).getArea()){
                larArea = countries.get(i).getArea();
                cArea = countries.get(i).getName();
            }

            if (larPop < countries.get(i).getPopulation()){
                larPop = countries.get(i).getPopulation();
                cPop = countries.get(i).getName();
            }

            if (larPDen < countries.get(i).getPopDensity()){
                larPDen = countries.get(i).getPopDensity();
                cPDen = countries.get(i).getName();
            }
        }

        System.out.println("The country with the largest area is: " + cArea);
        System.out.println("The country with the largest population is: "+ cPop);
        System.out.println("The country with the largest population density is: " + cPDen);


    }
}
