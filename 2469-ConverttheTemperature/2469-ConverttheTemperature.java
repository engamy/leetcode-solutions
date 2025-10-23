// Last updated: 10/23/2025, 3:46:51 PM
class Solution {
    public double[] convertTemperature(double celsius) {
     double kelvin = celsius + 273.15;
     double fahrenheit = (celsius * 1.8) + 32.0;

     double[] ans = {kelvin, fahrenheit};

     return ans;   
    }
}