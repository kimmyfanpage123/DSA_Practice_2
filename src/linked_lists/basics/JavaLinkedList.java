package linked_lists.basics;//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.LinkedList;

public class JavaLinkedList
{
	private LinkedList<Integer> list;

	public JavaLinkedList()
	{
		list = new LinkedList<Integer>();
	}

	public JavaLinkedList(int[] nums)
	{
		list = new LinkedList<Integer>();
		for(int num : nums)
		{
			list.add(num);
		}
	}

	public double getSum(  )
	{
		double total=0;
		return total;
	}

	public double getAvg(  )
	{
		return 0;
	}

	public int getLargest()
	{
		int largest=Integer.MIN_VALUE;
		return largest;
	}

	public int getSmallest()
	{
		int smallest = smallest=Integer.MAX_VALUE;
		return smallest;
	}

	public String toString()
	{
		String output="";
		return output;
	}
}