package jianzhioffer;
//输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
//并保证奇数和奇数，偶数和偶数之间的相对位置不变。
public class Q11 {
	public void reOrderArray(int [] array) {//插入排序的思想，保证了稳定性，假设0~i-1已经排好序

		   for (int i = 1; i < array.length; i++){
		  for (int j =i-1; j>=0; j--){
		    if(array[j]%2==0&&array[j+1]%2==1){
		      int t = array[j];
		      array[j] = array[j + 1];
		      array[j + 1] = t;
		     }
		    }
		   }
		  }
	
	//不保证相对位置不变
	public void reOrderArray2(int [] arr) {
		 int left = 0;
		    int right = arr.length-1;
		    while(left<right){
		        while(left<right && isEven(arr[left]))
		            left++;
		        while(left<right && !isEven(arr[right]))
		            right--;
		        if(left<right){
		            int temp = arr[left];
		            arr[left] = arr[right];
		            arr[right] = temp;
		        }
		    }
	}
	
	public static boolean isEven(int n){
	    return (n&1)==1;
	}
}
