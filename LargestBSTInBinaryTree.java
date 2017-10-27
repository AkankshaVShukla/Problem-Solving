
public class LargestBSTInBinaryTree {
	class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
	}
	
	
	public static void main(String args[]){
		
	}
	public static int largestBST(TreeNode root){
		if(root==null)return 0;
		Result r = traverse(root, false, 0,0,0);
		return r.size;
	}
	
	public static Result traverse(TreeNode node, boolean isBST, int size, int min, int max){
		if(node==null){
			return new Result();
		}
		Result left = traverse(node.left, isBST, size, min, max);
		Result right = traverse(node.right, isBST, size, min, max);
		Result current = new Result();
		if(left.isBST==false || right.isBST==false || node.val < left.max || node.val>= right.min){
			current.isBST=false;
			current.size= Math.max(right.size,left.size);
			return current;
		}
		current.isBST=true;
		current.min=left==null?node.val:left.min;
		current.max=right==null?node.val:right.max;
		current.size=left.size+right.size +1;
		
		return current;
	}
}
class Result{
	boolean isBST;
	int size, min, max;
	public Result(){
		isBST=false;
		min=Integer.MAX_VALUE;
		max=Integer.MIN_VALUE;
	}
}
