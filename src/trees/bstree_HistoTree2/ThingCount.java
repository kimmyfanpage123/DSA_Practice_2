package trees.bstree_HistoTree2;//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

public class ThingCount implements Comparable
{
	private int count;
	private Object thing;
	
	public ThingCount()
	{
		thing = null;
		count = 0;
	}
	
	public ThingCount(Object thang, int cnt)
	{
		thing = thang;
		count = cnt;
	}

	public void setThing(Object obj)
	{
		thing = obj;
	}
	
	public void setCount(int cnt)
	{
		count = cnt;
	}
	
	public Object getThing()
	{
		return thing;
	}

	public int getCount()
	{
		return count;
	}
	
	public boolean equals(Object obj)
	{
		ThingCount other = (ThingCount)obj;
		if (count == other.getCount()){
			return true;
		}
		return false;
	}
	
	public int compareTo(Object obj)
	{
		ThingCount other = (ThingCount)obj;
		if (count < other.getCount()){
			return -1;
		}
		else if (count == other.getCount()){
			return 0;
		}
		else{
			return 1;
		}
	}
	
	public String toString()
	{
		return ""+thing + " - " + count;
	}
}