class Solution 
{
    public int subtractProductAndSum(int n) 
    {
        int sum = 0;
        int product = 1;
        
        while (n > 0) 
        {
            int reminder = n % 10;
            
            sum = sum + reminder;
            
            product = product * reminder;
            
            n /= 10;
        }
        
        return (product - sum) ;
    }
}
