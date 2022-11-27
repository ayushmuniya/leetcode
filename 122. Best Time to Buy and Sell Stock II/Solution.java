class Solution 
{
    public int maxProfit(int[] prices) 
    {
        int totalProfit = 0;

        for(int i =1 ; i<prices.length; i++)
        {
            totalProfit = totalProfit + Math.max(prices[i]- prices[i-1],0);

        } 
        return totalProfit;
    }
}
