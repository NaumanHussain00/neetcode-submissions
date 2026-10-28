class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int start = 0;
        int end = m * n - 1;

        while(start <= end) {
            int mid = (start + end) / 2;
            int index1 = singleIndexToDoubleIndex(m, n, mid)[0];
            int index2 = singleIndexToDoubleIndex(m, n, mid)[1]; 
            if(matrix[index1][index2] == target) {
                return true;
            }
            if(matrix[index1][index2] < target) {
                start = mid + 1;
            }
            if(matrix[index1][index2] > target) {
                end = mid - 1;
            }
        }
        return false;
    }

    int[] singleIndexToDoubleIndex(int m, int n, int index) {
        int[] ans = new int[2];
        ans[0] = index / n;
        ans[1] = index % n;
        return ans;
    }
}
