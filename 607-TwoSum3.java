public class TwoSum {
    /**
     * @param number: An integer
     * @return: nothing
     */

    Map<Integer, Integer> map = new HashMap<>();
    
    public void add(int number) {
        // write your code here
        if (map.get(number) != null) {
            map.put(number, map.get(number) + 1);
        } else {
            map.put(number, 1);
        }
    }

    /**
     * @param value: An integer
     * @return: Find if there exists any pair of numbers which sum is equal to the value.
     */
    public boolean find(int value) {
        // write your code here
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int sub = value - entry.getKey();
            if (sub == entry.getKey() && entry.getValue() > 1) {
                return true;
            } else if (sub != entry.getKey() && map.get(sub) != null) {
                return true;
            }
        }
        
        return false;
    }
}