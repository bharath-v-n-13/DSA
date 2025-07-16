class Solution {
    public boolean isValid(String word) {
        int length = word.length();
        boolean vowel = false;
        boolean cnst = false;
        if (length < 3)
            return false;
        else {
            for (int i =0; i<length; i++) {
                char ch = word.charAt(i);
                if (!((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))) {
                    return false;
                }
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    vowel = true;
                } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                    cnst = true;
                }
            }
            if (vowel && cnst)
                return true;
            else
                return false;
        }
    }
}
