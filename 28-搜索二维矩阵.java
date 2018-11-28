public class Solution {
    /**
     * @param matrix: matrix, a list of lists of integers
     * @param target: An integer
     * @return: a boolean, indicate whether matrix contains target
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        // write your code here
        int i = matrix.length;
        if (i == 0) {
            return false;
        }
        int j = matrix[0].length;

        if (matrix[0][0] > target || matrix[i - 1][j - 1] < target) {
            return false;
        }

        int low = 0;
        int high = i - 1;

        int resultRow = 0;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (matrix[mid][0] > target) {
                if (matrix[mid - 1][0] < target) {
                    resultRow = mid - 1;
                    break;
                } else {
                    high = mid - 1;
                    resultRow = high;
                }
            } else if (matrix[mid][0] < target) {
                if (matrix[mid + 1][0] > target) {
                    resultRow = mid;
                    break;
                } else {
                    low = mid + 1;
                    resultRow = low;
                }
            } else {
                return true;
            }
        }

        if (matrix[resultRow][0] > target || matrix[resultRow][j - 1] < target) {
            return false;
        }

        low = 0;
        high = j - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (matrix[resultRow][mid] < target) {
                low = mid + 1;
            } else if (matrix[resultRow][mid] > target) {
                high = mid - 1;
            } else {
                return true;
            }
        }

        return false;
    }
}