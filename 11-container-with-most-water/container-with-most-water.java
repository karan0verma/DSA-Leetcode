class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int MaxArea=0;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         int area=(j-i)*Math.min(height[i],height[j]); Brute Force////
        //         MaxArea=Math.max(MaxArea,area);
        //     }
        // }
        // return MaxArea;
        int i=0;
        int j=n-1;
        // int width=0;
        while(i<j){
         int    width=j-i;
            int area=width*Math.min(height[i],height[j]);
            MaxArea=Math.max(area, MaxArea);
            if(height[i]<=height[j]){
            i++;
        }
        else{
            j--;
        }
        }
        return MaxArea;
    }
}