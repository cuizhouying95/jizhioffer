package jianzhioffer;

public class Mid_val {
	//找出数组的中位数
		 public static double findmid(int[] arr) {
			 if(arr==null||arr.length<1)
				 return 0.0; 
			 double med=0.0;
			 if(arr.length%2==1) {
				 int mid=(arr.length-1)/2;
				 med=(double)select(arr,mid);
			 }else {
				 int mid=arr.length/2;
		         med=(select(arr,mid)+select(arr,mid-1))/2.0;
			 }
			 return med;
		 }

		 public  static int select(int[] array,int k) {
			 int middle=k;
		        int l=0;
		        int r=array.length-1;
		        int index=part(array,l,r);
		        while(index!=middle){
		            if(index>middle){
		                r=index-1;
		                index=part(array,l,r);
		            }else{
		                l=index+1;
		                index=part(array,l,r);
		            }
		        }
		        return array[middle];
		 }
		 
		 public static int part(int[] arr,int l,int r) {
			 int less=-1;
			 int more=r;
			 while(l<more) {
				 if(arr[l]<arr[r]) {
					 less++;
					 swap(arr,less,l);
					 l++;
				 }else if(arr[l]>arr[r]) {
					 more--;
					 swap(arr,more,l);
				 }else {
					 l++;
				 }
			 }
			 swap(arr,more,r);
			 return less+1;
		 }
		 
		 public static void swap(int[] arr,int i,int j){
		        int tmp=arr[i];
		        arr[i]=arr[j];
		        arr[j]=tmp;
		    }
		 
		 public static void main(String[] args) {
		    	int[] arr= {2,2,2};
		    	double a=findmid(arr);
		    	System.out.println(a);
		    }
}
