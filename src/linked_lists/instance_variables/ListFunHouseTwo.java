package linked_lists.instance_variables;//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

public class ListFunHouseTwo
{
	private ListNode theList;
	
	public ListFunHouseTwo()
	{
		theList = null;
	}
	
	public void add(Comparable data)
	{
		theList = new ListNode(data, theList);
	}
	
	//this method will return the number of nodes present in list
	public int nodeCount()
	{
		ListNode list = theList;
		int count = 0;
		while (list != null){
			list = list.getNext();
			count++;
		}
		return count;
	}
		
	//this method will create a new node with the same value as the first node and add this
	//new node at the front of the list.  Once finished, the first node will occur twice.
	public void doubleFirst()
	{
		ListNode list = theList;
		if (list == null){
			return;
		}

		ListNode newList = new ListNode();
		newList.setValue(list.getValue());
		newList.setNext(list.getNext());
		list.setNext(newList);
	}

	//this method will create a new node with the same value as the last node and add this
	//new node at the end.  Once finished, the last node will occur twice.
	public void doubleLast()
	{
		ListNode list = theList;
		if (list == null){
			return;
		}

		ListNode current = list;
		while (current.getNext() != null){
			current = current.getNext();
		}

		ListNode newList = new ListNode();
		newList.setValue(current.getValue());
		current.setNext(newList);
	}
	
	//method skipEveryOther will remove every other node
	public void skipEveryOther()
	{

	}

	//this method will set the value of every xth node in the list
	public void setXthNode(int x, Comparable value)
	{
		ListNode list = theList;
		int count = 1;
		while (list != null){
			if (count % x == 0){
				list.setValue(value);
			}
			list = list.getNext();
			count++;
		}
	}	

	//this method will remove every xth node in the list
	public void removeXthNode(int x)
	{
		ListNode list = theList;
		int count = 1;
		ListNode prev = list;

		while (list != null){
			if (count % x == 0) {
				prev.setNext(list.getNext());
			}
			count++;
			prev = list;
			list = list.getNext();
		}
	}		
	//this method will return a String containing the entire list
   public String toString()
   {
	   String output="";
	   ListNode list = theList;
	   while(list != null){
		   output += list.getValue() + " ";
		   list = list.getNext();
	   }

	   return output;
   }			
	
}
