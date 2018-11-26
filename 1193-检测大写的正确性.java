public class Solution {
    /**
     * @param word: a string
     * @return: return a boolean
     */
    public boolean detectCapitalUse(String word) {
        // write your code here
        if (word == null) {
            return false;
        }
        
        return isAllUpperCase(word) || isAllLowerCase(word) || isCapital(word);
    }
    
    public boolean isUpperCase(char ch) {
        return ch >= 'A' && ch <= 'Z';
    }
    
    public boolean isAllUpperCase(String str) {
        for (int i = 0; i < str.length(); ++i) {
            if (!isUpperCase(str.charAt(i))) {
                return false;
            }
        }
        
        return true;
    }
    
    public boolean isAllLowerCase(String str) {
        for (int i = 0; i < str.length(); ++i) {
            if (isUpperCase(str.charAt(i))) {
                return false;
            }
        }
        
        return true;
    }
    
    public boolean isCapital(String str) {
        for (int i = 1; i < str.length(); ++i) {
            if (isUpperCase(str.charAt(i))) {
                return false;
            }
        }
        
        return isUpperCase(str.charAt(0));
    }
}