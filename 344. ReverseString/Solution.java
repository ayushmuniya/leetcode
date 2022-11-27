class Solution 
{
    public void reverseString(char[] s) 
    {
        int start = 0; //start pointer
        int end = s.length - 1 ; //end pointer
        
         //swapping the characters in the string
        while(start < end)
        {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            
            start++;
            end--;
        }
        
        
    }
}
