class Solution 
{
    public double[] convertTemperature(double celcius) 
    {
        double[] ans = new double[2];
        double kelvin = 0;
        double farhn = 0;
        
        kelvin = celcius + 273.15;
        farhn = celcius * 1.80+32.00;
        
        ans[0] = kelvin;
        ans[1] = farhn;
        
        return ans;
    }
}
