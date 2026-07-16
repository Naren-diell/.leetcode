class Solution {
    public int[] getConcatenation(int[] nums) {

        int n = nums.length;
        int[] arr = new int[n * 2];

        // Copy first half
        for (int i = 0; i < n; i++) {
            arr[i] = nums[i];
        }

        // Copy second half
        for (int j = 0; j < n; j++) {
            arr[n + j] = nums[j];
        }

        return arr;
    }
}