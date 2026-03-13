class Solution {
    public int climbStairs(int n){
        int [] dp= new int [n+1];
        for(int i=0;i<=n;i++){
            dp[i]=-1;
        }
        return solve(n , dp);
    }
    public int solve(int n ,int[]dp) {
        if(n==0) return 1;
        if(n<0) return 0;
        if(dp[n] != -1) return dp[n];
        int Take=solve(n-1, dp);
        int nottake=solve(n-2, dp);
        return dp[n] = Take+ nottake;
    }
}