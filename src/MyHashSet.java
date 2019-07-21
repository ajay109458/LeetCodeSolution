import java.util.ArrayList;
import java.util.List;

class MyHashSet {

	private static int BUCKET_SIZE = 100;
	
	private List<Integer>[] buckets = new List[BUCKET_SIZE];
	
    /** Initialize your data structure here. */
    public MyHashSet() {
    	for(int i = 0; i < BUCKET_SIZE; i++) {
    		buckets[i] = new ArrayList<Integer>();
    	}
    }
    
    private int getHash(int key) {
    	return key % BUCKET_SIZE;
    }
    
    public void add(Integer key) {
        
    	int hash = getHash(key);
    	
    	if (!contains(key))
    		buckets[hash].add(key);
    	
    }
    
    public void remove(Integer key) {
    	
    	int hash = getHash(key);
    	
    	if (contains(key))
    		buckets[hash].remove(key);
    }
    
    
    
    /** Returns true if this set contains the specified element */
    public boolean contains(Integer key) {
        
    	int hash = getHash(key);
    	
    	return buckets[hash].contains(key);
    	
    }
    
    public static void main(String[] args) {
		MyHashSet set = new MyHashSet();
		
		//["MyHashSet","add","add","contains","contains","add","contains","remove","contains"]
		//[[],[1],[2],[1],[3],[2],[2],[2],[2]]
		
		set.add(1);
		set.add(2);
		set.contains(1);
		set.contains(3);
		set.add(2);
		set.contains(2);
		set.remove(2);
		set.contains(2);
	}
}
