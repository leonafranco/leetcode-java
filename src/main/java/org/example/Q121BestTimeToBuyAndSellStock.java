package org.example;

public class Q121BestTimeToBuyAndSellStock {

    class Solution {
        public int maxProfit(int[] prices) {
            int lowerValue = prices[0];
            int mostProfit = 0;
            int profit = 0;
            for(int i = 0; i < prices.length; i++){
                if(prices[i] < lowerValue) {
                    lowerValue = prices[i];
                }
                profit = - lowerValue + prices[i];
                if(mostProfit < profit) {
                    mostProfit = profit;
                }

            }
            return mostProfit;
        }
    }
}
