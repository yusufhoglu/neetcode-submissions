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
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> l = new ArrayList<>();
        if(root == null) return l;
        Deque <TreeNode> q = new ArrayDeque<>();
        q.addLast(root);
        while (!q.isEmpty()) {
            int size = q.size();
            l.add(q.peekFirst().val);
            for(int i = 0; i < size; i++) {
                TreeNode curr = q.pop();
                if(curr.right != null) {
                    q.addLast(curr.right);
                }
                if(curr.left != null) {
                    q.addLast(curr.left);
                }
            };
        } 
        return l;
    }
}
