package arraylists;

import java.util.ArrayList;
import java.util.Arrays;

public class InitializationPractice {
    public static void main(String[] args) {
        // Initialization with add()
        ArrayList<Integer> year1 = new ArrayList<Integer>();
        year1.add(2);
        year1.add(0);
        year1.add(2);
        year1.add(5);
        System.out.println("year1: " + year1);

        // Initialization with add() shorthand
        ArrayList<Integer> year2 = new ArrayList<Integer>(){
            {
                add(2);
                add(0);
                add(2);
                add(5);
            }
        };
        System.out.println("year2: " + year2);

        // Initialization using asList()
        ArrayList<Integer> year3 = new ArrayList<Integer>(
                Arrays.asList(2,
                              0,
                              2,
                              5)
        );
        System.out.println("year3: " + year3);
    }
}
