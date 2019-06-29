package jianzhioffer;

//���������������������������������ϳɺ��������Ȼ������Ҫ�ϳɺ���������㵥����������
public class Q14 {

	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	
	public ListNode Merge(ListNode list1,ListNode list2) {
		if(list1==null) {
			return list2;
		}
		if(list2==null) {
			return list1;
		}
		ListNode merge=null;
		if(list1.val<=list2.val) {
			merge=list1;
	        merge.next = Merge(list1.next, list2);
		}else {
			merge=list2;
	        merge.next = Merge(list1, list2.next);
		}
		return merge;
	}
	//�������ǵݹ鷽��
	public ListNode Merge2(ListNode head1,ListNode head2) {
		if(head1==null||head2==null) {
			return head1!=null?head1:head2;
		}
		ListNode head=head1.val<head2.val?head1:head2;
		ListNode cur1=head==head1?head1:head2;//head ���ڵ�����
		ListNode cur2=head==head1?head2:head1;
		ListNode pre=null;
		ListNode next=null;
		while(cur1!=null&&cur2!=null) {
			if(cur1.val<=cur2.val) {
				pre=cur1;
				cur1=cur1.next;
			}else {
				next=cur2.next;
				pre.next=cur2;
				cur2.next=cur1;
				pre=cur2;
				cur2=next;
			}
		}
		pre.next=cur1==null?cur2:cur1;
		return head;	
	}
}
