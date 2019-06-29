package jianzhioffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//输入一颗二叉树的跟节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
//(注意: 在返回值的list中，数组长度大的数组靠前)
public class Q23 {

	ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    ArrayList<Integer> path = new ArrayList<>();
    
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }
	}
	
	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target){
		if(root==null) {
			return res;
		}
		findPath(root, target);
		Collections.sort(res, new Comparator<ArrayList<Integer>>() {
			@Override
			public int compare(ArrayList<Integer> o1,ArrayList<Integer> o2) {
				if(o1.size()<o2.size()) {
					return 1;
				}else return -1;
			}
		});
		return res;
	}
	
	public void findPath(TreeNode root, int target) {
		path.add(root.val);
		if(root.val==target&&root.left==null&&root.right==null) {
			res.add(new ArrayList(path));
		}
		if(root.left!=null) {
			findPath(root.left,target-root.val);
		}
		if(root.right!=null) {
			findPath(root.right,target-root.val);
		}
		path.remove(path.size() - 1);//重要
        return;
	}
}
