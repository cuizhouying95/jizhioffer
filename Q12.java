package jianzhioffer;
//删除链表中的倒数第k个节点
public class Q12 {
	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	
	public ListNode FindKthToTail(ListNode head,int k) {
		if(head==null||k<1) {
			return null;
		}
		ListNode cur=head;
		while(cur!=null) {
			k--;
			cur=cur.next;
		}
		if(k==0) {
			return head;
		}
		if(k>0) {
			return null;
		}
		if(k<0) {
			cur=head;
			while(++k!=0) {
				cur=cur.next;
			}
			cur.next=cur.next.next;
		}
		return head;
	}
}
