package Practicecodes;

public class Ifcondition_knightdefeatsdragon {
    public static void main(String[] args) {
        //in this scenario, a knight will receive different rewards for defeating a dragon
        //the value of the reward depends on their health when they defeated the dragon
        //lets assume their health was 33 (max health is 50)
        int h = 7;
        if (h >= 15 && h <= 22) {
            System.out.println("The knight shall receive a dragon helm as his reward");
        } else if (h >= 23 && h <= 30) {
            System.out.println("The knight shall receive a dragon sword as his reward");
        } else if (h >= 31 && h <= 50) {
            System.out.println("The knight shall receive the powers of dragon fire as his reward");
        } else if (h < 14) {
            System.out.println("The knight shall receive no reward, he will just clear the quest");
        } //end of if and else if conditions
    }//end of main
}//end of class
