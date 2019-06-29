package jianzhioffer;
//输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,
//则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collections;
public class Q26 {
	public ArrayList<String> Permutation(String str){
		ArrayList<String> list=new ArrayList<String>();
		if(str==null||str.length()==0) {
			return list;
		}
		char[] chs=str.toCharArray();
		process1(chs,0,list);
		Collections.sort(list);
		return list;
	}
	
	private void process1(char[] chs,int i,ArrayList<String> list) {
		if(i==chs.length) {
			list.add(String.valueOf(chs));
		}
		for(int j=i;j<chs.length;j++) {
			swap(chs,i,j);
	        process1(chs,i+1,list);
	        swap(chs,i,j);
		}
	}
	
	private void swap(char[] chs, int i, int j) {
		char tmp = chs[i];
		chs[i] = chs[j];
		chs[j] = tmp;
	}
	
	//不包含重复的排列
	public ArrayList<String> Permutation2(String str){
		
		ArrayList<String> list=new ArrayList<String>();
		if(str==null||str.length()==0) {
			return list;
		}
		char[] chs=str.toCharArray();
		process2(chs,0,list);
		Collections.sort(list);
		return list;
	}
	
	private void process2(char[] chs,int i,ArrayList<String> list) {
		if(i==chs.length) {
			list.add(String.valueOf(chs));
		}
		HashSet<Character> set = new HashSet<>();//用set来查看是否有重复元素
		for (int j = i; j < chs.length; j++) {
			if (!set.contains(chs[j])) {
				set.add(chs[j]);
				swap(chs, i, j);
				process2(chs, i + 1,list);
				swap(chs, i, j);
			}
		}
	}
}
