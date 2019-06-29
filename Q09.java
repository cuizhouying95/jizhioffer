package jianzhioffer;
//输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
public class Q09 {
	 //最简单的解法，整数每次向右移动一位，检查最右位是否为1
	//此方法在最复杂的情况要经过32次循环
	public int NumberOf1_1(int n) {
		 int res=0;
		 while(n!=0) {
			 res+=n&1;
			 n>>>=1;
		 }
		 return res;
	 }
	//法二，此方法循环次数只与1的个数有关
	public int NumberOf1_2(int n) {
		int res=0;
		while(n!=0) {
			n&=(n-1);//抹去最右侧的1
			res++;
		}
		return res;
	}
}
