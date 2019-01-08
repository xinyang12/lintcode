public class DataStream {
    
    public DataStream(){
        // do intialization if necessary
    }
    List<Integer> list = new ArrayList<>();
    Map<Integer, Integer> map = new HashMap<>();
    /**
     * @param num: next number in stream
     * @return: nothing
     */
    public void add(int num) {
        // write your code here
        list.add(num);
        if (map.get(num) != null && map.get(num) > 0) {
            map.put(num, map.get(num) + 1);
        } else {
            map.put(num, 1);
        }
    }

    /**
     * @return: the first unique number in stream
     */
    public int firstUnique() {
        // write your code here
        for (Integer num : list) {
            if (map.get(num) == 1) {
                return num;
            }
        }
        
        return 0;
    }
}