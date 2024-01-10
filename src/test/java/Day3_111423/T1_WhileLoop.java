package Day3_111423;

import java.util.ArrayList;

public class T1_WhileLoop {
    public static void main(String[] args) {
        //declare an array list of boroughs
        ArrayList<String> boroughs = new ArrayList<>();
        boroughs.add("Brooklyn");
        boroughs.add("Manhattan");
        boroughs.add("Queens");
        boroughs.add("Bronx");
        boroughs.add("Staten Island");
        //set the initial counter for the while loop
        int i =0;
        while (i< boroughs.size()) {
            System.out.println("Index number or iteration is " +i);
            //print out all the countries
            System.out.println("My borough is " + boroughs.get(i));
            //counter
            i++;
        }//end of while loop
    }//end of main
}//end of class
