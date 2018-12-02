public class Solution {
    /**
     * @param grid: a list of lists of integers
     * @return: An integer, minimizes the sum of all numbers along its path
     */
    public int minPathSum(int[][] grid) {
        // write your code here
        int m = grid.length;
        if (m == 0) {
            return 0;
        }
        int n = grid[0].length;

        int[][] array = new int[m][n];
        array[0][0] = grid[0][0];

        for (int i = 1; i < m; ++i) {
            array[i][0] = array[i - 1][0] + grid[i][0];
        }
        
        for (int i = 1; i < n; ++i) {
            array[0][i] = array[0][i - 1] + grid[0][i];
        }
        
        for (int i = 1; i < m; ++i) {
            for (int j = 1; j < n; ++j) {
                array[i][j] = Math.min(array[i - 1][j], array[i][j - 1]) + grid[i][j];
            }
        }
        
        return array[m - 1][n - 1];
    }
}