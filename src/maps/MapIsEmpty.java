package maps;//(c) A+ Computer Science
//www.apluscompsci.com

//map isEmpty example

import java.util.Map;
import java.util.TreeMap;

public class MapIsEmpty
{
	public static void main(String args[])
	{
		Map<Integer,Double> map;
		map = new TreeMap<Integer,Double>();
		map.put(5,2.5);
		map.put(6,4.2);
		System.out.println(map.isEmpty() );
		map.remove(5);
		map.remove(6);
		System.out.println( map.isEmpty() );
	}
}