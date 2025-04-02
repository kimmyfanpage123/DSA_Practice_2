package graphs.graph_shortest_path;//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import graphs.graph_simple.GraphQ;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ShortestPathGraphRunner
{
	public static void main( String[] args ) throws IOException
	{
		Scanner file = new Scanner(new File("C:/Users/559595/IdeaProjects/DSA_Practice_2/src/graphs/graph_shortest_path/graph2.dat"));
		int howManyTimes = file.nextInt();
		file.nextLine();
		for(int x=0; x<howManyTimes; x++)
		{
			String letters = file.nextLine();
			ShortestPathGraph idk = new ShortestPathGraph(letters);

			String test = file.nextLine();
			String let1 = test.substring(0,1);
			String let2 = test.substring(1,2);

			if (idk.contains(let1) && idk.contains(let2)){
				idk.check(let1, let2, "", 0);
			}

			System.out.println(let1 + " connects to " + let2 + " == " + idk);
		}
	}
}