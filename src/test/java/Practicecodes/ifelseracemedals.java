package Practicecodes;

public class ifelseracemedals {
    public static void main(String[] args) {
        //Cash prizes are given to runners in a race for 1st, 2nd, and 3rd place medals
        //The runner in question finished the race at 23 minutes
        int t = 23;
        //if the runner places anywhere less than 25 minutes, they get 1st place and an honor plaque
        if (t < 25) {
            System.out.println("Contestant gets 1st place and an honor plaque");
            //if the runner places between 30 and 25 minutes, they get 1st place
        } else if (t >= 25 && t <= 30) {
                System.out.println("Contestant gets 1st place");
            //if the runner places between 31 and 35 minutes, 2nd place
        } else if (t >= 30 && t <= 35) {
            System.out.println("Contestant gets 2nd place");
            //if the runner places between 36 and 40 minutes, 3rd place
        } else if (t > 35 && t <= 40) {
            System.out.println("Contestant gets 3rd place");
            //if the runner places at anything more than 40 minutes, they get nothing but the sense of accomplishment
        } else if (t > 40) {
                System.out.println("Contestant gets nothing but the sense of accomplishment");
            }
    }//end of main
}//end of class
