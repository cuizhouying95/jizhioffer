package jianzhioffer;
//����һ�����������飬����������������ƴ�������ų�һ��������ӡ��ƴ�ӳ���������������С��һ����
//������������{3��32��321}�����ӡ���������������ųɵ���С����Ϊ321323��
import java.util.Arrays;
import java.util.Comparator;
public class Q31 {
	public String PrintMinNumber(int [] numbers) {
		if(numbers==null||numbers.length==0){
	          return "";
	      }
	        int len = numbers.length;
	        String[] strs = new String[len];
	        //ת�����ַ�������
	        for(int i = 0; i < len; i++){
	            strs[i] = String.valueOf(numbers[i]);
	        }
	        Arrays.sort(strs,new Mycomparator());
	        String res="";
	        for(int i=0;i<strs.length;i++){
	            res+=strs[i];
	        }
	        return res;
	}
	
	public class Mycomparator implements Comparator<String>{
        public int compare(String a,String b){
            return (a+b).compareTo(b+a);
        }
    }
}
