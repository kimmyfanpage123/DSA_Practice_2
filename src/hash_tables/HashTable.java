package hash_tables;//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.LinkedList;

public class HashTable
{
	private LinkedList[] table;

	public HashTable( )
	{
		table = new LinkedList[10];
	}

	public void add(Object obj)
	{
		System.out.println("add");
		int i = obj.hashCode();





	}

	public String toString()
	{
		String output="HASHTABLE\n";










		return output;
	}
}