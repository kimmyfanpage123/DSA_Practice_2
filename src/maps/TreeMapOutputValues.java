package maps;//(c) A+ Computer Science
//www.apluscompsci.com

//printing out the key and values of the map 

import java.util.Map;
import java.util.TreeMap;
import java.util.Iterator;

public class TreeMapOutputValues
{
	public static void main(String args[])
	{
		Map<String,Integer> map;
		map = new TreeMap<String,Integer>();

		String s = "dog1cat2pig3dog1cat2pig7dog3dog6cat8dog4pig";
		for(String item : s.split("\\d+"))   //split around numbers
		{
			if(map.get(item)==null)
			{
				map.put(item,1);
			}
			else
			{
			   map.put(item,map.get(item)+1);
			}
		}

		for(String item : map.keySet())   //prints out all keys 
		{
			System.out.print(item+"  ");		
		}
		
		System.out.println();
		
		for(Integer item : map.values())   //prints out all values stored in the map
		{
			System.out.print(item+"  ");		//the order of the values is determined by the key order
		}
		
		System.out.println();
	}
}