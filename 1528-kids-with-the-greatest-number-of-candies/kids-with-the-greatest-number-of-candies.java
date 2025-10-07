class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        ArrayList<Boolean> al = new ArrayList<>();
        int max = 0;
        for(int candy:candies){
            if(candy>max){
                max=candy;
            }
        }
        for(int candy:candies){
            if(candy+extraCandies>=max)
                al.add(true);
            else
                al.add(false);
        }
        return al;
        
    }
}