package jianzhioffer;

public class TwopointsClass {
//�Ѿ��ź��������
	public static void main(String[] args) {
        //�����������飨��С��С��������ν��
        int[] array = {1,2,3,4,5,6,8};
        //��ӡ���ַ��ķ���ֵ
        System.out.println(searchRecursive(array,0,array.length-1,1));
        System.out.println(BinarySearch(1,array));
    }

    public static int searchRecursive(int[] array,int start,int end,int findValue){

        if(array==null){
            return -1;
        }
        if(start<=end){
            //�м�λ��
            int middle = (end - start)/2+start;
            //��ֵ
            int middleValue = array[middle];

            if(findValue == middleValue){
                //����ֵ��Ⱦ�ֱ�ӷ���
                return middle;
            }else if(findValue < middleValue){
                //Ŀ��ֵС����ֵ������ֵǰ���ң���������˶��ַ��ķ�����
                return searchRecursive(array,start,middle - 1,findValue);
            }else {
                //Ŀ��ֵ������ֵ������ֵ�����ң���������˶��ַ��ķ�����
                return searchRecursive(array,middle + 1,end,findValue);
            }

        }else{
            //����-1������ʧ��
            return -1;
        }
    }
    
    public static int BinarySearch(int key,int[] arry){
        int left=0;
        int right=arry.length-1;
        while(left<=right){//ע����ں�
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
