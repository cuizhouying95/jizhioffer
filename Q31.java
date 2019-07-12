package jianzhioffer;
//输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
//例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
import java.util.Arrays;
import java.util.Comparator;
public class Q31 {
	public String PrintMinNumber(int [] numbers) {
		if(numbers==null||numbers.length==0){
	          return "";
	      }
	        int len = numbers.length;
	        String[] strs = new String[len];
	        //转换成字符串数组
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
