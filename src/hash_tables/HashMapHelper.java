package hash_tables;

public class HashMapHelper {
    private int val;

    public HashMapHelper(int value)
    {
        val = value;
    }

    public int getVal(){
        return val;
    }

    public boolean equals(Object obj)
    {
        HashMapHelper other = (HashMapHelper) obj;
        if (val == other.getVal()) {
            return true;
        }
        return false;
    }

    public int hashCode()
    {
        return val%10;
    }
    public String toString()
    {
        return "" + val;
    }
}
