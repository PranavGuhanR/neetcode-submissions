class Solution {
    public int maxProfit(int[] prices) {
        int lm=-1;
        int ans=0;
        for (int i=prices.length-1;i>=0;i--)
        {
            ans=Math.max(ans,lm-prices[i]);
            lm=Math.max(lm,prices[i]);   
        } 
        return ans;   
    }
}
