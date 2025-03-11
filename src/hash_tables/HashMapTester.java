package hash_tables;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HashMapTester {
    public static void main ( String[] args ) throws FileNotFoundException {
//        try{
        //make a new table
        HashMap map = new HashMap();
        //read from the file
        Scanner input = new Scanner(new File("C:/Users/559595/IdeaProjects/DSA_Practice_2/src/hash_tables/numbers.dat"));
        //load stuff into the table
        while (input.hasNextInt()) {
            HashMapHelper num = new HashMapHelper(input.nextInt());
            map.put(num.hashCode(), num);
        }
        //print out the table
        System.out.println(map);
        System.out.println(map.isEmpty()); // returns false
        System.out.println(map.containsValue(7)); // returns true
        System.out.println(map.keySet()); // returns [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        System.out.println(map.values()); // returns all values in the file but without duplicates
//        }
//        catch(Exception e)
//        {
//            System.out.println("Houston, we have a problem!");
//        }
    }
}
