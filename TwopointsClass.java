package jianzhioffer;

public class TwopointsClass {
//已经排好序的数组
	public static void main(String[] args) {
        //有序排列数组（大到小，小到大无所谓）
        int[] array = {1,2,3,4,5,6,8};
        //打印二分法的返回值
        System.out.println(searchRecursive(array,0,array.length-1,1));
        System.out.println(BinarySearch(1,array));
    }

    public static int searchRecursive(int[] array,int start,int end,int findValue){

        if(array==null){
            return -1;
        }
        if(start<=end){
            //中间位置
            int middle = (end - start)/2+start;
            //中值
            int middleValue = array[middle];

            if(findValue == middleValue){
                //与中值相等就直接返回
                return middle;
            }else if(findValue < middleValue){
                //目标值小于中值，在中值前面找（这里调用了二分法的方法）
                return searchRecursive(array,start,middle - 1,findValue);
            }else {
                //目标值大于中值，在中值后面找（这里调用了二分法的方法）
                return searchRecursive(array,middle + 1,end,findValue);
            }

        }else{
            //返回-1，查找失败
            return -1;
        }
    }
    
    public static int BinarySearch(int key,int[] arry){
        int left=0;
        int right=arry.length-1;
        while(left<=right){//注意等于号
            int mid=(left+right)/2;
            if(key<arry[mid]){
                right=mid-1;
            }else if(key>arry[mid]){
                left=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    
  
}
