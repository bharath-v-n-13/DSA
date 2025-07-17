class Solution {
    public int findNumbers(int[] nums) {
        
        int even = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0) return 0;
            int count = 0;
            int n = nums[i];
            while(n>0){
                count++;
                n=n/10;
            }
            if(count%2==0)
                even++;
        }
        return even;
    }
}