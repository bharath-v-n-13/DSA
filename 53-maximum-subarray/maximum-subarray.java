class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Either start new subarray or extend current one
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // Track the best so far
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
