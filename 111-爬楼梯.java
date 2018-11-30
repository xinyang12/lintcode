public class Solution {
    /**
     * @param n: An integer
     * @return: An integer
     */
    public int climbStairs(int n) {
        // write your code here
        // 用递归会超时
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int[] array = new int[n + 1];
        array[1] = 1;
        array[2] = 2;
        for (int i = 3; i <= n; ++i) {
            array[i] = array[i - 1] + array[i - 2];
        }

        return array[n];
    }
}
