public class Solution {
    /**
     * @param s: The first string
     * @param t: The second string
     * @return: true or false
     */
    public boolean anagram(String s, String t) {
        // write your code here
        if (s == null && t == null) {
            return true;
        }
        if (s == null || t == null) {
            return false;
        }
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); ++i) {
            if (sMap.get(s.charAt(i)) != null) {
                sMap.put(s.charAt(i), sMap.get(s.charAt(i)) + 1);
            } else {
                sMap.put(s.charAt(i), 1);
            }
        }

        for (int i = 0; i < t.length(); ++i) {
            if (tMap.get(t.charAt(i)) != null) {
                tMap.put(t.charAt(i), tMap.get(t.charAt(i)) + 1);
            } else {
                tMap.put(t.charAt(i), 1);
            }
        }

        for (int i = 0; i < s.length(); ++i) {
            if (tMap.get(s.charAt(i)) == null) {
                return false;
            }
            if (!tMap.get(s.charAt(i)).equals(sMap.get(s.charAt(i)))) {
                return false;
            }
        }
        
        return true;
    }
}