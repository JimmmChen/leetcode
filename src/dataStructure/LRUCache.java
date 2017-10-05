package dataStructure;
import java.util.HashMap;

public class LRUCache {
	HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
	Queue q;
	public LRUCache(int capacity) {
		q = new Queue(capacity);
	}
	    
	public int get(int key) {
		Integer i = map.get(Integer.valueOf(key));
		if(i == null)
			return -1;
		else {
			q.refresh(key);
			return i.intValue();
		}
	}
	    
	public void put(int key, int value) {
		if(!map.containsKey(key)){
		int n = q.size();
		int i = q.enqueue(key);
		if(n == q.maxsize())
			map.remove(Integer.valueOf(i));
		} else 
			q.refresh(key);
		map.put(Integer.valueOf(key), Integer.valueOf(value));
	}
}
