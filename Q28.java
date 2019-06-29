package jianzhioffer;
import java.util.ArrayList;
public class Q28 {

	public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        if(input==null||input.length<k||k<=0){
            return list;
        }
        int l=0;
        int r=input.length-1;
        int index=partition(input,l,r);
        while(index!=k-1){
            if(index>k-1){
                r=index-1;
                index=partition(input,l,r);
            }else{
                l=index+1;
                index=partition(input,l,r);
            }
        }
       
        for (int i=0;i<k;i++){
            list.add(input[i]);
        }
        return list;
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
    
}
