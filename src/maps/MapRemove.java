package maps;//(c) A+ Computer Science
//www.apluscompsci.com

//map remove example

import java.util.Map;
import java.util.TreeMap;

public class MapRemove
{
	public static void main(String args[])
	{
		Map<Integer,Double> map;
		map = new TreeMap<Integer,Double>();
		map.put(5,2.5);
		map.put(6,4.2);
		map.put(17,1.5);
		System.out.println(map.remove(8));	
		System.out.println(map.remove(6));		
		System.out.println(map.size());
	}
}