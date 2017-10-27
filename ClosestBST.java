
public class ClosestBST {
	class TreeNode{
		double val;
		TreeNode left;
		TreeNode right;
	}
	public double closest(TreeNode root, double target){
		TreeNode current = root;
		double value=Integer.MAX_VALUE;
		while(current!=null){
			if(current.val - target < value){
				value = current.val - target;
			}
			if(current.val < target){
				current = current.right;
			}else if(current.val > target){
				current = current.left;
			}else{
				break;
			}
		}
		return value;
	}
}
