public class Solution {
    /**
     * @param nums: An integer array
     * @return: nothing
     */
    public void recoverRotatedSortedArray(List<Integer> nums) {
        // write your code here
        if (nums == null || nums.size() == 0 || nums.size() == 1) {
            return;
        }
        int i;
        for (i = 1; i < nums.size(); ++i) {
            if (nums.get(i - 1) > nums.get(i)) {
                break;
            }
        }
        if (i == nums.size()) {
            return;
        }

        List<Integer> result = new ArrayList<>();
        result.addAll(nums.subList(i, nums.size()));
        result.addAll(nums.subList(0, i));

        nums.clear();
        nums.addAll(result);
    }
}
