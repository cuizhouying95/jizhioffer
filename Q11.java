package jianzhioffer;
//����һ���������飬ʵ��һ�����������������������ֵ�˳��ʹ�����е�����λ�������ǰ�벿�֣����е�ż��λ������ĺ�벿�֣�
//����֤������������ż����ż��֮������λ�ò��䡣
public class Q11 {
	public void reOrderArray(int [] array) {//���������˼�룬��֤���ȶ��ԣ�����0~i-1�Ѿ��ź���

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
	
	//����֤���λ�ò���
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
