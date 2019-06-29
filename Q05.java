package jianzhioffer;
//两个栈实现队列
import java.util.Stack;
public class Q05 {
	Stack<Integer> stack1 = new Stack<Integer>();//作为压入栈，在压入数据时只往这个栈中压入
    Stack<Integer> stack2 = new Stack<Integer>();//作为弹出栈，在弹出数据时只从这个栈弹出
	
    public void push(int pushInt) {
    	stack1.push(pushInt);
    }
    
    //如果stack1要往stack2中压入数据，必须一次性将数据全部压入
    //stack2不为空时，stack1不能向stack2中压入数据
    public int pop() {
    	if(stack2.empty()&&stack1.empty()) {
    		throw new RuntimeException("Queue is empty!");
    	}else if(stack2.empty()) {
    		while(!stack1.empty()) {
    			stack2.push(stack1.pop());
    		}
    	}
    	return stack2.pop();
    }
    
    public static void main(String[] args) {
    	Q05 a=new Q05();
    	a.push(1);
    	a.push(2);
    	a.push(3);
    	System.out.println(a.pop());
    	System.out.println(a.pop());
    }
}
