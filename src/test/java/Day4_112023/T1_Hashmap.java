package Day4_112023;

import java.util.HashMap;
public class T1_Hashmap {
    public static void main(String[] args) {
        //create a hashmap consisting of triage students name and age
        HashMap<String, Integer> triageStudents = new HashMap<>();
        //add some values for the trigeStudents hashmap
        triageStudents.put("Noor", 25);
        triageStudents.put("Asif", 26);
        triageStudents.put("Justin", 28);
        //print out the size of the triagestudents hashmap
        System.out.println("The size of the hashmap is " +triageStudents.size());
        //print out the content of the hashmap
        System.out.println(triageStudents);

        //print  Asif's age only if Asif exists in the data set
        if (triageStudents.containsKey("Asif")) {
            int asifAge = triageStudents.get("Asif");
            System.out.println("Asif's age is " + asifAge);
        }//end of if condition

        //does not print Afsana's age we never added her to the data set
        System.out.println("Afsana's age is " + triageStudents.get("Asfana"));
    }//end of main
}//end of class
