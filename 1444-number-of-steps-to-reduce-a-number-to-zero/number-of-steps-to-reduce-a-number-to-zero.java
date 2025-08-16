class Solution {
    public int numberOfSteps(int n) {
        int m = 0;
        while (n > 0) {
            if (n % 2 == 0) {
                n /= 2;  
            } else {
                n -= 1; 
            }
            m++;
        }
        return m;
    }
}