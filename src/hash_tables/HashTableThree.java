package hash_tables;//(c) A+ Computer Science
//www.apluscompsci.com

//hashtable example 3

import java.util.LinkedList;

public class HashTableThree
{
	public static void main ( String[] args )
	{
		LinkedList[] hashTable = new LinkedList[10];
		for(int i = 0; i< hashTable.length; i++)
		{
			hashTable[i] = new LinkedList();
		}
		
		Character c = '1';
		hashTable[c.hashCode()%10].add(c);
		
		c = 'd';
		hashTable[c.hashCode()%10].add(c);		
		
		c = 'c';
		hashTable[c.hashCode()%10].add(c);		
		
		c = 'B';
		hashTable[c.hashCode()%10].add(c);   
		
		Integer num = 45;		//autoboxing
		hashTable[num.hashCode()%10].add(num);
		
		num = Integer.valueOf(113);		//boxing up the int the long way
		hashTable[num.hashCode()%10].add(num);
		
		num = Integer.valueOf(263);		//boxing up the int the long way
		hashTable[num.hashCode()%10].add(num);		
		
		num = Integer.valueOf(783);		//boxing up the int the long way
		hashTable[num.hashCode()%10].add(num);			
		
		String s = "e";		
		hashTable[s.hashCode()%10].add(s);
		
		for( LinkedList list : hashTable )
		{
			for( Object thing : list )
			{
				System.out.print(thing + " -> ");
			}  
			System.out.println();
		}   	   
	}
}