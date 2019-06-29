package jianzhioffer;
//����һ���ַ���,���ֵ����ӡ�����ַ������ַ����������С����������ַ���abc,
//���ӡ�����ַ�a,b,c�������г����������ַ���abc,acb,bac,bca,cab��cba��
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
	
	//�������ظ�������
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
		HashSet<Character> set = new HashSet<>();//��set���鿴�Ƿ����ظ�Ԫ��
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
