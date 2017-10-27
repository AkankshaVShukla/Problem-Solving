package akanksha.test.LeetCodePractice;

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int val){
		this.val=val;
	}
}
public class LCAofBST {
	public TreeNode lca(TreeNode root, TreeNode a, TreeNode b){
		if(root==null)return root;
		if(a.val < root.val && b.val <root.val){
			lca(root.left, a, b);
		}
		if(a.val > root.val && b.val > root.val){
			lca(root.right, a, b);
		}
			return root;
		
	}
}
