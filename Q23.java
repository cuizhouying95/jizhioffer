package jianzhioffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//����һ�Ŷ������ĸ��ڵ��һ����������ӡ���������н��ֵ�ĺ�Ϊ��������������·����·������Ϊ�����ĸ���㿪ʼ����һֱ��Ҷ����������Ľ���γ�һ��·����
//(ע��: �ڷ���ֵ��list�У����鳤�ȴ�����鿿ǰ)
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
		path.remove(path.size() - 1);//��Ҫ
        return;
	}
}
