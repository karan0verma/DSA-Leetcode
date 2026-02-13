class Solution {
    public int maxArea(int[] height) {
        
        int n=height.length;
        int min_height=0;
        int i=0;
        int j=n-1;
        int width=0;
        int area=0;
        while(i<j){
           min_height=Math.min(height[i],height[j]);
            width=j-i;
            area=Math.max(area, width*min_height);
            if(height[i]<=height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        
        return area;
        
    }
}