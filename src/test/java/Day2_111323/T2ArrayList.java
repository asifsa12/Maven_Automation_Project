package Day2_111323;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class T2ArrayList {
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>();
        //add some values to the countries array list
        countries.add("USA");//index 0
        countries.add("INDIA");//index 1
        countries.add("PAKISTAN");//index 2
        countries.add("BANGLADESH");//index 3
        //print out USA
        System.out.println("The first country is "+countries.get(0));
        //print out the total size of the array list
        System.out.println("The total size of countries array list is "+countries.size());
        //add another country
        countries.add("CANADA");//index 4
        //print the new size of the array list
        System.out.println("The total size of the new countries array list is "+countries.size());

        //declare an integer arraylist
        ArrayList <Integer> studentGrades = new ArrayList<>();
        //add values to students grades
                studentGrades.add(90);
        studentGrades.add(80);
        studentGrades.add(20);
        //print out the last students grade
        System.out.print("The last students grade is " +studentGrades.get(2));
    }//end of main
}//end of class
