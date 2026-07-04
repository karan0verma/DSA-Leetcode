class Solution {
   public static int maxProfit(int[] prices){
   int n=prices.length;
   int min_price=prices[0];
   int profit=0;
   for(int i=0;i<n;i++){
    min_price=Math.min(prices[i],min_price);
    profit=Math.max(profit, prices[i]-min_price);
   }
   return profit;
   }
}