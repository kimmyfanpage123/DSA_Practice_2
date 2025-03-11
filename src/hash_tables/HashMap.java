package hash_tables;
import java.util.*;


public class HashMap implements Map{
    private ArrayList<HashSet<Object>> map;
    private HashSet<Integer> keys;
    private HashSet<Object> values;
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
            if (map.get(i) != null){
                count++;
            }
        }
        return count;
    }


    @Override
    public boolean isEmpty() {
        if (map.isEmpty()){
            return true;
        }
        return false;
    }


    @Override
    public boolean containsKey(Object key) {
        for (int i = 0; i < map.size(); i++){
            if (map.get(i) != null && map.get(i) == key){
                return true;
            }
        }
        return false;
    }


    @Override
    public boolean containsValue(Object value) {
        HashMapHelper val = new HashMapHelper((Integer) value);
        for (int i = 0; i < map.size(); i++){
            HashSet set = map.get(i);
            if (set.contains(val)){
                return true;
            }
        }
        return false;
    }


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
        map.get((Integer)key).add(value);
        keys.add((Integer)key);
        values.add(value);
        return value;
    }


    @Override
    public Object remove(Object key) {
        map.get((Integer) key).clear();
        map.remove((Integer) key);
        return key;
    }


    @Override
    public void putAll(Map m) {

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

