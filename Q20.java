package jianzhioffer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
//从上往下打印出二叉树的每个节点，同层节点从左至右打印。
public class Q20 {

	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;
	    }
	}
	
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root){
		ArrayList<Integer> list=new ArrayList<Integer>();
		if(root==null) {
			return list;
		}
		Queue<TreeNode> queue=new LinkedList<TreeNode>();
		queue.offer(root);
		while(!queue.isEmpty()) {
			TreeNode tmp=queue.poll();
			if(tmp.left!=null) {
				queue.offer(tmp.left);
			}
			if(tmp.right!=null) {
				queue.offer(tmp.right);
			}
			list.add(tmp.val);
		}
		return list;
	}
}
