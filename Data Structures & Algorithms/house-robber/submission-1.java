class Solution {
    public int rob(int[] nums) {
        int[][] memo = new int[nums.length][2];

        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < 2; j++) {
                memo[i][j] = -1;
            }
        }
        return robbing(0, 1, nums, memo);
    }

    int robbing(int i, int choice, int[] nums, int[][] memo) {
        if(i == nums.length) {
            return 0;
        }

        if(memo[i][choice] != -1) {
            return memo[i][choice];
        }

        if(choice == 0) {
            return robbing(i + 1, 1, nums, memo);
        }

        int ans = Math.max(nums[i] + robbing(i + 1, 0, nums, memo), 
        robbing(i + 1, 1, nums, memo));

        memo[i][choice] = ans;

        return ans;
    }
}
