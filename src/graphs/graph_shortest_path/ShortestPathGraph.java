package graphs.graph_shortest_path;//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.TreeMap;

public class ShortestPathGraph
{
	private TreeMap<String, String> map;
	private boolean found;
	private int shortest;

	public ShortestPathGraph(String line)
	{
		map = new TreeMap<>();
		String[] edges = line.split(" ");

		for (String edge: edges){
			String node1 = edge.substring(0,1);
			String node2 = edge.substring(1,2);

			if (!map.containsKey(node1)){
				map.put(node1, "");
			}
			if (!map.containsKey(node2)){
				map.put(node2, "");
			}

			map.put(node1, map.get(node1) + node2);
			map.put(node2, map.get(node2) + node1);
		}
		found = false;
		shortest = Integer.MAX_VALUE;
	}

	public boolean contains(String letter)
	{
		return map.containsKey(letter);
	}

	public void check(String first, String second, String placesUsed, int steps)
	{
		if(first.equals(second)){
			if(steps < shortest || shortest == -1){
				shortest = steps;
				found = true;
			}
		}
		else{
			if(!placesUsed.contains(first)){
				for (int i = 0; i < map.get(first).length(); i++){
					String next = String.valueOf(map.get(first).charAt(i));
					check(next, second, placesUsed + first, steps + 1);
				}
			}
		}
	}

	public String toString()
	{
		if (found){
			return "yes in " + shortest + " steps";
		}
		else{
			return "no";
		}
	}
}