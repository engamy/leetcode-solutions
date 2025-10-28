// Last updated: 10/27/2025, 10:01:54 PM
class Solution {
    public int differenceOfSums(int n, int m) {
        
        int num1 = 0;
        int num2 = 0;

        for (int i = 1; i <= n; i++) {
            if ((i % m) == 0) { // divisible by m
                num2 += i;
            } else {
                num1 += i;
            }
        }

        return num1 - num2;

    }
}