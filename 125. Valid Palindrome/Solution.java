class Solution {
    public boolean isPalindrome(String s) 
    {
        // Remove all non-alphanumeric characters and convert to lowercase
        s = s.toLowerCase();

        StringBuilder filtered = new StringBuilder();

        for (char c : s.toCharArray()) 
        {
            if (Character.isLetterOrDigit(c)) 
            {
                filtered.append(c);
            }
        }
        
        s = filtered.toString();
        
        // Check if the string is a palindrome
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
