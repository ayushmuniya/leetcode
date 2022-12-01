class Solution 
{
    public boolean halvesAreAlike(String s) 
    {
        s = s.toLowerCase();
        
        int vowelCountIn_a = 0;
        int vowelCountIn_b = 0;
        
        for(int i=0; i<s.length()/2; i++)
        {
            char ch = s.charAt(i);
            
            if(ch == 'a' || ch == 'e' || ch== 'i'|| ch =='o' || ch =='u')
                vowelCountIn_a ++;
        }
        
        for(int i=s.length()/2; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            
            if(ch == 'a' || ch == 'e' || ch== 'i'|| ch =='o' || ch =='u')
                vowelCountIn_b ++;
        }
        
        if(vowelCountIn_a == vowelCountIn_b)
        {
            return true;
        }
        
        else
        return false;
    }
}
