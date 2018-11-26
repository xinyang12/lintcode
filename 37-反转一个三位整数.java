public class Solution {
    /**
     * @param number: A 3-digit number.
     * @return: Reversed number.
     */
    public int reverseInteger(int number) {
        // write your code here
        int gewei = number % 10;
        int shiwei = (number % 100) / 10;
        int baiwei = number / 100;
        
        return gewei * 100 + shiwei * 10 + baiwei;
    }
}