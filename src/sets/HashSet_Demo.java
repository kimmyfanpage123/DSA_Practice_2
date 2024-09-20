package sets;//(c) A+ Computer Science
// www.apluscompsci.com

//general HashSet example 

import java.util.Set;
import java.util.HashSet;  

public class HashSet_Demo
{
	public static void main(String args[])
	{
		Set<Integer> bob = new HashSet<Integer>();
		Set<Double> vals = new HashSet<Double>();
		vals.add( .3 );
		vals.add( 1.2 );
		vals.add( 2.6 );
		System.out.println(vals);
		vals.remove( 9.1 );
		System.out.println(vals);  	
		vals.remove( 0.3 );
		for( Double it : vals )  
		{
			System.out.println( it );
		}
	}
}