package jianzhioffer;
//旋转数组的最小数字
public class Q06 {
	public int minNumberInRotateArray(int [] arr) {
		int low =0;
		int high=arr.length-1;
		int mid=0;
		while(low<high) {
			if(low==high-1) {
				break;//两者之一
			}
			if(arr[low]<arr[high]) {
				return arr[low];//没有旋转
			}
			mid=(low+high)/2;
			if (arr[high]<arr[mid]) {//断点在靠右的部分
				low=mid;
				continue;
			}
			if (arr[low]>arr[mid]) {//断点在靠左的部分
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
