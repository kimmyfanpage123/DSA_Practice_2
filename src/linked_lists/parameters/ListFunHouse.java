package linked_lists.parameters;//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

public class ListFunHouse
{
	//this method will print the entire list on the screen
	public static void print(ListNode list)
	{
		while(list != null){
			System.out.print(list.getValue() + " ");
			list = list.getNext();
		}
	}

	//this method will return the number of nodes present in list
	public static int nodeCount(ListNode list)
	{
		int count = 0;
		while (list != null){
			list = list.getNext();
			count++;
		}
		return count;
	}

	//this method will create a new node with the same value as the first node and add this
	//new node to the list.  Once finished, the first node will occur twice.
	public static void doubleFirst(ListNode list)
	{
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
	public static void doubleLast(ListNode list)
	{
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
	public static void skipEveryOther(ListNode list)
	{
		if (list == null || list.getNext() == null) {
			return;
		}

		ListNode current = list;

		while (current != null && current.getNext() != null) {

		}
	}

	//this method will set the value of every xth node in the list
	public static void setXthNode(ListNode list, int x, Comparable value)
	{
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
	public static void removeXthNode(ListNode list, int x)
	{
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
}
