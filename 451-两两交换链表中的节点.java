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
     * @return: a ListNode
     */
    public ListNode swapPairs(ListNode head) {
        // write your code here
        if (head == null || head.next == null) {
            return head;
        }

        ListNode tmp, tmpTail;
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode resultNode = dummyNode;

        while (dummyNode.next != null && dummyNode.next.next != null) {
            tmpTail = dummyNode.next.next.next;
            tmp = dummyNode.next;
            dummyNode.next = tmp.next;
            dummyNode.next.next = tmp;
            tmp.next = tmpTail;

            dummyNode = dummyNode.next.next;
        }

        return resultNode.next;
    }
}