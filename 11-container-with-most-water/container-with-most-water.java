class Solution {
    public int maxArea(int[] height) {
//         int n=height.length;
//         int maxArea=0;
//         for(int i=0;i<n;i++){
//     for(int j=i+1;j<n;j++){
//        int area=(j-i)*Math.min(height[i],height[j]);
//                       maxArea = Math.max(maxArea, area);
//     }
// }
// return maxArea;
        int n=height.length;
        int maxArea=0;
        // int minheight=0;
        int width=0;
        int i=0;
        int j=n-1;
        while(i<j){
            width=j-i;
            int area=width*Math.min(height[i],height[j]);
            maxArea=Math.max(maxArea,area);
            if(height[i]<=height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return maxArea;
    }
}