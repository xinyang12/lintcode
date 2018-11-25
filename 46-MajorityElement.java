public class Solution {
    /*
     * @param nums: a list of integers
     * @return: find a  majority number
     */
    public int majorityNumber(List<Integer> nums) {
        // write your code here
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer num : nums) {
            if (map.get(num) != null) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        
        for (Integer num : nums) {
            if (map.get(num) > nums.size() / 2) {
                return num;
            }
        }
        
        return 0;
    }
}