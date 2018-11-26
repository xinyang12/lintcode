public class Solution {
    /**
     * @param num: an integer
     * @return: returns true when it is a perfect number and false when it is not
     */
    public boolean checkPerfectNumber(int num) {
        if (num == 1) {
            return false;
        }
        // write your code here
        int count = 1;
        for (int i = 2; i * i <= num; ++i) {
            if (num % i == 0) {
                count += num / i;
                count += i;
            }
        }
        
        return count == num;
    }
}