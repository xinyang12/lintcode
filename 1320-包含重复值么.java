public class Solution {
    /**
     * @param nums: the given array
     * @return: if any value appears at least twice in the array
     */
    public boolean containsDuplicate(int[] nums) {
        // Write your code here
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i : nums) {
            if (map.get(i) != null) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        
        for (int i : nums) {
            if (map.get(i) > 1) {
                return true;
            }
        }
        
        return false;
    }
}