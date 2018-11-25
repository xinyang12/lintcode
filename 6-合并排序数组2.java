public class Solution {
    /**
     * @param A: sorted integer array A
     * @param B: sorted integer array B
     * @return: A new sorted integer array
     */
    public int[] mergeSortedArray(int[] A, int[] B) {
        // write your code here
        int m = A.length;
        int n = B.length;
        int[] C = new int[m + n];
        
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (A[i] < B[j]) {
                C[k++] = A[i++];
            } else {
                C[k++] = B[j++];
            }
        }
        
        while (i < m) {
            C[k++] = A[i++];
        }
        
        while (j < n) {
            C[k++] = B[j++];
        }
        
        return C;
    }
}