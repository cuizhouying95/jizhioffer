package jianzhioffer;
import java.util.ArrayList;
//输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
public class Q03 {

	public static class ListNode {
		    public int val;
		    public ListNode next ;
		
		    public ListNode(int data) {
		           this.val = data;
		       }
    }
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
		ArrayList<Integer> list=new ArrayList<Integer>();
		ListNode pre=null;
		ListNode next=null;
		while(listNode!=null) {
			next=listNode.next;
			listNode.next=pre;
			pre=listNode;
			listNode=next;
		}
		while(pre!=null){
            list.add(pre.val);
            pre=pre.next;
        }
        return list;
	}
}
