class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>(); 
        int ans = 0;

        for(int num: nums) {
            set.add(num);
        }

        for(int num: set) {
            if ( !set.contains(num - 1) ) {
                int current = num;
                int count = 1;

                while(set.contains(current + 1)) {
                    count = count + 1;
                    current = current + 1;
                }

                ans = Math.max(ans, count);
            }
        }
        return ans;
    }
}
