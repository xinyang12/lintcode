public class Solution {
    /**
     * @param str: str: the given string
     * @return: char: the first unique character in a given string
     */
    public char firstUniqChar(String str) {
        // Write your code here
        if (str.length() == 1) {
            return str.charAt(0);
        }
        Map<Character, Integer> map = new HashMap<>();
        
        for (int i = 0; i < str.length(); ++i) {
            if (map.get(str.charAt(i)) != null) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            } else {
                map.put(str.charAt(i), 1);
            }
        }
        
        for (int i = 0; i < str.length(); ++i) {
            if (map.get(str.charAt(i)) == 1) {
                return str.charAt(i);
            }
        }
        
        return '0';
    }
}