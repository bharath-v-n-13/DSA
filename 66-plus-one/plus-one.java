class Solution {
    //re-submitted for to push into github
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]+1!=10){
                digits[i] += 1;
                return digits;
            }else{
                digits[i]=0;
            }
        }
            int[] newdigits = new int[digits.length+1];
            newdigits[0] = 1;
            return newdigits;
    }
}