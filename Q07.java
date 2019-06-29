package jianzhioffer;
//斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
//n<=39
public class Q07 {
	//时间复杂度为O(2^N)
	public int Fibonacci1(int n) {
		if(n<1) {
			return 0;
		}
		if(n==1||n==2) {
			return 1;
		}
		return Fibonacci1(n-1)+Fibonacci1(n-2);
	}
	//时间复杂度为O(N)
	//斐波那契数列可以从左到右依次求出每一项的值，通过顺序计算求到第N项
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
