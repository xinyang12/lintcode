public class Solution {
    /**
     * @param A: a string
     * @param B: a string
     * @return: a boolean
     */
    public boolean Permutation(String A, String B) {
        // write your code here
        if (A == null && B == null) {
            return true;
        }
        if (A == null || B == null) {
            return false;
        }
        if (A.length() != B.length()) {
            return false;
        }
        
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        
        for (int i = 0; i < A.length(); ++i) {
            if (map1.get(A.charAt(i)) != null) {
                map1.put(A.charAt(i), map1.get(A.charAt(i)) + 1);
            } else {
                map1.put(A.charAt(i), 1);
            }
        }
        
        for (int i = 0; i < B.length(); ++i) {
            if (map2.get(B.charAt(i)) != null) {
                map2.put(B.charAt(i), map2.get(B.charAt(i)) + 1);
            } else {
                map2.put(B.charAt(i), 1);
            }
        }
        
        for (int i = 0; i < A.length(); ++i) {
            if (map2.get(A.charAt(i)) == null) {
                return false;
            }
            if (map2.get(A.charAt(i)) != map1.get(A.charAt(i))) {
                return false;
            }
        }
        
        return true;
    }
}