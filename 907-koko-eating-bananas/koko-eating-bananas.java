class Solution {

    public static boolean kyaBanana(int mid,int []piles,int h){
     long totalTime =0;
        for(int i=0;i<piles.length;i++){
           totalTime +=piles[i]/mid;
            if(piles[i]%mid!=0)
            {
                // totalTime+=totalTimes +1;
                totalTime++;
            }
        }
        return totalTime<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=0;
        for(int banana:piles)
        {
            high=Math.max(high,banana);
        }
        int ans=0;
        while(low<=high)
        {
            int mid=low+((high-low)/2);
            if(kyaBanana(mid,piles,h))
            {
                ans=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return ans;
    }
}