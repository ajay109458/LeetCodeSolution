
public class MinCost {

	public int minCostClimbingStairs(int[] cost) {
		return minCost(cost, 0);
	}
	
	public int minCost(int[] cost, int index) {
		
		if (index >= cost.length)
			return 0;
		
		return Math.min(minCost(cost, index + 1), minCost(cost, index+2)) + cost[index];
	}

}
