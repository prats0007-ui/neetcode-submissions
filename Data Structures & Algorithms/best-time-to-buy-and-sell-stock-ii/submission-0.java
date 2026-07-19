class Solution {
    public int maxProfit(int[] prices) {
        int max1=0;
        for(int i=1;i<prices.length;i++){ 
            if(prices[i]>prices[i-1]){ 
                max1+= (prices[i]-prices[i-1]);
            }
        }
        return max1;
    }
}