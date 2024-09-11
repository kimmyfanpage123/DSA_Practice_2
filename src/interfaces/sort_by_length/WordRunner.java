package interfaces.sort_by_length;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import interfaces.sort_by_vowels.Word;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		//Scan the file - change with absolute file path
		Scanner file = new Scanner( new File("C:\\Users\\sturner\\IdeaProjects\\DSA_Practice_Key\\src\\interfaces\\sort_by_vowels\\word.dat") );

		List<interfaces.sort_by_vowels.Word> list = new ArrayList<Word>();

		//Get the file size
		int size = file.nextInt();

		//TODO: Finish this to collect the data and print the results
		for( int i = 0; i < size; i++ )
		{
			String s = file.next();
		}
	}
}