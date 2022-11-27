class Solution 
{
    public int[] getConcatenation(int[] nums) 
    {
        int[] ans = new int[nums.length*2];
        
        int len = nums.length;
        
        for(int i=0;i<nums.length;i++)
        {
            ans[i]=nums[i];
            ans[i+len]=nums[i];
        }
        return ans;
    }
}
