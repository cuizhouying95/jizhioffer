package jianzhioffer;
//给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。
//注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针
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
