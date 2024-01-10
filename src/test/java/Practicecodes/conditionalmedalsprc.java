package Practicecodes;

public class conditionalmedalsprc {
    public static void main(String[] args) {
        //if the runners in a marathon complete a lap within 1 to less than 5 minutes, they will get gold
        //if the runners complete a lap within 6 to less than 10 minutes, they will get silver
        //if the runners complete a lap within 10 to less than 15 minutes, they will get bronze
        //assume the runner in question completed their lap in 7 minutes
        int time = 7;
        //create the if condition time ranges
        if (time >= 1 && time <= 5) {
            System.out.println("The runner has received a gold medal");
        } else if (time >= 6 && time <=10) {
            System.out.println("The runner has received a silver medal");
        } else if (time >= 10 && time <=15) {
            System.out.println("The runner has received a bronze medal");
        }
    }//end of main
}//end of class
