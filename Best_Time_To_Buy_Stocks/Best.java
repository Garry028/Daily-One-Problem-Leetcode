package Best_Time_To_Buy_Stocks;

class Solution {
    public int maxProfit(int[] prices) {
        // two pointer method
        int buy=0;
        int sell=1;
        int maxP=0;
        while(sell<prices.length)
        {
            if(prices[buy]<prices[sell]) // buy at low prices and sell at high prices
            {
                int profit=prices[sell]-prices[buy];
                maxP=Math.max(maxP,profit);
            }
            else if(prices[buy]>prices[sell]){ // since buy low sell hight not satisfied we'll be increamenting the buy day
                buy = sell;
                // the left pointer will only move when the buying at low is not there
            }
            sell++;
        }
        return maxP;
    }
}
