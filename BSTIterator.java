package akanksha.test.LeetCodePractice;

import java.util.Stack;

public class BSTIterator {
	Stack<TreeNode> stack=new Stack<TreeNode>();
	public BSTIterator(TreeNode root){
		pushNodes(root);
	}
	public void pushNodes(TreeNode root){
		while(root!=null){
			stack.push(root);
			root=root.left;
		}
	}
	public int next(){
		TreeNode node=stack.pop();
		pushNodes(node.right);
		return node.val;
	}
	public boolean hasNext(){
		return !stack.isEmpty();
	}
}
