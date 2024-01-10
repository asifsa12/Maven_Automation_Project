package Practicecodes;

public class Enhancedforloop_prc {
    public static void main(String[] args) {
        //goal: use an enhanced for loop to iterate an array list
        //create the array list
        int numbers[] = {3,4,5,6,7,8};
        //use a for loop to search through the entire array list
        for (int element: numbers) {
         //print to get a list of each number in the array list after being squared
            System.out.println(element*element);
        }//end of for loop
    }//end of main
}//end of class
