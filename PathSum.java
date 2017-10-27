package akanksha.test.LeetCodePractice;

import java.util.ArrayList;
import java.util.List;

public class PathSum {
	public static void main(String args[]){
		TreeNode t = new TreeNode(5);
		t.left=new TreeNode(4);
		t.right=new TreeNode(8);
		t.left.left= new TreeNode(11);
		t.right.left=new TreeNode(13);
		t.right.right=new TreeNode(4);
		pathSum(t, 20); 
	}
	public boolean hasPathSum(TreeNode root, int sum) {
		if(root==null)return false;
		if(root.left==null && root.right==null && root.val==sum){
			return true;
		}

		return hasPathSum(root.left, sum-root.val) || hasPathSum(root.right, sum-root.val);
	}
	public static List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		helper(root, sum, new ArrayList<Integer>(), result);
		return result;
	}

	public static void helper(TreeNode root, int sum, List<Integer> path,  List<List<Integer>> result){
		if(root==null)return;
		path.add(root.val);
		if(root.left==null && root.right==null && root.val==sum){
			result.add(path);
			return;
		}
		helper(root.left, sum-root.val, new ArrayList<Integer>(path), result);
		helper(root.right, sum-root.val, new ArrayList<Integer>(path), result);
	}
}
