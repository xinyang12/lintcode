public class Solution {
    /**
     * @param s: a string
     * @return: whether the student could be rewarded according to his attendance record
     */
    public boolean checkRecord(String s) {
        // Write your code here
        int aCount = 0;
        int lCount = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == 'A') {
                ++aCount;
                if (aCount > 1) {
                    return false;
                }
                lCount = 0;
            } else if (s.charAt(i) == 'L') {
                ++lCount;
                if (lCount > 2) {
                    return false;
                }
            } else {
                lCount = 0;
            }
        }
        return true;
    }
}