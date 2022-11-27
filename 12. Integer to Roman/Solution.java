class Solution {
    public String intToRoman(int num) 
    {
        int arrInteger[]= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String arrString[]= {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String ans="";
        int i=0;
        while(num>0)
        {

            while(num-arrInteger[i]<0)
            {
                i++;
            }
            ans=ans+arrString[i];
            num=num-arrInteger[i];
        }
        return ans;

    }
}
