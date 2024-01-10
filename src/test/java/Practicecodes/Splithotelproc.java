package Practicecodes;

import net.bytebuddy.agent.builder.AgentBuilder;

public class Splithotelproc {
    public static void main(String[] args) {
        //declare a single string message for the Gregorian Hotel
        String message = ("Welcome to the Gregorian");
        //create a split
        String [] splitmessage = message.split(" ");
        //print out only 4th word/3rd index
        System.out.println("Welcome to the " + splitmessage[3] + "!");
    }//end of main
}//end of class
