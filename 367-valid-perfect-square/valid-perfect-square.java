class Solution {
    public boolean isPerfectSquare(int num) {

        int sqNum = (int)Math.sqrt(num);
        int mulNum = sqNum*sqNum;
        if(num==mulNum){
            return true;
        }
        return false;
    }
}