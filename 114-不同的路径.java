public class Solution {
    /**
     * @param m: positive integer (1 <= m <= 100)
     * @param n: positive integer (1 <= n <= 100)
     * @return: An integer
     */
    public int uniquePaths(int m, int n) {
        // write your code here
        if (m == 0 || n == 0) {
            return 0;
        }
        if (m == 1 || n == 1) {
            return 1;
        }
        int[][] dim = new int[m][n];
        for (int i = 0; i < m; ++i) {
            dim[i][0] = 1;
        }
        for (int i = 0; i < n; ++i) {
            dim[0][i] = 1;
        }

        for (int i = 1; i < m; ++i) {
            for (int j = 1; j < n; ++j) {
                dim[i][j] = dim[i - 1][j] + dim[i][j - 1];
            }
        }

        return dim[m - 1][n - 1];
    }
}
