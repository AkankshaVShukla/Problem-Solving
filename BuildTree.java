package akanksha.test.LeetCodePractice;

public class BuildTree {
	public TreeNode buildTree(int[] inorder, int[] postorder, int inStart, int inEnd,
										int postStart, int postEnd){
		if(inStart>inEnd || postStart>postEnd)return null;
		int rootVal =postorder[postorder.length-1];
		TreeNode root=new TreeNode(rootVal);
		int rootIndex = 0;
		for(int i=0;i<inorder.length;i++){
			if(rootVal==inorder[i]){
				rootIndex=i;
				break;
			}
		}
		root.left=buildTree(inorder,postorder, inStart, rootIndex-1, postStart,postStart-inStart+ rootIndex-1);
		root.right=buildTree(inorder, postorder, rootIndex, inEnd, postStart-inStart+rootIndex, postEnd-1);
		return root;		
			
	}
}
