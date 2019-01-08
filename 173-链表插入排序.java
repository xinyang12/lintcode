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
     * @param head: The first node of linked list.
     * @return: The head of linked list.
     */
    public ListNode insertionSortList(ListNode head) {
        // write your code here
        if (head == null || head.next == null) {
            return head;
        }
        ListNode secondList = head.next;
        head.next = null;
        ListNode dummyNode = new ListNode(0);
        ListNode dummyMoveNode = dummyNode;
        dummyNode.next = head;
        ListNode sortNode = null;
        while (secondList != null) {
            sortNode = secondList;
            secondList = secondList.next;
            while (dummyMoveNode.next != null) {
                if (dummyMoveNode.next.val > sortNode.val) {
                    sortNode.next = dummyMoveNode.next;
                    dummyMoveNode.next = sortNode;
                    break;
                }
                dummyMoveNode = dummyMoveNode.next;
            }

            if (dummyMoveNode.next == null) {
                sortNode.next = null;
                dummyMoveNode.next = sortNode;
            }

            dummyMoveNode = dummyNode;
        }

        return dummyNode.next;
    }
}