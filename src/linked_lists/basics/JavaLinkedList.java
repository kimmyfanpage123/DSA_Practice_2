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

	public double getSum()
	{
		double total = 0;
		for (int i = 0; i < list.size(); i++){
			total += list.get(i);
		}
		return total;
	}

	public double getAvg()
	{
		double total = 0;
		for (int i = 0; i < list.size(); i++){
			total += list.get(i);
		}
		return total/list.size();
	}

	public int getLargest()
	{
		int largest = list.get(0);
		for (int i = 1; i < list.size(); i++){
			if (list.get(i) > largest){
				largest = list.get(i);
			}
		}
		return largest;
	}

	public int getSmallest()
	{
		int smallest = list.get(0);
		for (int i = 1; i < list.size(); i++){
			if (list.get(i) < smallest){
				smallest = list.get(i);
			}
		}
		return smallest;
	}

	public String toString()
	{
		return "SUM: " + getSum() + "\nAVERAGE: " + getAvg() + "\nSMALLEST: " + getSmallest() + "\nLARGEST: " + getLargest() + "\n\n";
	}
}

