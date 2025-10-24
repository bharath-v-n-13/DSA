class Solution {
    public boolean isSubsequence(String s, String t) {
        int n= s.length();
       if(n==0)
        return true;
        int i = 0;
        int j = 0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
        }
        return i==s.length();
    }
}