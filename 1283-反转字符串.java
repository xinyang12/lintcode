public class Solution {
    /**
     * @param s: a string
     * @return: return a string
     */
    public String reverseString(String s) {
        // write your code here
        // StringBuilder sb = new StringBuilder();
        
        // for (int i = s.length() - 1; i >= 0; --i) {
        //     sb.append(s.charAt(i));
        // }
        
        // return sb.toString();
        if (s == null) {
            return null;
        }
        
        char[] result = new char[s.length()];
        
        for (int i = 0; i < s.length(); ++i) {
            result[i] = s.charAt(s.length() - 1 - i);
        }
        
        return new String(result);
    }
}