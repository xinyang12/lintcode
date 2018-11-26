public class Solution {
    /**
     * @param nums: the arrays
     * @param k: the distance of the same number
     * @return: the ans of this question
     */
    public String sameNumber(int[] nums, int k) {
        // Write your code here
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; ++i) {
            if (map.get(nums[i]) != null) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        for (int i = 0; i < nums.length; ++i) {
            if (map.get(nums[i]) > 1) {
                for (int j = 1; j < k; ++j) {
                    if ((i + j < nums.length) && nums[i + j] == nums[i]) {
                        return "YES";
                    }
                }
            }
        }

        return "NO";
    }
}