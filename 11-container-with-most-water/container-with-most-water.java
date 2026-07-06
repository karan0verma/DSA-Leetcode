class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int MaxArea=0;
        int i=0;
        int j=n-1;
        while(i<j){
            int width=j-i;
            int Area= width*Math.min(height[i],height[j]);
            MaxArea= Math.max(MaxArea, Area);
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return MaxArea;
    }
}