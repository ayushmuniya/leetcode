class Solution {
    public String truncateSentence(String s, int k) 
    {
        int count = 1;
        String result ="";
        String arr[] = s.split(" ");

        for(int i=0; i< k-1; i++)
        {
            result = result + arr[i] + " ";
        }
        result = result + arr[k-1];
        return result;
    }
}
