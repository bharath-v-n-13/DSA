class Solution {
    public int reverse(int x) {
        
        int numNeg=Math.abs(x);
        long rev=0;
        int rem;
        while(numNeg>0){
            rem = numNeg%10;
            rev = rev*10+rem;
            numNeg/=10;
        }
        if(rev>Integer.MAX_VALUE)return 0;
        if(x<0){
            return (int)-rev;
        }else{
        return (int)rev;
        }
    }
}