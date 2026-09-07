class Solution {
    public int maxProfit(int[] prices) {
        int l=0,r=1,max=0;
        while(r<prices.length){ 
            if(prices[l]<prices[r]){ 
                int res=prices[r]-prices[l];
                max=Math.max(max,res);
            }
            else{ 
                l=r;
            }
            r++;
        }
        return max;
    }

}
