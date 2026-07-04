class Solution {
    public int missingNumber(int[] arr) {
        int n=arr.length;
        int sum=0;
        int num=n*(n+1)/2;
        int ans=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            ans=num-sum;
        }
        return ans;
    }
}