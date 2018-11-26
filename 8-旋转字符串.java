public class Solution {
    /**
     * @param str: An array of char
     * @param offset: An integer
     * @return: nothing
     */
    public void rotateString(char[] str, int offset) {
        // write your code here
        if (offset == 0 || str.length == 0 || str.length == 1) {
            return;
        }
        
        offset %= str.length;
        
        for (int i = 0; i < offset; ++i) {
            char tmp = str[str.length - 1];
            for (int j = str.length - 1; j > 0; --j) {
                str[j] = str[j - 1];
            }
            str[0] = tmp;
        }
    }
}