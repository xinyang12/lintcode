public class Solution {
    /**
     * @param num: a positive number
     * @return: true if it's a palindrome or false
     */
    public boolean isPalindrome(int num) {
        // write your code here
        String numStr = String.valueOf(num);
        
        int i = 0;
        int j = numStr.length() - 1;
        while (i < j) {
            if (numStr.charAt(i++) != numStr.charAt(j--)) {
                return false;
            }
        }
        
        return true;
    }
}