
public class InorderSuccessorBST {
	class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
	}
	public static TreeNode inorderSucc(TreeNode root, TreeNode p){
		if(root==null || p==null)return null;
		TreeNode successor = null;
		while(root!=null){
			if(root.val > p.val){
				successor = root;
				root=root.left;
			}else{
				root=root.right;
				
			}
		}
		return successor;
	}
}
