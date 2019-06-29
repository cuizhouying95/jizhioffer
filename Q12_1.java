package jianzhioffer;

import jianzhioffer.Q12.ListNode;

//��O(1)��ʱ��ɾ���ڵ�
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
			//Ҫɾ���Ĳ���β�ڵ�
			//����һ���ڵ��ֵ�����ýڵ㣬��ýڵ�ָ�����¸��ڵ�
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
