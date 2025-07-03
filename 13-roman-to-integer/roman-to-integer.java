class Solution {
    //re-submitted to push into github
    public int romanToInt(String s) {
        int total = 0;
        int prevValue = 0;
        for(int i=s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            int current = 0;
            if(ch == 'I') current = 1;
            else if(ch == 'V') current = 5;
            else if(ch == 'X') current = 10;
            else if(ch == 'L') current = 50;
            else if(ch == 'C') current =100;
            else if(ch =='D') current = 500;
            else if(ch == 'M') current =1000;

            if(current < prevValue){
                total -= current;
            }else{
                total+=current;
            }
            prevValue = current;
        }
        return total;
        
    }
}