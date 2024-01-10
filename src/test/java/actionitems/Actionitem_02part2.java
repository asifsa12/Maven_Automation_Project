package actionitems;

public class Actionitem_02part2 {
    public static void main(String[] args) {
    //assume the grade is an 87
        int grade = 87;
        //create the grade ranges using if and else if conditional statements
        if (grade >= 90 && grade <= 100) {
            System.out.println("Your grade is an A");
        } else if (grade >= 80 && grade < 90) {
            System.out.println("Your grade is a B");
        } else if (grade >= 70 && grade < 80) {
            System.out.println("Your grade is a C");
        } else if (grade >= 60 && grade < 70) {
            System.out.println("Your grade is a D");
        } else if (grade < 60)
            System.out.println("Your grade is a F");
    }//end of main
}//end of class

