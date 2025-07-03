class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int j = 0; // Position to place the next non-zero

        // Move all non-zero elements to the front
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                // Swap only if i != j
                if (i != j) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
                j++;
            }
        }
    }
}
