class Solution {
    public int maxProfit(int[] prices) {
        int l=0;
        int r=1;
        int maxp=0;
        int len=prices.length;
        while(r<len)
        {
            if(prices[l]<prices[r])
            {
                int profit=prices[r]-prices[l];
                maxp=Math.max(maxp,profit);
            }
            else
            {
                l=r;
            }
            r++;
        }
        return maxp;
    }
}
