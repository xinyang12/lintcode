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
     * @param head: a singly linked list
     * @return: Modified linked list
     */
    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return null;
        }
        // write your code here
        ListNode head4Odd = head;
        ListNode head4Even = head.next;
        List<ListNode> list4Odd = new ArrayList<>();
        List<ListNode> list4Even = new ArrayList<>();

        while (head4Odd != null) {
            list4Odd.add(head4Odd);
            if (head4Odd.next != null) {
                head4Odd = head4Odd.next.next;
            } else {
                break;
            }
        }
        while (head4Even != null) {
            list4Even.add(head4Even);
            if (head4Even.next != null) {
                head4Even = head4Even.next.next;
            } else {
                break;
            }
        }
        list4Odd.addAll(list4Even);

        ListNode dummyHead = new ListNode(0);
        ListNode realHead = dummyHead;

        for (ListNode node : list4Odd) {
            ListNode tmp = new ListNode(node.val);
            dummyHead.next = tmp;
            dummyHead = dummyHead.next;
        }

        return realHead.next;
    }
}