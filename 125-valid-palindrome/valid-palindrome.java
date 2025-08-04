class Solution {
    public boolean isPalindrome(String s) {
        String[] narr = s.split("[^A-Za-z0-9]+");
        String nstr = "";
        for (String w : narr) {
            nstr += w.toLowerCase();  
        }
        String rev = "";
        for (int i = nstr.length() - 1; i >= 0; i--) {
            rev += nstr.charAt(i);
        }
        return nstr.equals(rev);
    }
}
