package Day4_112023;

public class T2_Split {
    public static void main(String[] args) {
        //declare a string message with a single message
        String message = "My name is Asif";
        //declare an array to store split message
        String[] splitmessage = message.split(" ");
        //print out only john from the message string
        System.out.println("The name is " + splitmessage[3]);
        //split based on _
        String message2 = "Automation_01";
        String [] splitMessage2 =message2.split("_");
        //print out only action item number
        System.out.println("Action item number is " +splitMessage2[1]);
    }//end of main
}//end of class
