public class Solution {
    /**
     * @param digits: a number represented as an array of digits
     * @return: the result
     */
    public int[] plusOne(int[] digits) {
        // write your code here
        int[] tmp = new int[digits.length + 1];

        System.arraycopy(digits, 0, tmp, 1, digits.length);

        tmp[tmp.length - 1] += 1;

        for (int i = tmp.length - 1; i > 0; --i) {
            if (tmp[i] >= 10) {
                tmp[i - 1] += tmp[i] / 10;
                tmp[i] %= 10;
            }
        }

        if (tmp[0] == 0) {
            int[] result = new int[tmp.length - 1];
            System.arraycopy(tmp, 1, result, 0, result.length);
            return result;
        }

        return tmp;
    }
}