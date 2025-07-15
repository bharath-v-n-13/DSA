class Solution {
    int find(int[] arr) {
        int high = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > high) {
                high = arr[i];
            }
        }
        return high;
    }

    public int largestAltitude(int[] gain) {
        int[] alternateArr = new int[gain.length + 1];
        alternateArr[0] = 0;

        for (int i = 0; i < gain.length; i++) {
            alternateArr[i + 1] = alternateArr[i] + gain[i];
        }

        int highest = find(alternateArr);
        return highest;
    }
}
