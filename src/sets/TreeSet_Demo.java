package sets;//(c) A+ Computer Science
// www.apluscompsci.com

//general TreeSet example 

import java.util.Set;
import java.util.TreeSet;

public class TreeSet_Demo
{
	public static void main(String args[])
	{
		Set<Integer> bob = new TreeSet<Integer>();
		Set<String> vals = new TreeSet<String>();
		vals.add( "aplus" );
		vals.add( "comp" );
		vals.add( "sci" );
		vals.add( "rocks" );
		System.out.println(vals);
		vals.remove( "comp" );
		System.out.println(vals);		
		vals.remove( "aplus" );
		for( String it : vals )
			System.out.println( it );
	}
}