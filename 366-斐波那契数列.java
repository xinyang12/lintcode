public class Solution {
    /**
     * @param n: an integer
     * @return: an ineger f(n)
     */
    public int fibonacci(int n) {
        // write your code here
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        List<Integer> list = new ArrayList<>();
        
        list.add(0);
        list.add(1);
        
        int i = 2;
        
        while (i <= n) {
            list.add(list.get(i - 1) + list.get(i - 2));
            ++i;
        }
        
        return list.get(n - 1);
    }
}