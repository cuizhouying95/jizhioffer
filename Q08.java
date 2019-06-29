package jianzhioffer;
//跳台阶
//类似斐波那契数列，唯一的不同是初始项不同
public class Q08 {
	public int JumpFloor(int target) {
        if(target<1){
            return 0;
        }
        if(target==1||target==2){
            return target;
        }
        int res=2;
        int pre=1;
        int tmp=0;
        for(int i=3;i<=target;i++){
            tmp=res;
            res=res+pre;
            pre=tmp;
        }
        return res;
    }
}
