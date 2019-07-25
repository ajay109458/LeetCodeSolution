
public class LargestNumberTwice {

	public int dominantIndex(int[] nums) {
        
        int largestIndex = -1;
        int secondLargestIndex = -1;
        
        for (int i = 0 ; i < nums.length; i++) {
        	
        	if (largestIndex == -1) {
        		largestIndex = i;
        	} else {
        		if (nums[i] > nums[largestIndex]) {
        			secondLargestIndex = largestIndex;
        			largestIndex = i;
        		} else if (nums[i] < nums[largestIndex]) {
        			
        			if (secondLargestIndex == -1) {
        				secondLargestIndex = i;
        			} else if (nums[i] > nums[secondLargestIndex]){
        				secondLargestIndex = i;
        			}
        			
        		}
        	}
        }
        
        if (largestIndex != -1) {
        	
        	if (secondLargestIndex == -1)
        		return 0;
        	else if (nums[largestIndex] >= nums[secondLargestIndex] * 2 )
        		return largestIndex;
        	
        }
        
        
        return -1;
         
    }

}
