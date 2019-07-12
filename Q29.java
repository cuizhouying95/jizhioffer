package jianzhioffer;
//连续子数组的最大和
public class Q29 {

	public int FindGreatestSumOfSubArray(int[] arr) {
		if(arr==null||arr.length==0) {
			return 0;
		}
		int max=Integer.MIN_VALUE;
		int cur=0;
		for(int i=0;i<arr.length;i++) {
			cur+=arr[i];
			max=Math.max(max,cur);
			cur=cur<0?0:cur;
		}
		return max;
	}
}
