public class Solution {
    /**
     * @param A: an integer sorted array
     * @param target: an integer to be inserted
     * @return: An integer
     */
    public int searchInsert(int[] A, int target) {
        if (A.length == 0) {
            return 0;
        }
        // write your code here
        int low = 0;
        int high = A.length - 1;
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (A[mid] > target) {
                high = mid - 1;
            } else if (A[mid] < target) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        
        if (target > A[low]) {
            return low + 1;
        } else {
            return low;
        }
    }
}