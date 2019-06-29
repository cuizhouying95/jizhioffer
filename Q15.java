package jianzhioffer;

//输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
public class Q15 {
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }
	}
	public boolean HasSubtree(TreeNode t1,TreeNode t2) {
		if(t1==null||t2==null) {
			return false;
		}
		return check(t1,t2)||HasSubtree(t1.left,t2)||HasSubtree(t1.right,t2);
	}
    public boolean check(TreeNode h,TreeNode t2) {
    	if(t2==null) {
    		return true;
    	}
    	if(h==null||h.val!=t2.val) {
    		return false;
    	}
    	return check(h.left,t2.left)&&check(h.right,t2.right);
    }
}
