package Practicecodes;

import java.util.ArrayList;

public class Arrayprc2 {
    public static void main(String[] args) {
        //Create an array list of colors and their respective moods (2 lists)
       String colors [] = {"red","blue","green"};
       String mood [] = {"angry","happy","calm"};
       //Create an introduction to the "mood board"
        System.out.println("Welcome to the color mood board.");
        System.out.println("Based off your results, your color is " + colors [1] + ".");
        System.out.println("This means you are currently feeling " + mood [1] + ".");
        System.out.println("We hope you remain happy for the rest of the day! Let us know if your feelings change. ");
    }//end of main
}//end of class
