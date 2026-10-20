class Solution {
    public int climbStairs(int n) {
        HashMap<Integer, Integer> memo = new HashMap<>();
        return climb(n, 0, memo); 
    }

    int climb(int n, int i, HashMap<Integer, Integer> memo) {
        if(i == n) {
            return 1;
        }
        if(i > n) {
            return 0;
        }

        if(memo.containsKey(i)) {
            return memo.get(i);
        }

        int ans = climb(n, i + 1, memo) + climb(n, i + 2, memo);
        memo.put(i, ans);

        return ans;
    }
}
