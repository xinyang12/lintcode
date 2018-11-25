/**
 * Definition for ListNode
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    /**
     * @param head: a ListNode
     * @param val: An integer
     * @return: a ListNode
     */
    public ListNode removeElements(ListNode head, int val) {
        // write your code here
        if (head == null) {
            return null;
        }

        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;

        ListNode resultNode = dummyNode;

        while (dummyNode.next != null) {
            if (dummyNode.next.val == val) {
                dummyNode.next = dummyNode.next.next;
            } else {
                dummyNode = dummyNode.next;
            }
        }

        return resultNode.next;
    }
}