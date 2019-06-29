package jianzhioffer;
import java.util.Queue;
import java.util.LinkedList;
public class Q25 {
	public static class Node {
		public int value;
		public Node left;
		public Node right;
		
		public Node(int data) {
			this.value = data;
		}
	}
	public Node convert1(Node head) {
		Queue<Node> queue=new LinkedList<Node>();
		inOrderToQueue(head,queue);
		if(queue.isEmpty()) {
			return head;
		}
		head=queue.poll();
		Node pre=head;
		pre.left=null;
		Node cur=null;
		while(!queue.isEmpty()) {
			cur=queue.poll();
			pre.right=cur;
			cur.left=pre;
			pre=cur;
		}
		pre.right=null;
		return head;
	}
	
	public void inOrderToQueue(Node head,Queue<Node> queue) {
		if(head==null) {
			return ;
		}
		inOrderToQueue(head.left,queue);
		queue.offer(head);
		inOrderToQueue(head.right,queue);
	}
}
