package jianzhioffer;
//����һ��double���͵ĸ�����base��int���͵�����exponent����base��exponent�η���
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
		if((exponent&1)==1){//exponentΪ����
            res*=base;
        }
        return res;
	}
}
