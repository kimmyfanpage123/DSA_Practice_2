package graphs.graph_all_paths;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AllPathsGraphRunner
{
	public static void main( String[] args ) throws IOException
	{
		Scanner file = new Scanner(new File("C:/Users/559595/IdeaProjects/DSA_Practice_2/src/graphs/graph_all_paths/graph3.dat"));
		int howManyTimes = file.nextInt();
		file.nextLine();
		for(int x=0; x<howManyTimes; x++)
		{
			String input = file.nextLine();
			AllPathsGraph test = new AllPathsGraph(input);

			input = file.nextLine();

			String start = input.substring(0,1);
			String stop = input.substring(1,2);

			test.check(start, stop, new ArrayList<>());

			System.out.println(start + " to " + stop + " == " + test);
		}
	}
}