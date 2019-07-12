package jianzhioffer;
//把字符串转换成整数
public class Q35 {

	public boolean isValid(char[] chas) {
		if(chas[0]!='-'&&chas[0]!='+'&&(chas[0]<'0'||chas[0]>'9')) {
			return false;
		}
		if((chas[0]=='-'||chas[0]=='+')&&(chas.length==1||chas[1]=='0')) {
			return false;
		}
		if(chas[0]=='0'&&chas.length>1) {
			return false;
		}
		for(int i=1;i<chas.length;i++) {
			if(chas[0]<'0'||chas[0]>'9') {
				return false;
			}
		}
		return true;
	}
	
	public int convert(String str) {
		if(str==null||str.equals("")) {
			return 0;
		}
		char[] chas=str.toCharArray();
		if(!isValid(chas)) {
			return 0;
		}
		boolean posi=(chas[0]=='-'||chas[0]=='+')?false:true;
		int minq=Integer.MIN_VALUE/10;
		int minr=Integer.MIN_VALUE%10;
		int res=0;
		int cur=0;
		for(int i=posi?0:1;i<chas.length;i++) {
			cur='0'-chas[i];
			if(res<minq||(res==minq&&cur<minr)) {
				return 0;
			}
			res=res*10+cur;
		}
		if(chas[0]=='+'&&res==Integer.MIN_VALUE) {
			return 0;
		}
		return chas[0]=='-'?res:-res;
	}
}
