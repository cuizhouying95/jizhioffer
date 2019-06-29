package jianzhioffer;

import zuoshen.Lianxi.Node;

//����һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ�����������������������������ֶ�������ͬ��
public class Q22 {
	public boolean VerifySquenceOfBST(int[] arr) {
		if(arr==null||arr.length==0) {
			return false;
		}
		return isPost(arr,0,arr.length-1);
	}
	
	public boolean isPost(int[] arr,int start,int end) {
		if(start==end) {
			return true;
		}
		int less=-1;
		int more=end;
		for(int i=start;i<end;i++) {
			if(arr[end]>arr[i]) {
				less=i;
			}else {
				more=more==end?i:more;
			}
			
		}
		if(less==-1||more==end) {
			return isPost(arr,start,end-1);
		}
		if(less!=more-1) {
			return false;
		}
		return isPost(arr,start,less)&&isPost(arr,more,end-1);
	}
	//�������⣬���ݺ��������ؽ�����������
	public static class Node {
		public int value;
		public Node left;
		public Node right;

		public Node(int data) {
			this.value = data;
		}
      }
	
	public Node posArrayToBST(int[] posArr) {
		if(posArr==null) {
			return null;
		}
		return posToBST(posArr,0,posArr.length-1);
	}
	
	public Node posToBST(int[] posArr,int start,int end) {
		if(start>end) {
			return null;
		}
		Node head=new Node(posArr[end]);
		int less=-1;
		int more=end;
		for(int i=start;i<end;i++) {
			if(posArr[end]>posArr[i]) {
				less=i;
			}else {
				more=more==end?i:more;
			}
		}
		head.left=posToBST(posArr,start,less);
		head.right=posToBST(posArr,more,end-1);
		return head;
	}
}
