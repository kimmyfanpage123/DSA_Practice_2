package sets;//(c) A+ Computer Science
//www.apluscompsci.com

//printing out a set with a for loop  

import java.util.Set;
import java.util.TreeSet;

public class SetOutput
{
	public static void main(String args[])
	{
		Set<Double> vals;
		vals = new TreeSet<Double>();
		vals.add( 1.1 );
		vals.add( 0.4 );
		vals.add( 12.6 );
		
		for(double dec : vals)
		{
			System.out.println(dec);
		}
		
	}
}