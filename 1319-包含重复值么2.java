public class Solution {
    /**
     * @param nums: the given array
     * @param k: the given number
     * @return:  whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
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
                for (int j = 1; j <= k; ++j) {
                    if ((i + j < nums.length) && nums[i + j] == nums[i]) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}