class Solution {
    public int maxProfit(int[] prices) {
        
        int profit=0, min=prices[0];
        for(int i=1;i<prices.length;i++)
        {
            profit=Math.max(profit, prices[i]-min);
            min=Math.min(min, prices[i]);
        }
        return profit;
        
    }
}

/*

int maxprof=0;
        for(int i=0;i<prices.length;i++)
        {
            for(int j=i+1;j<prices.length;j++)
            {
                maxprof=Math.max(maxprof, prices[j]-prices[i]);
            }
        }
        
        return maxprof;
        
        */