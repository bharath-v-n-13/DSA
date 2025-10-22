class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = -1;
        int last = -1;
        int[] res = new int[2];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                if(first==-1)first = i;
                last = i;
            }
        }
        return new int[]{first,last};
        
    }
}