package jianzhioffer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Deque;
//֮�ִ�ӡ������
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
	        TreeNode nLast=null;//ÿ������һ���ڵ�
	        TreeNode head=null;
	        dq.offerFirst(pRoot);
	        ArrayList<Integer> layer = new ArrayList<Integer>();
	        while(!dq.isEmpty()){
	            if(lr){//�����Ҵ�ӡ
	                head=dq.pollFirst();//��ͷ������
	                if(head.left!=null){
	                    nLast=nLast==null?head.left:nLast;
	                    dq.offerLast(head.left);//�����ȴ�β������
	                }
	                if(head.right!=null){
	                    nLast=nLast==null?head.right:nLast;
	                    dq.offerLast(head.right);
	                }
	            }else {
	                head=dq.pollLast();//��β������
	                if(head.right!=null){
	                    nLast=nLast==null?head.right:nLast;
	                    dq.offerFirst(head.right);//�Һ����ȴ�ͷ������
	                }
	                if(head.left!=null){
	                    nLast=nLast==null?head.left:nLast;
	                    dq.offerFirst(head.left);
	                }
	            }
	            layer.add(head.val);
	            if(head==last){//ע�����������ϵĲ�ͬ ���������һ��
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
