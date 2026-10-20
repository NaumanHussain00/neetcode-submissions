class Solution {
    public int minCostClimbingStairs(int[] cost) {
        HashMap<Integer, Integer> memo = new HashMap<>();
        return Math.min(climb(0, cost, memo), climb(1, cost, memo));
    }

    int climb(int i, int[] cost, HashMap<Integer, Integer> memo) {
        int n = cost.length;
        if(i == n) {
            return 0;
        }

        if(i == n - 1) {
            return cost[n - 1];
        }

        if(memo.containsKey(i)) {
            return memo.get(i);
        }
        int ans = cost[i] + Math.min(climb(i + 1, cost, memo), 
        climb(i + 2, cost, memo));
        
        memo.put(i, ans);
        return ans; 
    }
}
