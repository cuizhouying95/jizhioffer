package jianzhioffer;
//����һ��������������������Ʊ�ʾ��1�ĸ��������и����ò����ʾ��
public class Q09 {
	 //��򵥵Ľⷨ������ÿ�������ƶ�һλ���������λ�Ƿ�Ϊ1
	//�˷�������ӵ����Ҫ����32��ѭ��
	public int NumberOf1_1(int n) {
		 int res=0;
		 while(n!=0) {
			 res+=n&1;
			 n>>>=1;
		 }
		 return res;
	 }
	//�������˷���ѭ������ֻ��1�ĸ����й�
	public int NumberOf1_2(int n) {
		int res=0;
		while(n!=0) {
			n&=(n-1);//Ĩȥ���Ҳ��1
			res++;
		}
		return res;
	}
}
