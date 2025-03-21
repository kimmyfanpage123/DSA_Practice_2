package graphs.graph_simple;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.HashMap;
import java.util.Queue;
import java.util.LinkedList;
import java.util.List;

public class GraphQ
{
	private HashMap<String, String> map;
	private boolean found;

	public GraphQ(String line)
	{
		map = new HashMap<String, String>();
		String[] list = line.split(" ");
		for(String piece : list)
		{
			String first = piece.substring(0,1);
			String second = piece.substring(1,2);

			if (map.get(first) == null){
				map.put(first, "");
			}
			if (map.get(second) == null){
				map.put(second, "");
			}
			
			//add code to build the map / graph
			map.put(first, map.get(first)+second);
			map.put(second, map.get(second)+first);

		}
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
        Queue<String> q = new LinkedList<String>();
            
        List<String> used = new LinkedList<String>();
		
		q.add(first);
 
        //loop through the q if nodes remain to check
        while (!q.isEmpty()) {
			//check for stuff
			String current = q.poll();

			String[] letters = map.get(current).split("");

			for (String neighbor : letters){
				if (!used.contains(neighbor)){
					used.add(neighbor);
					if(neighbor.equals(second)){
						found = true;
						return;
					}
					q.add(neighbor);
				}
			}
		}
    }

	public String toString()
	{
		if(found)
		   return "CONNECTS";
		return "DOES NOT CONNECT";
	}
}