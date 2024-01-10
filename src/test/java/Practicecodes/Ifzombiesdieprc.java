package Practicecodes;

public class Ifzombiesdieprc {
    public static void main(String[] args) {
        //Create an if else condition for a video game
        //Player gets rewarded for the amount of zombie kills
        int z = 54;
        if (z <= 10) {
            System.out.println("Player A wins nothing. Try again");

        } else if (z <= 20 && z >= 11) {
            System.out.println("Player A gets 3rd place. Bronze badman!");

        } else if (z <= 30 && z >= 21) {
            System.out.println("Player A gets 2nd place. Silver soldier!");

        } else if (z <=44 && z >=31) {
            System.out.println("Player A gets 1st place. Golden gunman!");

        } else if (z >= 45) {
            System.out.println("Player A is the King of Zombie Killers!");
    }//end of if statements
    }//end of main
}//end of class
