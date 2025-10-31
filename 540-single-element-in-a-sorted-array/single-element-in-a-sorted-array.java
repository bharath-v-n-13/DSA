import java.util.HashMap;
import java.util.Map;

class Solution {
    public int singleNonDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();

        // Count frequencies
        for(int c : nums){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Find element with frequency 1
        for(int key : map.keySet()){
            if(map.get(key) == 1)
                return key;
        }

        return -1; // if no single element found (optional)
    }
}
