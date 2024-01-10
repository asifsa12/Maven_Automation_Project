package Practicecodes;

public class Forloopprc {
    public static void main(String[] args) {
    //A for loop allows you to repeat a statement for x amount of times, instead of manually typing it
        //syntax for a for loop is for (int i = 0; i <= x; i++)
        // x = number of times you want the int or string  to loop for
        // int i = starting point of loop
        // i ++ = what tells the loop to continue looping til the number is met
        for (int i = 0; i <= 9; i++) {
            System.out.println(i);
        //when using i (integer) in a for loop, you need to run the syntax with an "=" sign
        //Otherwise, the count above would go to 8 instead of 9 since index 0 counts as the first number
    }//end of first for loop
}//end of main
}//end of class
