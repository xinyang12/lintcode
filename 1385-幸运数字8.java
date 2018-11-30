public class Solution {
    /**
     * @param n: count lucky numbers from 1 ~ n
     * @return: the numbers of lucky number
     */
    public int luckyNumber(int n) {
        // Write your code here
        int count = 0;
        for (int i = 8; i <= n; ++i) {
            int tmp = i;
            boolean flag = false;
            while (tmp > 0) {
                if (flag) {
                    break;
                }
                if (tmp % 10 == 8) {
                    ++count;
                    flag = true;
                }
                tmp /= 10;
            }
        }

        return count;
    }
}
