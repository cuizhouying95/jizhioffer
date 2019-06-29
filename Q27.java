package jianzhioffer;

public class Q27 {

	public int MoreThanHalfNum_Solution(int [] array) {
        if(array==null||array.length<1){
            return 0;
        }
        int middle=array.length>>1;
        int l=0;
        int r=array.length-1;
        int index=partition(array,l,r);
        while(index!=middle){
            if(index>middle){
                r=index-1;
                index=partition(array,l,r);
            }else{
                l=index+1;
                index=partition(array,l,r);
            }
        }
        int res=array[middle];
        if(!CheckMoreThanHalf(array,res)){
            res=0;
        }
        return res;
    }
    
    public int partition(int[] arr,int l,int r){
        swap(arr,l+(int)(Math.random()*(r-l+1)),r);
        int less=l-1;
        int more=r;
        while(l<more){
            if(arr[l]<arr[r]){
                swap(arr,++less,l++);
            }else if(arr[l]>arr[r]){
                swap(arr,--more,l);
            }else{
                l++;
            }
        }
        swap(arr,more,r);
        return less+1;
    }

    public void swap(int[] arr,int i,int j){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
    
    public boolean CheckMoreThanHalf(int[] arr,int res){
        int times=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==res){
                times++;
            }
        }
        boolean isMorethanhalf=true;
        if(times*2<=arr.length){
            isMorethanhalf=false;
        }
        return isMorethanhalf;
    }
}
