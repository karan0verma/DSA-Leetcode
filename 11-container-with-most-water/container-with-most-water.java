class Solution {
    public int maxArea(int[] height) {
      int n=height.length;
      int maxarea=0;
      int width=0;
      int minheight=0;
      int i=0;
      int j=n-1;
      while(i<j){
        width=j-i;
        int  area= width*Math.min(height[i], height[j]);
        maxarea=Math.max(maxarea, area);
        if(height[i]<height[j]){
            i++;
        }
        else{
            j--;
        }
      }
      return maxarea;
    }
}