package sets;//(c) A+ Computer Science
// www.apluscompsci.com

//LinkedHashSet example 

import java.util.Set;
import java.util.LinkedHashSet;  

public class LinkedHashSet_Demo
{
	public static void main(String args[])
	{
		Set<Double> vals;
		vals = new LinkedHashSet<Double>();
		vals.add( 9.3 );
		vals.add( 1.2 );
		vals.add( 2.6 );
		vals.add( 2.6 );
		vals.add( 2.6 );
		vals.add( -77.0 );
		
		for( Double it : vals )  
		{
			System.out.println( it );
		}
	}
}