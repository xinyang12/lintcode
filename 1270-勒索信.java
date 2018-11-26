public class Solution {
    /**
     * @param ransomNote: a string
     * @param magazine: a string
     * @return: whether the ransom note can be constructed from the magazines
     */
    public boolean canConstruct(String ransomNote, String magazine) {
        // Write your code here
        Map<Character, Integer> ransomMap = new HashMap<>();
        Map<Character, Integer> magazineMap = new HashMap<>();
        
        for (int i = 0; i < ransomNote.length(); ++i) {
            if (ransomMap.get(ransomNote.charAt(i)) != null) {
                ransomMap.put(ransomNote.charAt(i), ransomMap.get(ransomNote.charAt(i)) + 1);
            } else {
                ransomMap.put(ransomNote.charAt(i), 1);
            }
        }
        
        for (int i = 0; i < magazine.length(); ++i) {
            if (magazineMap.get(magazine.charAt(i)) != null) {
                magazineMap.put(magazine.charAt(i), magazineMap.get(magazine.charAt(i)) + 1);
            } else {
                magazineMap.put(magazine.charAt(i), 1);
            }
        }
        
        for (int i = 0; i < ransomNote.length(); ++i) {
            if (magazineMap.get(ransomNote.charAt(i)) == null) {
                return false;
            }
            if (magazineMap.get(ransomNote.charAt(i)) < ransomMap.get(ransomNote.charAt(i))) {
                return false;
            }
        }
        
        return true;
    }
}