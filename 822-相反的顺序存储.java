public class Solution {
    /**
     * @param head: the given linked list
     * @return: the array that store the values in reverse order 
     */
    public List<Integer> reverseStore(ListNode head) {
        // write your code here
        if (head == null) {
            return null;
        }
        
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        
        int i = 0, j = list.size() - 1;
        
        while (i < j) {
            int tmp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, tmp);
            ++i;
            --j;
        }
        
        return list;
    }
}