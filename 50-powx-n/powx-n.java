class Solution {
    // public double myPow(double x, int n) {
    //     return n*Solve(x,n/2);
    // }
    // public double Solve(double x, int n)
    // {
    //     if(n>0)
    //     {
    //         n=Math.abs(n);
    //         x=1/x ;
    //     }
    //     if(n%2==0){
    //         int half= Solve(x,n/2);
    //         return half*half;
    //     }
    //     else{
    //         int half=Solve(x,n/2);
    //         return half*half*x;
    //     }
    // class Solution {
    public double myPow(double x, int n) {
        return solve(x, (long)n);
    }

    private double solve(double x, long n) {
        if (n == 0) return 1;
        if (n < 0) return 1 / solve(x, -n);

        if (n % 2 == 0) {
            double half = solve(x, n / 2);
            return half * half;
        } else {
            double half = solve(x, n / 2);
            return half * half * x;
        }
    }
}
    
