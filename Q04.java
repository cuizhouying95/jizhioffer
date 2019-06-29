package jianzhioffer;
import java.util.HashMap;

//重建二叉树
//输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
//例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
public class Q04 {

	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	
	public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
		if(pre==null||in==null) {
			return null;
		}
		HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();
		for(int i=0;i<in.length;i++) {
			m.put(in[i], i);
		}
		return prein(pre,0,pre.length-1,in,0,in.length-1,m);
	}
	
	public TreeNode prein(int[] pre,int pi,int pj,int[] in,int i,int j,HashMap<Integer,Integer> m) {
		if(pi>pj) {
			return null;
		}
		TreeNode head=new TreeNode(pre[pi]);
        int index=m.get(pre[pi]);
		head.left=prein(pre,pi+1,pi+index-i,in,i,index-1,m);
		head.right=prein(pre,pi+index-i+1,pj,in,index+1,j,m);
		return head;
	}
}
