public class Solution {
    /**
     * @param source: 
     * @param target: 
     * @return: return the index
     */
    public int strStr(String source, String target) {
        // Write your code here
        if (source.equals(target)) {
            return 0;
        }
        if (target.length() > source.length()) {
            return -1;
        }
        for (int i = 0; i <= source.length() - target.length(); ++i) {
            int k = i;
            int j = 0;
            while (j < target.length()) {
                if (source.charAt(k) == target.charAt(j)) {
                    ++k;
                    ++j;
                } else {
                    break;
                }
            }
            if (j == target.length()) {
                return k - j;
            }
        }
        
        return -1;
    }
}