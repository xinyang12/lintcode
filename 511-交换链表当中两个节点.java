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
     * @param v1: An integer
     * @param v2: An integer
     * @return: a new head of singly-linked list
     * 需要注意两个节点相邻的情况
     */
    public ListNode swapNodes(ListNode head, int v1, int v2) {
        // write your code here
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode tmpHead = dummyHead;
        ListNode prev1 = null;
        ListNode prev2 = null;
        while (dummyHead.next != null) {
            if (dummyHead.next.val == v1) {
                prev1 = dummyHead;
            } else if (dummyHead.next.val == v2) {
                prev2 = dummyHead;
            }
            dummyHead = dummyHead.next;
        }
        if (prev1 == null || prev2 == null) {
            return head;
        }
        ListNode node1 = prev1.next;
        ListNode node2 = prev2.next;
        ListNode next1 = node1.next;
        ListNode next2 = node2.next;

        if (prev2.next == prev1) {
            prev2.next = node1;
            node1.next = prev1;
            prev1.next = next1;
        } else if (prev1.next == prev2) {
            prev1.next = node2;
            node2.next = prev2;
            prev2.next = next2;
        } else {
            prev1.next = prev2.next;
            node2.next = next1;
            prev2.next = node1;
            node1.next = next2;
        }

        return tmpHead.next;
    }
}