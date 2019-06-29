package jianzhioffer;
//替换空格
public class Q02 {
	 public static String replaceSpace(StringBuffer str) {
		 if(str==null||str.length()==0) {
			 return "";
		 }
		 int num = 0;//num为计算空格数
		    for(int i=0;i<str.length();i++){
				 if(str.charAt(i)==' ')
				         num++;
		    }
		  int oldindex = str.length()-1; //indexold为为替换前的str下标
		  int newlength = str.length() + num*2;//计算空格转换成%20之后的str长度
		  int newindex = newlength-1;//indexold为为把空格替换为%20后的str下标
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
