package graphs.graph_simple2;//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.*;

public class BiDirectionalGraph
{
	private TreeMap<String, TreeSet<String>> map;
	private boolean found;

	public BiDirectionalGraph(String line)
	{
		map = new TreeMap<String, TreeSet<String>>();
		String[] list = line.split(" ");

		for(int i = 0; i < list.length; i+=2)
		{
			String first = list[i];
			String second = list[i+1];

			if (map.get(first) == null){
				map.put(first, new TreeSet<String>());
			}
			if (map.get(second) == null){
				map.put(second, new TreeSet<String>());
			}

			//add code to build the map / graph
			TreeSet firstSet = map.get(first);
			firstSet.add(second);
			TreeSet secondSet = map.get(second);
			secondSet.add(first);

			map.put(first, firstSet);
			map.put(second, secondSet);

		}
		found = false;
	}

	public boolean contains(String name)
	{
		if(map.get(name)==null)
			return false;
		return true;
	}

	public void check(String first, String second, TreeSet<String> placedUsed)
	{
		Queue<String> q = new LinkedList<String>();

		q.add(first);

		//loop through the q if nodes remain to check
		while (!q.isEmpty()) {
			//check for stuff
			String current = q.poll();

			TreeSet currSet = map.get(current);

			for (Object neighbor : currSet){
				if (!placedUsed.contains(neighbor)){
					placedUsed.add((String)neighbor);
					if(neighbor.equals(second)){
						found = true;
						return;
					}
					q.add((String)neighbor);
				}
			}
		}
	}

	public String toString()
	{
		if(found)
			return "YAH";
		return "NAH";
	}
}