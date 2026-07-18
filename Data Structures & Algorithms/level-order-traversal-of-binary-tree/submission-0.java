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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) return list;
        Deque<TreeNode> queue = new ArrayDeque<TreeNode>();
        queue.addLast(root);

        while (!queue.isEmpty()) {
            ArrayList<Integer> tempList =  new ArrayList<Integer>();
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                TreeNode curr = queue.pop();
                tempList.add(curr.val);
                if(curr.left != null) {
                    queue.addLast(curr.left);
                }
                if(curr.right != null) {
                    queue.addLast(curr.right);
                }
            }
            if(!tempList.isEmpty()) list.add(tempList);
        }
        return list;
    }
}
