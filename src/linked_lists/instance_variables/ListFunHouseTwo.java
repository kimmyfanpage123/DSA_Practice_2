package linked_lists.instance_variables;//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

public class ListFunHouseTwo
{
    private ListNode theList;

    public ListFunHouseTwo()
    {
        theList = new ListNode();
    }

    public void add(Comparable data)
    {
        if (theList == null){
            theList.setValue(data);
            theList.setNext(null);
        }
        else{
            theList.setValue(data);
            theList.setNext(theList);
        }
    }

    //this method will return the number of nodes present in list
    public int nodeCount()
    {
        int count = 0;
        while (theList != null){
            theList = theList.getNext();
            count++;
        }
        return count;
    }

    //this method will create a new node with the same value as the first node and add this
    //new node at the front of the list.  Once finished, the first node will occur twice.
    public void doubleFirst()
    {
        if (theList == null){
            return;
        }

        ListNode newList = new ListNode();
        newList.setValue(theList.getValue());
        newList.setNext(theList.getNext());
        theList.setNext(newList);
    }

    //this method will create a new node with the same value as the last node and add this
    //new node at the end.  Once finished, the last node will occur twice.
    public void doubleLast()
    {
        if (theList == null){
            return;
        }

        ListNode current = theList;
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
        if (theList == null || theList.getNext() == null) {
            return;
        }

        ListNode current = theList;

        while (current != null && current.getNext() != null) {
            current.setNext(current.getNext().getNext());
            current = current.getNext();
        }
    }

    //this method will set the value of every xth node in the list
    public void setXthNode(int x, Comparable value)
    {
        int count = 1;
        while (theList != null){
            if (count % x == 0){
                theList.setValue(value);
            }
            theList = theList.getNext();
            count++;
        }
    }

    //this method will remove every xth node in the list
    public void removeXthNode(int x)
    {
        int count = 1;
        ListNode prev = theList;

        while (theList != null){
            if (count % x == 0) {
                prev.setNext(theList.getNext());
            }
            count++;
            prev = theList;
            theList = theList.getNext();
        }
    }
    //this method will return a String containing the entire list
    public String toString()
    {
        String output = "";
        while(theList != null){
            output += theList.getValue() + " ";
            theList = theList.getNext();
        }
        return output;
    }

}
