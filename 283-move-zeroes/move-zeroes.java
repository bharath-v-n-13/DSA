class Solution {
    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void moveZeroes(int[] nums) {
        int j = -1;
        
        // find first zero
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }

        // if there are no zeros
        if (j == -1) return;

        // move non-zero elements ahead
        for (int i = j + 1; i < nums.length; i++) {
            if (nums[i] != 0) {
                swap(nums, i, j);
                j++;
            }
        }

        // print result
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
