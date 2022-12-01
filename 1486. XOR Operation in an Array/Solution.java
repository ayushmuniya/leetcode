class Solution 
{
    public int xorOperation(int n, int start) 
    {
        int result = 0;
        
        int i = 0;

        while(i < n)
        {
            int value = start + 2*i;
            result ^= value;
            
            i++;
        }

        return result;
    }
}
