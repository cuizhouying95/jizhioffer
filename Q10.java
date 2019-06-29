package jianzhioffer;
//给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
public class Q10 {
	public double Power(double base, int exponent) {
		if(exponent==0) {
			return 1;
		}
		if(exponent==1) {
			return base;
		}
		if(exponent<0) {
			base=1/base;
			exponent=-exponent;
		}
		double res=Power(base,exponent>>>1);
		res*=res;
		if((exponent&1)==1){//exponent为奇数
            res*=base;
        }
        return res;
	}
}
