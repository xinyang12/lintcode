public class Solution {
    /**
     * @param numbers: An array of Integer
     * @param target: target = numbers[index1] + numbers[index2]
     * @return: [index1, index2] (index1 < index2)
     * 将数组中的数字放入map中，即使有两个相同的数字，第二个被第一个的索引覆盖了，也没关系
     * 只要遍历一遍数组，然后获取到最后一个符合条件的索引即可
     */
    public int[] twoSum(int[] numbers, int target) {
        // write your code here
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; ++i) {
            map.put(numbers[i], i);
        }
        
        for (int i = 0; i < numbers.length; ++i) {
            Integer needNumber = target - numbers[i];
            if (map.get(needNumber) != null) {
                return new int[] {i, map.get(needNumber)};
            }
        }
        
        return new int[] {0, 0};
    }
}