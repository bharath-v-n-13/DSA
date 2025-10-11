class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0; // pointer for the next non-zero position

        // move all non-zero elements forward
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }

        // print for verification
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
