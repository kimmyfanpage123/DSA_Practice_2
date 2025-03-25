package graphs.graph_simple2;//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import graphs.graph_simple.GraphQ;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class BiDirectionalGraphRunner
{
	public static void main( String[] args ) throws IOException
	{
		Scanner file = new Scanner(new File("C:/Users/559595/IdeaProjects/DSA_Practice_2/src/graphs/graph_simple2/bidgraph.dat"));
		int howManyTimes = file.nextInt();
		file.nextLine();
		for(int x=0; x<howManyTimes; x++)
		{
			String words = file.nextLine();
			BiDirectionalGraph idk = new BiDirectionalGraph(words);

			//String test = file.nextLine();
			String[] test = file.nextLine().split(" ");
			String word1 = test[0];
			String word2 = test[1];

			if (idk.contains(word1) && idk.contains(word2)){
				idk.check(word1, word2, new TreeSet<String>());
			}

			System.out.println(word1 + " CONNECTS TO " + word2 + " == " + idk);
		}
	}
}