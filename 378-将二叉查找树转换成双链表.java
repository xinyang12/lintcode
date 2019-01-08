/**
 * Definition for Doubly-ListNode.
 * public class DoublyListNode {
 *     int val;
 *     DoublyListNode next, prev;
 *     DoublyListNode(int val) {
 *         this.val = val;
 *         this.next = this.prev = null;
 *     }
 * } * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */

public class Solution {
    /**
     * @param root: The root of tree
     * @return: the head of doubly list node
     * 这是最笨的办法，先把中序的顺序算出来，然后构造双向链表
     */
    public DoublyListNode bstToDoublyList(TreeNode root) {
        // write your code here
        if (root == null) {
            return null;
        }
        List<Integer> list = new ArrayList<>();
        inOrder(root, list);

        DoublyListNode dummyNode = new DoublyListNode(0);
        DoublyListNode dummyMoveNode = dummyNode;

        for (Integer num : list) {
            dummyMoveNode.next = new DoublyListNode(num);
            dummyMoveNode = dummyMoveNode.next;
        }
        dummyMoveNode = dummyNode.next;
        DoublyListNode prev = null;
        while (dummyMoveNode != null) {
            dummyMoveNode.prev = prev;
            prev = dummyMoveNode;
            dummyMoveNode = dummyMoveNode.next;
        }

        DoublyListNode head = dummyNode.next;
        head.prev = null;

        return head;
    }

    // 这个就是比较高级的方法
    public DoublyListNode bstToDoublyList2(TreeNode root) {
        // write your code here
        if (root == null) {
            return null;
        }
        DoublyListNode listRoot = new DoublyListNode(root.val);
        if (root.left == null && root.right == null) {
            return listRoot;
        }
        
        DoublyListNode left = bstToDoublyList(root.left);
        DoublyListNode tmpLeft = left;
        while (tmpLeft != null && tmpLeft.next != null) {
            tmpLeft = tmpLeft.next;
        }
        if (left != null) {
            tmpLeft.next = listRoot;
            listRoot.prev = tmpLeft;
        }
        
        DoublyListNode right = bstToDoublyList(root.right);
        if (right != null) {
            listRoot.next = right;
            right.prev = listRoot;
        }
        
        return left != null ? left : listRoot;
    }
    
    private void inOrder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);
    }
}
