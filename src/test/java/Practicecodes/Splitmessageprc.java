package Practicecodes;

public class Splitmessageprc {
    public static void main(String[] args) {
        //Write a string message
    String message = ("My name is Asif");
        //Split the message into 4 words, remember to use correct spacing between quotations
        String [] splitMessage = message.split (" ");
        // Asif = index 3, 4th word since we start from index 0
    System.out.println("My name is " + splitMessage[3]);
    }//end of main
}//end of class
