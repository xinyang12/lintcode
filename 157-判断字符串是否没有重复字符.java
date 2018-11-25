public class Solution {
    /*
     * @param str: A string
     * @return: a boolean
     */
    public boolean isUnique(String str) {
        // write your code here
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); ++i) {
            if (map.get(str.charAt(i)) != null) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            } else {
                map.put(str.charAt(i), 1);
            }
        }

        for (int i = 0; i < str.length(); ++i) {
            if (map.get(str.charAt(i)) > 1) {
                return false;
            }
        }

        return true;
    }
}