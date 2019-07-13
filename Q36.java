package jianzhioffer;
//����һ�������������е�һ����㣬���ҳ��������˳�����һ����㲢�ҷ��ء�
//ע�⣬���еĽ�㲻�����������ӽ�㣬ͬʱ����ָ�򸸽���ָ��
public class Q36 {

	public class Node{
		public int value;
		public Node left;
		public Node right;
		public Node parent;
		
		public Node(int data) {
			this.value=data;
		}
	}
	
	public Node getNextNode(Node node) {
		if(node==null) {
			return node;
		}
		if(node.right!=null) {
			return getLeftMost(node.right);
		}else {
			Node parent=node.parent;
			while(parent!=null&&parent.left!=node) {
				node=parent;
				parent=node.parent;
			}
			return node;
		}
	}
	
	public Node getLeftMost(Node node) {
		if(node==null) {
			return node;
		}
		while(node.left!=null) {
			node=node.left;
		}
		return node;
	}
}
