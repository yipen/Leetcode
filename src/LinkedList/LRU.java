package LinkedList;

import java.util.HashMap;
import java.util.LinkedList;

class LRUCache {
    private int capacity;
    private HashMap<Integer, Integer> maps = new HashMap<>();
    private LinkedList<Integer> list = new LinkedList<>();

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if(maps.containsKey(key)){
            list.remove(list.indexOf(key));
            list.add(key);
            return maps.get(key);
        }
        return -1;
    }

    public void put(int key, int value) {
        if (maps.containsKey(key)) {
            list.remove(list.indexOf(key));
            list.add(key);
            maps.put(key, value);
        } else {
            if(maps.size()<capacity){
                list.add(key);
                maps.put(key, value);
            }else{
                int removeKey = list.pop();
                maps.remove(removeKey);
                maps.put(key, value);
                list.add(key);
            }
        }

    }
}