package jianzhioffer;
//����ջʵ�ֶ���
import java.util.Stack;
public class Q05 {
	Stack<Integer> stack1 = new Stack<Integer>();//��Ϊѹ��ջ����ѹ������ʱֻ�����ջ��ѹ��
    Stack<Integer> stack2 = new Stack<Integer>();//��Ϊ����ջ���ڵ�������ʱֻ�����ջ����
	
    public void push(int pushInt) {
    	stack1.push(pushInt);
    }
    
    //���stack1Ҫ��stack2��ѹ�����ݣ�����һ���Խ�����ȫ��ѹ��
    //stack2��Ϊ��ʱ��stack1������stack2��ѹ������
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
