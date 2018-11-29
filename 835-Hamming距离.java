public class Solution {
    /**
     * @param x: an integer
     * @param y: an integer
     * @return: return an integer, denote the Hamming Distance between two integers
     */
    public int hammingDistance(int x, int y) {
        // write your code here
        int n = x ^ y;
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                ++count;
            }
            n >>= 1;
        }

        return count;
    }
}