class Solution {
    public int missingNumber(int[] arr) {
        int n=arr.length;
        int sums=n*(n+1)/2;
        int nums=0;
        for(int i=0;i<n;i++){
            nums= nums+arr[i];
        }
        int ans=sums-nums;
        return ans;

        
    }
}