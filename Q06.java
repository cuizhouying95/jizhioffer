package jianzhioffer;
//��ת�������С����
public class Q06 {
	public int minNumberInRotateArray(int [] arr) {
		int low =0;
		int high=arr.length-1;
		int mid=0;
		while(low<high) {
			if(low==high-1) {
				break;//����֮һ
			}
			if(arr[low]<arr[high]) {
				return arr[low];//û����ת
			}
			mid=(low+high)/2;
			if (arr[high]<arr[mid]) {//�ϵ��ڿ��ҵĲ���
				low=mid;
				continue;
			}
			if (arr[low]>arr[mid]) {//�ϵ��ڿ���Ĳ���
				high=mid;
				continue;
			}
			//arr[low]==arr[mid]==arr[high]
			while(low<mid) {
				if(arr[low]==arr[mid]) {
					low++;
				}else if(arr[low]<arr[mid]) {
					return arr[low];
				}else {
					high=mid;
					break;
				}
			}
		}
		return Math.min(arr[low], arr[high]);
	}
}
