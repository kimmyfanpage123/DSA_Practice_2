package hash_tables;
import java.util.*;


public class HashMap implements Map{
    private ArrayList<HashSet<Integer>> map;
    private HashSet<Integer> keys;
    private HashSet<Integer> values;
    public HashMap() {
        map = new ArrayList<>();
        keys = new HashSet<>();
        values = new HashSet<>();
        for (int i = 0; i < 10; i++){
            map.add(i, new HashSet<>());
        }
    }


    @Override
    public int size() {
        int count = 0;
        for (int i = 0; i < map.size(); i++){
            if (!map.get(i).isEmpty()){
                count++;
            }
        }
        return count;
    }


    @Override
    public boolean isEmpty() {
        for (int i = 0; i < map.size(); i++){
            if (!map.get(i).isEmpty()){
                return false;
            }
        }
        return true;
    }


    @Override
    public boolean containsKey(Object key) {
        /*for (int i = 0; i < map.size(); i++){
            if (map.get(i) != null && map.get(i) == key){
                return true;
            }
        }
        return false;

         */
        for (Integer k : keys){
            if (k == ((Integer) key)){
                return true;
            }
        }
        return false;
    }


    @Override
    public boolean containsValue(Object value) {
        //HashMapHelper val = new HashMapHelper((Integer) value);
        /*for (int i = 0; i < map.size(); i++){
            HashSet set = map.get(i);
            if (set.contains((Integer) value)){
                return true;
            }
        }
        return false;

         */
        for (Integer val : values){
            if (val == ((Integer) value)){
                return true;
            }
        }
        return false;
    }

    // i shouldve asked about this.
    // not tested
    @Override
    public Object get(Object key) {
        return key;
    }


    @Override
    public Object put(Object key, Object value) {
        if (map.get((Integer) key) == null){
            HashSet set = map.get((Integer) key);
            set = new HashSet<>();
        }
        map.get((Integer)key).add((Integer)value);
        keys.add((Integer)key);
        values.add((Integer)value);
        return value;
    }


    @Override
    public Object remove(Object key) {
        for (Integer val : map.get((Integer) key)){
            if (values.contains(val)){
                values.remove(val);
            }
        }
        map.get((Integer) key).clear();
        keys.remove((Integer) key);
        return key;
    }


    // not tested
    @Override
    public void putAll(Map m) {
        for (Object key : m.keySet()){
            put(key, m.get(key));
        }
    }


    @Override
    public void clear() {
        for (int i = 0; i < map.size(); i++){
            map.get(i).clear();
        }
    }


    @Override
    public Set keySet() {
        return keys;
    }


    @Override
    public Collection values() {
        return values;
    }



    @Override
    public Set<Entry> entrySet() {
        Set<Entry> mappings = new HashSet<>();
        for (Object key: keySet()){
            Map.Entry<Integer, HashSet<Integer>> pair = Map.entry((Integer) key, map.get((Integer) key));
            mappings.add(pair);
        }
        return null;
    }

    public String toString(){
        // ykw fuck this idk what im doing anymore
        String output="HASHMAP\n";
        for (int i = 0; i < map.size(); i++){
            output += "bucket " + i + ": " + map.get(i) + "\n";
        }
        return output;
    }

}

