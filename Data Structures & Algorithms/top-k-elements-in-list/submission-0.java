class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a, b) -> a.frequency - b.frequency
        );
        int[] ans = new int[k];

        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.add(new Pair(entry.getValue(), entry.getKey()));
        }

        for(int i = 0; i < map.size() - k; i++) {
            pq.poll();
        }


        int i = 0; 
        for(Pair pair: pq) {
            ans[i] = pair.digit;
            i = i + 1;
        }

        return ans;

    }
}

class Pair{
        int frequency;
        int digit;

        Pair(int frequency, int digit) {
            this.frequency = frequency;
            this.digit = digit; 
        }
    }
