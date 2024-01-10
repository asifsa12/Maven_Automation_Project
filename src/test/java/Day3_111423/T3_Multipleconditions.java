package Day3_111423;

public class T3_Multipleconditions {
    public static void main(String[] args) {
        //declare int values
        int a = 7;
        int b = 26;
        int c = 42;
        //start of the conditional statement

        if(a + b > c) {
            System.out.println("sum of a and b is greater than c");
        } else if (a + b < c) {
            System.out.print("sum of a and b is less than c");
        } else {
            System.out.print("sum of a and b is equal to c");
        }//end of if else statements
    }//end of main
}//end of class

