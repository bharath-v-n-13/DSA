class Solution {
    public int getMaximumGenerated(int n) {

        if (n == 0) return 0;
        if (n == 1) return 1;

        int[] nums = new int[n + 1];
        nums[0] = 0;
        nums[1] = 1;

        int max = 1;

        for (int i = 2; i <= n; i++) {
            
            int half = i / 2;

            if (i % 2 == 0) {
                nums[i] = nums[half];
            } else {
                nums[i] = nums[half] + nums[half + 1];
            }
            
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
}
