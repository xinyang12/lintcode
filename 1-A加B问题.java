public class Solution {
    /**
     * @param a: An integer
     * @param b: An integer
     * @return: The sum of a and b 
     */
    public int aplusb(int a, int b) {
        // write your code here
        // if (b == 0) {
        //     return a;
        // }
        // int sum = a ^ b;
        // int carry = (a & b) << 1;
        
        // return aplusb(sum, carry);
        int ans = 0;
        while (b != 0) {
            ans = a ^ b;
            b = (a & b) << 1;
            a = ans;
        }
        
        return a;
    }
}