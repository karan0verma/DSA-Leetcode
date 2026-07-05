class Solution {
    public int maxProfit(int[] prices) {
        int min_price=prices[0];
        int profit=0;
        for(int i=0;i<prices.length;i++){
            min_price=Math.min(prices[i],min_price);
            profit=Math.max(profit, prices[i]-min_price);
        }
        return profit;
    }
}