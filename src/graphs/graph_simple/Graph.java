package graphs.graph_simple;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.HashSet;
import java.util.HashMap;

public class Graph
{
	private HashMap<String, HashSet<String>> map;
	private HashSet<String> visit;
	private boolean found;

	public Graph(String line)
	{
		//point map at a new hash map
		
		String[] list = line.split(" ");
		for(String piece : list)
		{
			//add code to build the graph
		}
		
		//point visit a new hash set
		
		found = false;
	}

	public boolean contains(String letter)
	{
		if(map.get(letter)==null)
	      return false;
	   return true;
	}

	public void check(String first, String second)
	{
		//if first equals second
			//done
		//else
			//get all of first's connections
			//loop the list of connections for first
				//if current node not yet visited
					//add node to visited
					//recursive call	
	}

	public String toString()
	{
		if(found)
		   return "CONNECTS";
		return "DOES NOT CONNECT";
	}
}