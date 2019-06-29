package jianzhioffer;

import jianzhioffer.Q12.ListNode;

//在O(1)的时间删除节点
public class Q12_1 {
	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	
	public ListNode deleteNode(ListNode head,ListNode tobeDelete) {
		if(head==null||tobeDelete==null) {
			return null;
		}
		if(tobeDelete.next!=null) {
			//要删除的不是尾节点
			//将下一个节点的值赋给该节点，令该节点指向下下个节点
			ListNode next=tobeDelete.next;
			tobeDelete.val=next.val;
			tobeDelete.next=next.next;
		}else {
			if(head==tobeDelete) {
				head=null;
			}else {
				ListNode cur=head;
				while(cur.next!=null) {
					cur=cur.next;
				}
				cur.next=null;
			}
		}
		return head;
		
	}
}
