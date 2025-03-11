package hash_tables;//(c) A+ Computer Science
//www.apluscompsci.com


//Name -


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class HashTableRunner
{
	public static void main ( String[] args ) throws FileNotFoundException {
//        try{
		//make a new table
		HashTable table = new HashTable();
		//read from the file
		Scanner input = new Scanner(new File("C:/Users/559595/IdeaProjects/DSA_Practice_2/src/hash_tables/numbers.dat"));
		//load stuff into the table
		while (input.hasNextInt()) {
			Number num = new Number(input.nextInt());
			table.add(num);
		}
		//print out the table
		System.out.println(table);
//        }
//        catch(Exception e)
//        {
//            System.out.println("Houston, we have a problem!");
//        }
	}
}
