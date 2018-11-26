public class Solution {
    /**
     * @param s: a string
     * @param t: a string
     * @return: the letter that was added in t
     */
    public char findTheDifference(String s, String t) {
        // Write your code here
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
        
        for (int i = 0; i < t.length(); ++i) {
            if (sMap.get(t.charAt(i)) == null || sMap.get(t.charAt(i)) != tMap.get(t.charAt(i))) {
                return t.charAt(i);
            }
        }
        
        return ' ';
    }
}