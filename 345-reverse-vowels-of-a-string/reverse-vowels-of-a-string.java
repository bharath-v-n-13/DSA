class Solution {
    public String reverseVowels(String s) {
        // Convert string to char array
        char[] chars = s.toCharArray();
        int left = 0, right = s.length() - 1;
        String vowels = "aeiouAEIOU";
        
        while (left < right) {
            // Move left pointer until vowel
            while (left < right && vowels.indexOf(chars[left]) == -1) {
                left++;
            }
            // Move right pointer until vowel
            while (left < right && vowels.indexOf(chars[right]) == -1) {
                right--;
            }
            // Swap vowels
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }
        
        return new String(chars);
    }
}
