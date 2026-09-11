// ======================================
// LeetCode Problem: best time to buy and sell stock
// Language: java
// Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// Synced by: LinkCode
// Date: 9/11/2026, 7:26:26 PM
// ======================================


class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0){
            return 0;
        }
        int min=prices[0];
        int[] profit=new int[prices.length];
        for(int i=1;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            profit[i]=prices[i]-min;
        }
        int max=0;
        for(int i=0;i<profit.length;i++){
            if(max<profit[i]){
                max=profit[i];
            }
        }
        return max;
    }
}