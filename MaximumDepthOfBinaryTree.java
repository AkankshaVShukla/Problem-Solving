/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null)return 0;
        return depth(root, 1);
    }
    
    public int depth(TreeNode root, int depth){
        if(root==null)return depth;
        if(root.left==null && root.right==null) return depth;
        return Math.max(depth(root.left, depth + 1), depth(root.right, depth+1));
    }
}