class Solution {
    public int heightChecker(int[] heights) {
        int count = 0;
        int[] surya = new int[heights.length];
        for(int j=0;j<heights.length;j++)
            surya[j] = heights[j];
        
        Arrays.sort(heights);
        for(int i =0;i<heights.length;i++){
            if(surya[i]!=heights[i]){
                count++;
            }
        }
        return count;
    }
}
