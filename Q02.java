package jianzhioffer;
//�滻�ո�
public class Q02 {
	 public static String replaceSpace(StringBuffer str) {
		 if(str==null||str.length()==0) {
			 return "";
		 }
		 int num = 0;//numΪ����ո���
		    for(int i=0;i<str.length();i++){
				 if(str.charAt(i)==' ')
				         num++;
		    }
		  int oldindex = str.length()-1; //indexoldΪΪ�滻ǰ��str�±�
		  int newlength = str.length() + num*2;//����ո�ת����%20֮���str����
		  int newindex = newlength-1;//indexoldΪΪ�ѿո��滻Ϊ%20���str�±�
		  str.setLength(newlength);
		  String str1=str.toString();
	      char[] chas=str1.toCharArray();
		 while(oldindex>=0) {
			 if(chas[oldindex]!=' ') {
				 chas[newindex--]=chas[oldindex];
			 }else {
				 chas[newindex--]='0';
				 chas[newindex--]='2';
				 chas[newindex--]='%';
			 }
			 oldindex--;
		 }
		 return String.valueOf(chas);
	 }
	 
	 public static void main(String[] args) {
		 StringBuffer str=new StringBuffer("We are happy.");
		 
		 System.out.println(replaceSpace(str));
	 }
}
