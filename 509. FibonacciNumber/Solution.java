class Solution 
{
    public int fib(int n)
    {
        if(n <= 1)
            return n;
        
		int num1 = 0, num2 = 1;
		
		while(n-- > 1)
		{
			int nextNumber = num1 + num2;
			num1 = num2;
			num2 = nextNumber;
		}
        return num2;
    }
}
