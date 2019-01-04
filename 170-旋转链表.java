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
     * @param head: the List
     * @param k: rotate to the right k places
     * @return: the list after rotation
     */
    public ListNode rotateRight(ListNode head, int k) {
        // write your code here
        if (head == null || head.next == null) {
            return head;
        }
        ListNode tmpHead = head;
        int length = listLength(tmpHead);
        k %= length;
        if (k == 0) {
            return head;
        }

        int move = length - k;
        int count = 0;
        tmpHead = head;
        while (tmpHead != null) {
            ++count;
            if (count == move) {
                break;
            }
            tmpHead = tmpHead.next;
        }
        ListNode newHead = tmpHead.next;
        tmpHead.next = null;

        ListNode point = newHead;
        while (point.next != null) {
            point = point.next;
        }
        point.next = head;

        return newHead;
    }
    
    private int listLength(ListNode head) {
        int count = 0;
        while (head != null) {
            ++count;
            head = head.next;
        }

        return count;
    }
}