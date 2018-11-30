public class Solution {
    /*
     * @param A: A list of integers
     * @param elem: An integer
     * @return: The new length after remove
     */
    public int removeElement(int[] A, int elem) {
        // write your code here
        if (A.length == 0) {
            return 0;
        }
        int i = 0;
        int j = A.length - 1;
        while (i < j) {
            while (A[i] != elem && i < j) {
                ++i;
            }
            while (A[j] == elem && i < j) {
                --j;
            }

            int tmp = A[i];
            A[i] = A[j];
            A[j] = tmp;
        }

        if (A[i] == elem) {
            return i;
        } else {
            return i + 1;
        }
    }
}