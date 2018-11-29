public class Solution {
    /**
     * @param n: a Integer
     * @return: the first n-line Yang Hui's triangle
     */
    public List<List<Integer>> calcYangHuisTriangle(int n) {
        // write your code here
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            List<Integer> tmpList = new ArrayList<>();
            for (int j = 0; j <= i; ++j) {
                if (j == 0) {
                    tmpList.add(1);
                } else if (j == i) {
                   tmpList.add(1);
                } else {
                    tmpList.add(list.get(i - 1).get(j - 1) + list.get(i - 1).get(j));
                }
            }
            list.add(tmpList);
        }

        return list;
    }
}