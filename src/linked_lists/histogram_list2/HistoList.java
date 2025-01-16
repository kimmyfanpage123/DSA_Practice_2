package linked_lists.histogram_list2;//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

public class HistoList
{
    private ListNode front;

    public HistoList( )
    {
        front = null;
    }


    //ADDS NEW NODE TO THE FRONT OF THE LIST FOR LET IF IT DOES NOT EXIST.
    //IF IT EXISTS, IT BUMPS UP LET'S COUNT BY ONE
    public void add(Object obj)
    {
        Comparable object = (Comparable)obj;
        if (front == null){
            front = new ListNode(object, null);
        }
        else{
            front = new ListNode(object, front);
        }
    }

    //RETURNS THE INDEX POSITION OF LET IN THE LIST
    public int indexOf(Object obj)
    {
        int index = 0;
        
    }

    //RETURNS A REFERENCE TO THE NODE AT SPOT
    private ListNode nodeAt(int spot)
    {
        ListNode current=front;
        return current;
    }

    //RETURNS THE LIST AS A BIG STRING
    public String toString()
    {
        String output = "";
        return output;
    }
}
