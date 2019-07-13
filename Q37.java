package jianzhioffer;
//��ʵ��һ�������������ж�һ�Ŷ������ǲ��ǶԳƵġ�
public class Q37 {

	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }
	}
	
	public boolean isSymmetrical(TreeNode pRoot) {
		if(pRoot==null) {
			return true;
		}
		return comRoot(pRoot.left, pRoot.right);
	}
	
	public boolean comRoot(TreeNode left,TreeNode right) {
		if(left==null) return right==null;
		if(right==null) return false;
		if(left.val!=right.val) {
			return false;
		}
		return comRoot(left.left,right.right)&&comRoot(left.right,right.left);
	}
}
