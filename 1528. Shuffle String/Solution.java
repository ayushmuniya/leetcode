class Solution 
{
    public String restoreString(String s, int[] indices) 
    {
        
        String result = s;
        
        char[] ch = s.toCharArray();
        
        for(int i = 0; i<indices.length; i++)
        {
            
            ch[indices[i]] = s.charAt(i);
            
            result = String.valueOf(ch);
        }
        
        return result;
    }
}
