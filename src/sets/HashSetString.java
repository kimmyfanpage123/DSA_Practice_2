package sets;//(c) A+ Computer Science
// www.apluscompsci.com

//hash set string example  

import java.util.Set;
import java.util.HashSet;

public class HashSetString
{
	public static void main(String args[])
	{
		Set<String> vals;
		vals = new HashSet<String>();
		vals.add("aplus");
		vals.add("comp");
		vals.add("sci");
		vals.add("sci");
		System.out.println(vals);
	}
}