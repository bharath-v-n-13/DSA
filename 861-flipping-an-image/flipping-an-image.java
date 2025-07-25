class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for(int i=0;i<n;i++){
            int leftt = 0,rightt = image[i].length-1;
            while(leftt<=rightt){
                if(image[i][leftt]==image[i][rightt]){
                    image[i][leftt]=1-image[i][leftt];
                    image[i][rightt]=image[i][leftt];
                }else{

                }
                leftt++;
                rightt--;
            }
        }return image;
    }
}