package interfaces.sort_by_length;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		//Scan the file - change with absolute file path
		Scanner file = new Scanner(new File("words.dat"));

		//Get the file size
		int size = file.nextInt();

		//TODO: Finish this to collect the data and print the results
		file.nextLine();

	}
}