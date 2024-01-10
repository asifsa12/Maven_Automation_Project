package Practicecodes;

import java.util.ArrayList;

public class Arrayversusarraylistprc {
    public static void main(String[] args) {
        //You're going to create a list of popular cars for American consumers
        String [] cars = new String [3];
        cars [0] = "Avalon";
        cars [1] = "ES 350";
        cars [2] = "Camarera";
        System.out.println(cars[1]);
        //In the array above, you could print out a specific car with the index number
        //If you just printed "cars" with the index, you would get an error/gibberish
        ArrayList carList = new ArrayList<>();
        carList.add("Avalon");
        carList.add("ES 350");
        carList.add("Camarera");
        //The beauty behind the array list is you can add more cars with ease, whereas with an original array you cant
        carList.add("Fiesta");
        System.out.println(carList);
        //the flexibility behind an array list is useful for subscription services (add or remove subscriber)
        //You can also test for whether the list contains a car
        System.out.print(carList.contains("Tuycan"));
    }//end of main
}//end of class
