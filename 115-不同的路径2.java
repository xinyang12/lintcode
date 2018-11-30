public class Solution {
    /**
     * @param obstacleGrid: A list of lists of integers
     * @return: An integer
     */
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // write your code here
        int m = obstacleGrid.length;
        if (m == 0) {
            return 0;
        }
        if (obstacleGrid[0][0] == 1) {
            return 0;
        }

        int n = obstacleGrid[0].length;
        int[][] array = new int[m][n];
        array[0][0] = 1;

        for (int i = 1; i < m; ++i) {
            if (obstacleGrid[i][0] != 1 && array[i - 1][0] != 0) {
                array[i][0] = 1;
            }
        }

        for (int i = 1; i < n; ++i) {
            if (obstacleGrid[0][i] != 1 && array[0][i - 1] != 0) {
                array[0][i] = 1;
            }
        }

        for (int i = 1; i < m; ++i) {
            for (int j = 1; j < n; ++j) {
                if (obstacleGrid[i][j] != 1) {
                    array[i][j] = array[i - 1][j] + array[i][j - 1];
                }
            }
        }

        return array[m - 1][n - 1];
    }
}