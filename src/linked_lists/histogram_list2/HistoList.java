package linked_lists.histogram_list2;//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import linked_lists.histogram_list1.HistoNode;

public class HistoList
{
	private ListNode front;

	public HistoList()
	{
		front = null;
	}


	//ADDS NEW NODE TO THE FRONT OF THE LIST FOR LET IF IT DOES NOT EXIST.
	//IF IT EXISTS, IT BUMPS UP LET'S COUNT BY ONE
	public void add(Object obj)
	{
		if (front == null){
			front = new ListNode(new ThingCount(obj, 1), null);
		}
		else{
			if (indexOf(obj) < 0){
				front = new ListNode(new ThingCount(obj, 1), front);
			}
			else{
				ThingCount newNode = (ThingCount) nodeAt(indexOf(obj)).getValue();
				newNode.setCount(newNode.getCount()+1);
			}
		}
	}

	//RETURNS THE INDEX POSITION OF LET IN THE LIST
	public int indexOf(Object obj)
	{
		int index = 0;
		ListNode list = front;
		while (list != null){
			ThingCount temp = (ThingCount) list.getValue();
			if (temp.getThing().equals(obj)){
				return index;
			}
			list = list.getNext();
			index++;
		}
		return -1;
	}

	//RETURNS A REFERENCE TO THE NODE AT SPOT
	private ListNode nodeAt(int spot)
	{
		ListNode list = front;
		int index = 0;
		while (list != null){
			if (spot == index){
				return list;
			}
			list = list.getNext();
			index++;
		}
		return null;
	}

	//RETURNS THE LIST AS A BIG STRING
	public String toString()
	{
		String output = "";
		ListNode list = front;

		while (list != null){
			output += list.getValue().toString() + "    ";
			list = list.getNext();
		}
		return output;
	}
}

