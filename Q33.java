package jianzhioffer;
//是否为平衡二叉树
public class Q33 {
    
	public class TreeNode{
		public int value;
		public TreeNode left;
		public TreeNode right;
		
		public TreeNode(int data) {
			this.value=data;
		}
	}
	public boolean IsBalanced_Solution(TreeNode root) {
		return process(root).isB;
	}
	
	public class ReturnData{
		public boolean isB;
		public int h;
		
		public ReturnData(boolean isB,int h) {
			this.isB=isB;
			this.h=h;
		}
	}
	
	public ReturnData process(TreeNode head) {
		if(head==null) {
			return new ReturnData(true,0);
		}
		ReturnData leftData=process(head.left);
		if(!leftData.isB) {
			return new ReturnData(false,0);
		}
		ReturnData rightData=process(head.right);
		if(!rightData.isB) {
			return new ReturnData(false,0);
		}
		if(Math.abs(leftData.h-rightData.h)>1) {
			return new ReturnData(false,0);
		}
		return new  ReturnData(true,Math.max(leftData.h,rightData.h)+1);
	}
}
