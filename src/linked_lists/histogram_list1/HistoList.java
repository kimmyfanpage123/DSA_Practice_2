package linked_lists.histogram_list1;//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

public class HistoList
{
	private HistoNode front;

	public HistoList()
	{
		front = null;
	}

	//addLetter will add a new node to the front for let if let does not exist
	//addLetter will bump up the count if let already exists
	public void addLetter(char let)
	{
		if (front == null){
			front = new HistoNode(let, 1, null);
		}
		else{
			if (indexOf(let) < 0){
				front = new HistoNode(let, 1, front);
			}
			else{
				HistoNode newNode = nodeAt(indexOf(let));
				newNode.setLetterCount(newNode.getLetterCount()+1);
			}
		}
	}

	//returns the index pos of let in the list if let exists
	public int indexOf(char let)
	{
		HistoNode list = front;
		int index = 0;
		while (list != null){
			if (list.getLetter() == let){
				return index;
			}
			list = list.getNext();
			index++;
		}
		return -1;
	}

	//returns a reference to the node at spot
	private HistoNode nodeAt(int spot)
	{
		HistoNode list = front;
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

	//returns a string will all values from list
	public String toString()
	{
		String output = "";
		HistoNode list = front;

		while (list != null){
			output += list.getLetter() + " - " + list.getLetterCount() + "    ";
			list = list.getNext();
		}
		return output;
	}
}