package interfaces.sort_by_vowels;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner( new File( "words.dat" ) );
		List<Word> list = new ArrayList<Word>();
		
		int size = file.nextInt();
		
		for( int i = 0; i < size; i++ )
		{
			String s = file.next();
			
		}



	}
}