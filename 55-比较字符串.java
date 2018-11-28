public class Solution {
    /**
     * @param A: A string
     * @param B: A string
     * @return: if string A contains all of the characters in B return true else return false
     */
    public boolean compareStrings(String A, String B) {
        // write your code here
        // Map实现
        if (A == null && B == null) {
            return true;
        }
        if (A == null) {
            return false;
        }
        if (B == null) {
            return true;
        }
        if (A.length() < B.length()) {
            return false;
        }
        Map<Character, Integer> aMap = new HashMap<>();
        Map<Character, Integer> bMap = new HashMap<>();

        for (int i = 0; i < A.length(); ++i) {
            if (aMap.get(A.charAt(i)) != null) {
                aMap.put(A.charAt(i), aMap.get(A.charAt(i)) + 1);
            } else {
                aMap.put(A.charAt(i), 1);
            }
        }

        for (int i = 0; i < B.length(); ++i) {
            if (bMap.get(B.charAt(i)) != null) {
                bMap.put(B.charAt(i), bMap.get(B.charAt(i)) + 1);
            } else {
                bMap.put(B.charAt(i), 1);
            }
        }

        for (int i = 0; i < B.length(); ++i) {
            if (aMap.get(B.charAt(i)) == null || aMap.get(B.charAt(i)) < bMap.get(B.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    public boolean compareStrings2(String A, String B) {
        // write your code here
        // 数组实现
        if (A == null && B == null) {
            return true;
        }
        if (A == null) {
            return false;
        }
        if (B == null) {
            return true;
        }
        if (A.length() < B.length()) {
            return false;
        }

        int[] aArr = new int[26];
        int[] bArr = new int[26];
        for (int i = 0; i < A.length(); ++i) {
            aArr[A.charAt(i) - 'A']++;
        }

        for (int i = 0; i < B.length(); ++i) {
            bArr[B.charAt(i) - 'A']++;
        }

        for (int i = 0; i < B.length(); ++i) {
            int offset = B.charAt(i) - 'A';
            if (aArr[offset] == 0 || aArr[offset] < bArr[offset]) {
                return false;
            }
        }
        
        return true;
    }
}