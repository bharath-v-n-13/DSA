class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        int start = 1, end = x, ans = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Avoiding multiplication overflow
            if ((long)mid * mid == x) {
                return mid;
            } else if ((long)mid * mid < x) {
                ans = mid;         // store the floor of sqrt
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return ans;
    }
}
