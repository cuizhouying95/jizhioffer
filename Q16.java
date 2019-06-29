package jianzhioffer;
//操作给定的二叉树，将其变换为源二叉树的镜像。
import java.util.Stack;
public class Q16 {

	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;
	    }
	}
	
	//递归实现
	public void Mirror1(TreeNode root) {
		if(root==null||(root.left==null&&root.right==null)) {
			return;
		}
		TreeNode tmp=root.left;
		root.left=root.right;
		root.right=tmp;
		if(root.left!=null) {
			Mirror1(root.left);
		}
		if(root.right!=null) {
			Mirror1(root.right);
		}
	}
	//非递归实现
	public void Mirror2(TreeNode root) {
		if(root==null) {
			return;
		}
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		while(!stack.isEmpty()) {
			TreeNode treeNode=stack.pop();
			if(treeNode.left!=null || treeNode.right!=null){
				TreeNode tempNode = treeNode.left;
				treeNode.left = treeNode.right;
				treeNode.right = tempNode;
			}
			if(treeNode.left!=null) {
				stack.push(treeNode.left);
			}
			if(treeNode.right!=null) {
				stack.push(treeNode.right);
			}
		}
	}
}
