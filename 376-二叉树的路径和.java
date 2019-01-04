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
     * @param root: the root of binary tree
     * @param target: An integer
     * @return: all valid paths
     */
    public List<List<Integer>> binaryTreePathSum(TreeNode root, int target) {
        // write your code here
        if (root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> resultList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        findPath(root, target, resultList, list);

        return resultList;
    }
    
    private void findPath(TreeNode root, int target, List<List<Integer>> resultList, List<Integer> list) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null && root.val == target) {
            list.add(root.val);
            resultList.add(list);
            return;
        }
        if (root.left != null) {
            List<Integer> leftList = new ArrayList<>(list);
            leftList.add(root.val);
            findPath(root.left, target - root.val, resultList, leftList);
        }
        if (root.right != null) {
            List<Integer> rightList = new ArrayList<>(list);
            rightList.add(root.val);
            findPath(root.right, target - root.val, resultList, rightList);
        }
    }
}