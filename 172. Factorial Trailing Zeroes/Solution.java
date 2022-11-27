class Solution {
    public int trailingZeroes(int n) 
    {
        long res = 0;
        for (int i=5; i<=n; i=i*5)
        {
            res = res + n/i;
        }
        return (int) res;
    }
}
