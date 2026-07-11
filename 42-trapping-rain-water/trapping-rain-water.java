class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int i=0;
        int j=n-1;
        int leftmax=0;
        int rightmax=0;
        int area=0;
        while(i<=j){
        if(leftmax<height[i]){
            leftmax=height[i];
        }
        if(rightmax<height[j]){
            rightmax=height[j];
        }
        if(leftmax<rightmax){
            area+= leftmax-height[i];
            i++;
        }
        else {
            area+=rightmax-height[j];
            j--;
        }
        }
        return area;
    }
}