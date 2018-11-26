/**
 * Definition of TreeNode:
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
    /*
     * @param root: the root of tree
     * @return: the max node
     */
    public TreeNode maxNode(TreeNode root) {
        // write your code here
        if (root == null) {
            return null;
        }
        if (root.left == null && root.right == null) {
            return root;
        }
        
        TreeNode leftMax = maxNode(root.left);
        TreeNode rightMax = maxNode(root.right);
        
        if (leftMax == null) {
            return rightMax.val > root.val ? rightMax : root;
        }
        if (rightMax == null) {
            return leftMax.val > root.val ? leftMax : root;
        }
        
        TreeNode max = rightMax.val > leftMax.val ? rightMax : leftMax;
        return max.val > root.val ? max : root;
    }
}