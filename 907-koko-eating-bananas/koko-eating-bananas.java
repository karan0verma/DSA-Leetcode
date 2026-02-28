class Solution{
    public  static int minEatingSpeed (int[] piles,int h){
        int low=1;
        int high=0;
        for(int Banana:piles){
            high=Math.max(high,Banana);
        }
        int ans=0;
        while(low<=high){
            int mid=low+((high-low)/2);
            if(KyaBanana(mid,piles,h)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static boolean KyaBanana(int mid, int []piles, int h){
        long TotalTime=0;
        for(int i=0;i<piles.length;i++){
            TotalTime+=piles[i]/mid;
            if(piles[i]%mid!=0){
                TotalTime++;
            }
        }
        return TotalTime<=h;
    }
}