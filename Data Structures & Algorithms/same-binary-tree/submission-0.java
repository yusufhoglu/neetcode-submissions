/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> queue = new LinkedList<>();        
        queue.add(p);
        queue.add(q);
        while (!queue.isEmpty()) {
            TreeNode currP = queue.poll();
            TreeNode currQ = queue.poll();

            if (currP == null && currQ == null) {
    continue;  // Both null - this is valid, move on
}
        if (currP == null || currQ == null || currP.val != currQ.val) {
            return false;  // Mismatch detected
        }

            queue.add(currP.right);
            queue.add(currQ.right);
            queue.add(currP.left);
            queue.add(currQ.left);
        }
        return true;
    }
}
