public class Solution {
    /**
     * @param A: An integer array
     * @return: An integer
     * 这个题使用map的话就很简单，但是要是按照高级要求只遍历一次，使用常数级的额外空间复杂度就不简单了
     */
    public int singleNumberII(int[] A) {
        // write your code here
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : A) {
            if (map.get(i) != null) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        
        for (int i : A) {
            if (map.get(i) == 1) {
                return i;
            }
        }
        
        return 0;
    }
}