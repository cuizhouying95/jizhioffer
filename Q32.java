package jianzhioffer;
//³óÊı
public class Q32 {

	public int GetUglyNumber_Solution(int index) {
	    if(index<=0) {
	    	return 0;
	    }
	    int[] res=new int[index];
	    res[0]=1;
	    int next=1;
	    int t2=0;
	    int t3=0;
	    int t5=0;
	    while(next<index) {
	    	res[next]=Math.min(res[t2]*2,Math.min(res[t3]*3, res[t5]*5));
	    	if(res[t2]*2==res[next]) {
	    		t2++;
	    	}
	    	if(res[t3]*2==res[next]) {
	    		t3++;
	    	}
	    	if(res[t5]*2==res[next]) {
	    		t5++;
	    	}
	    	next++;
	    }
	    return res[index-1];
	}
}
