public class Solution {
    /**
     * @param num: a non-negative integer
     * @return: one digit
     */
    public int addDigits(int num) {
        // write your code here
        
        // while (num / 10 > 0) {
        //     int count = 0;
        //     count += num % 10;
        //     num /= 10;
        //     count += num;
        //     num = count;
        // }
        
        // return num;
        
        return num == 0 ? 0 : (num % 9 == 0 ? 9 : (num % 9));
    }
}