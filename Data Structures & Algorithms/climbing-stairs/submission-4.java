class Solution {
    public int climbStairs(int n) {
        // HashMap<Integer, Integer> memo = new HashMap<>();
        // return climb(n, 0, memo);

        int[] dp = new int[n + 2];

        // dp[n] = 1;
        // dp[n + 1] = 0;

        int next2 = 0;
        int next1 = 1;
        int current = 0;

        for(int i = n - 1; i >= 0; i--) {
            current = next1 + next2;
            next2 = next1;
            next1 = current;
        }

        return current;
    }
}
//     int climb(int n, int i, HashMap<Integer, Integer> memo) {
//         if(i == n) {
//             return 1;
//         }
//         if(i > n) {
//             return 0;
//         }

//         if(memo.containsKey(i)) {
//             return memo.get(i);
//         }

//         int ans = climb(n, i + 1, memo) + climb(n, i + 2, memo);
//         memo.put(i, ans);

//         return ans;
//     }
// }
