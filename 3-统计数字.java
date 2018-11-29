public class Solution {
    /**
     * @param k: An integer
     * @param n: An integer
     * @return: An integer denote the count of digit k in 1..n
     */
    public int digitCounts(int k, int n) {
        // write your code here
        int count = 0;
        for (int i = 1; i <= n; ++i) {
            int tmp = i;
            while (tmp != 0) {
                if (tmp % 10 == k) {
                    ++count;
                }
                tmp /= 10;
            }
        }
        if (k == 0) {
            ++count;
        }

        return count;
    }
}