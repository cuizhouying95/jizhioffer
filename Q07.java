package jianzhioffer;
//쳲��������У�����Ҫ������һ������n���������쳲��������еĵ�n���0��ʼ����0��Ϊ0����
//n<=39
public class Q07 {
	//ʱ�临�Ӷ�ΪO(2^N)
	public int Fibonacci1(int n) {
		if(n<1) {
			return 0;
		}
		if(n==1||n==2) {
			return 1;
		}
		return Fibonacci1(n-1)+Fibonacci1(n-2);
	}
	//ʱ�临�Ӷ�ΪO(N)
	//쳲��������п��Դ������������ÿһ���ֵ��ͨ��˳������󵽵�N��
		public int Fibonacci2(int n) {
			if(n<1) {
				return 0;
			}
			if(n==1||n==2) {
				return 1;
			}
			int res=1;
			int pre=1;
			int tmp=0;
			for(int i=3;i<=n;i++) {
				tmp=res;
				res=res+pre;
				pre=tmp;
			}
			return res;
		}
}
