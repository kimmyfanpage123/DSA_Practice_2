package graphs.graph_all_paths;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Map;
import java.util.Set;
import java.util.*;

public class AllPathsGraph
{
	private Map<String, Set<String>> map;
	private boolean found;
	private int shortest;
	private ArrayList<String> paths;
	private Set<String> visit;

	public AllPathsGraph(String line)
	{
		//build your map / graph
		//initialize all of your instance variables
		map = new HashMap<>();
		found = false;
		shortest = 0;
		paths = new ArrayList<>();
		visit = new HashSet<>();

		String[] list = line.split(" ");
		for (String edge : list){
			if (edge.length() < 2) continue;
			String a = edge.substring(0,1);
			String b = edge.substring(1,2);

			map.putIfAbsent(a, new HashSet<>());
			map.putIfAbsent(b, new HashSet<>());

			map.get(a).add(b);
			map.get(b).add(a);
		}
	}

	public boolean contains(String name)
	{
		if (map.get(name) == null){
			return false;
		}
		return true;
	}

	public void check(String first, String second, ArrayList<String> placeUsed)
	{
		//go through firsts connections and see if any of those
		//are connected to second
		placeUsed.add(first);
		if (first.equals(second)){
			found = true;
			if (!(paths.contains(placeUsed.toString()))){
				paths.add(placeUsed.toString());
			}
		}
		else{
			for(String i : map.get(first)){
				if(!placeUsed.contains(i)){
					check(i, second, placeUsed);
					placeUsed.remove(i);
				}
			}
		}
	}

	public String toString()
	{
		if(found) 
		{
			return "" + paths;
		}
		return "no";
	}
}