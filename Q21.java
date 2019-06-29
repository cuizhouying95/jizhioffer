package jianzhioffer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Deque;
//之字打印二叉树
public class Q21 {
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;
	    }
	}
	
	public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
	       ArrayList<ArrayList<Integer>> layers = new ArrayList<ArrayList<Integer>>();
	       if(pRoot==null){
	           return layers;
	       }
	        Deque<TreeNode> dq=new LinkedList<TreeNode>();
	        boolean lr=true;
	        TreeNode last=pRoot;
	        TreeNode nLast=null;//每层的最后一个节点
	        TreeNode head=null;
	        dq.offerFirst(pRoot);
	        ArrayList<Integer> layer = new ArrayList<Integer>();
	        while(!dq.isEmpty()){
	            if(lr){//从左到右打印
	                head=dq.pollFirst();//从头部弹出
	                if(head.left!=null){
	                    nLast=nLast==null?head.left:nLast;
	                    dq.offerLast(head.left);//左孩子先从尾部进入
	                }
	                if(head.right!=null){
	                    nLast=nLast==null?head.right:nLast;
	                    dq.offerLast(head.right);
	                }
	            }else {
	                head=dq.pollLast();//从尾部弹出
	                if(head.right!=null){
	                    nLast=nLast==null?head.right:nLast;
	                    dq.offerFirst(head.right);//右孩子先从头部进入
	                }
	                if(head.left!=null){
	                    nLast=nLast==null?head.left:nLast;
	                    dq.offerFirst(head.left);
	                }
	            }
	            layer.add(head.val);
	            if(head==last){//注意这里与书上的不同 ，在于最后一行
	                lr=!lr;
	                last=nLast;
	                nLast=null;
	                layers.add(layer);
	                layer = new ArrayList<Integer>();
	            }
	        }
	        return layers;
	    }
}
