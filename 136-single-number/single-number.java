class Solution {
    public int singleNumber(int[] nums) {
        int finalNumber = 0;
        for(int i=0;i<nums.length;i++){
            finalNumber = finalNumber ^ nums[i];
        }
         return finalNumber;
    }
}
