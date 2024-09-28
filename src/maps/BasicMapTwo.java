package maps;//(c) A+ Computer Science
// www.apluscompsci.com  

//basic map example 2

import java.util.Map;
import java.util.TreeMap;

public class BasicMapTwo
{
	public static void main(String args[])
	{
		Map<Integer,Double> map;
		map = new TreeMap<Integer,Double>();
		map.put(5,2.5);
		map.put(8,6.7);
		map.put(11,5.9);
		map.put(6,4.2);
		map.put(17,1.5);
		System.out.println(map.put(8,9.5));		
		System.out.println(map.put(6,6.6));
		
		System.out.println(map.get( 6 ));
		System.out.println(map.get( 11));
		System.out.println(map.get( 7 ));
	}
}