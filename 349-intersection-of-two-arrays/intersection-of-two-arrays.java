class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       Set<Integer> set = new HashSet<Integer>();
        
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j]){
                    set.add(nums2[j]);
                }
            }
        }
        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }

        return result;
    }
}