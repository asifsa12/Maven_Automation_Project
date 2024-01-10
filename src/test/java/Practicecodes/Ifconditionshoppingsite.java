package Practicecodes;

public class Ifconditionshoppingsite {
    public static void main(String[] args) {
        //shopping website offers different types of deals
        //the deals are based off of how much products a user has purchased
        // lets assume user has purchased 43 products within the fiscal year
        int p = 9;
        if (p >= 10 && p <= 20) {
            System.out.println("User gets free shipping on their next order");
        } else if (p <= 9) {
            System.out.println( "User gets no deal");
        } else if (p >= 21 && p <= 34) {
            System.out.println("User gets free shipping on the next 3 orders");
        } else if (p >= 35 && p <= 50) {
            System.out.println("User get free shipping on next 3 orders and a 50% discount on one item");
        }
    }//end of main
}//end of class
