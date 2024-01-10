package Practicecodes;

public class Arrayprc {
    public static void main(String[] args) {
        //Create zombie killer array via Alex Lee youtube tutorial
        //Create a welcome message to the zombie killer program
        System.out.println("Welcome to the zombie killer program!!!");
        //Create an array of the weapons you have to defend yourself against the zombies
        String backpack [] = {"Shotgun","Assault Rifle","Sniper"};
        String zombie [] = {"Short range zombie","Mid range zombie","Long range zombie"};
        //If you want to fight a short range zombie you need to access the first weapon, a shotgun
        //However the first element always starts at index 0, so you would access for 1 by inputting 0
        System.out.println("Here are the backpack items!");
        System.out.println(backpack[0]);
        System.out.println(backpack[1]);
        System.out.println(backpack[2]);
        //Repeat statement with list but with the ogres instead
        System.out.println("These are the zombie types!");
        System.out.println(zombie[0]);
        System.out.println(zombie[1]);
        System.out.println(zombie[2]);
        //Document the numbers that zombies hate
        int numberszombiesHate [] = {4,67,89,112,52};
        //Print number 112, index 3
        System.out.println(numberszombiesHate[3]);
    }//end of main
}//end of class
