class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0, count = 0;
        for(int num :nums){
            if(num ==1){
                count++;
                maxCount = Math.max(maxCount , count);
            }else{
                count = 0;
            }
        }
        return maxCount;
    }
}