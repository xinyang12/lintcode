public class Solution {
    /**
     * @param s: A string
     * @return: the length of last word
     */
    public int lengthOfLastWord(String s) {
        // write your code here
        if (s == null) {
            return 0;
        }
        if (s.length() == 1 && s.charAt(0) == ' ') {
            return 0;
        }
        
        int lastIndex = s.length() - 1;
        while (lastIndex >= 0) {
            if (s.charAt(lastIndex) != ' ') {
                break;
            }
            --lastIndex;
        }
        
        int count = 0;
        for (int i = lastIndex; i >= 0; --i) {
            if (s.charAt(i) != ' ') {
                ++count;
            } else {
                break;
            }
        }
        
        return count;
    }
}