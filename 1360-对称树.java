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
    /**
     * @param root: root of the given tree
     * @return: whether it is a mirror of itself 
     */
    public boolean isSymmetric(TreeNode root) {
        // Write your code here
        if (root == null) {
            return true;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> tmpList = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; ++i) {
                TreeNode node = queue.poll();
                if (node == null) {
                    tmpList.add(null);
                } else {
                    tmpList.add(node.val);
                    queue.offer(node.left);
                    queue.offer(node.right);
                }
            }

            list.add(tmpList);
        }

        for (List<Integer> tmp : list) {
            if (!isListTraverse(tmp)) {
                return false;
            }
        }

        return true;
    }
    
    private boolean isListTraverse(List<Integer> list) {
        if (list == null || list.size() == 0) {
            return true;
        }
        int size = list.size();

        for (int i = 0; i < size / 2; ++i) {
            // if (list.get(i) == null && list.get(size - i - 1) == null) {
            //     continue;
            // }
            // if (list.get(i) == null || list.get(size - i - 1) == null) {
            //     return false;
            // }
            // if (!list.get(i).equals(list.get(size - i - 1))) {
            //     return false;
            // }
            
            // 下面的判断方法比较简洁，但是idea会报没有使用equals。但是不能用equals，因为有null，会空指针
            // 可以使用上面的方法，就不会有警告了
            if (list.get(i) != list.get(size - i - 1)) {
                return false;
            }
        }

        return true;
    }
}