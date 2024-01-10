package actionitems;

import java.util.ArrayList;

public class Actionitem_02part1 {
    public static void main(String[] args) {
        ArrayList <String> region = new ArrayList<>();
        //add the regions and iterate
        region.add("Brooklyn");
        region.add("Queens");
        region.add("Manhattan");
        region.add("Bronx");
        ArrayList <String> areaCodes = new ArrayList<>();
        //add the areaCodes and iterate
        areaCodes.add ("11233");
        areaCodes.add ("11234");
        areaCodes.add ("11235");
        areaCodes.add ("11236");
        //iterate and print
        for (int i = 0; i < region.size(); i++) {
            System.out.println("My region is " + region.get(i) + " and my area code is " + areaCodes.get(i));
        }// end of for loop
    }//end of main
}//end of class
