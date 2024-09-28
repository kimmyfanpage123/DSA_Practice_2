package maps;//(c) A+ Computer Science
//www.apluscompsci.com  

//printing out a map with basic iterator loop

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Iterator;

public class LinkedHashMap1
{
	public static void main(String args[])
	{
		Map<Integer, String> map;
		map = new LinkedHashMap<>();
		
		//LinkedHashMap maintains insertion order
		map.put( 77, "dog" );
		map.put( 77, "cat" );
		map.put( 212, "wildcat" );
		map.put( 33, "pony" );
		map.put( 6, "ant" );
		map.put( 2, "frog" );
		map.put( 33, "horse" );
				
		for( Integer v : map.keySet() )
		{
			System.out.println( v + " - " + map.get(v) );
		}
	}
}