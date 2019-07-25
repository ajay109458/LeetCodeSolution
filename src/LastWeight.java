import java.util.Collections;
import java.util.PriorityQueue;

public class LastWeight {

	public int lastStoneWeight(int[] stones) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int stone : stones) {
        	pq.add(stone);
        }
        
        while(pq.size() > 1) {
        	
        	int s1 = pq.poll();
        	int s2 = pq.poll();
        	
        	int diff = Math.abs(s1 - s2);
        	
        	if (diff > 0)
        		pq.add(diff);
        }
        
        if (pq.size() == 1)
        	return pq.peek();
        return 0;
    }

}
