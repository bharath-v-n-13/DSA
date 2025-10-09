class Solution {
    public int largestAltitude(int[] gain) {
        int startpoint = 0;
        int maxalt=0;
        for(int i=0;i<gain.length;i++){
            startpoint +=gain[i];
            if(startpoint>maxalt){
                maxalt = startpoint;
            }
        }
        return maxalt;
    }
}