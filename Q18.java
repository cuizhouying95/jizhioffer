package jianzhioffer;
import java.util.Stack;
//����ջ�����ݽṹ�����ڸ�������ʵ��һ���ܹ��õ�ջ��������СԪ�ص�min������ʱ�临�Ӷ�ӦΪO��1������
public class Q18 {
	Stack<Integer> stackData=new Stack<>();
    Stack<Integer> stackMin=new Stack<>();
    public void push(int node) {
        stackData.push(node);
        if(stackMin.isEmpty()){
            stackMin.push(node);
        }else if(node<=stackMin.peek()){
            stackMin.push(node);
        }
    }
    
    public void pop() {
        if(stackData.isEmpty()){
            return;
        }
        int value=stackData.peek();
        stackData.pop();
        if(value==stackMin.peek()){
            stackMin.pop();
        }
    }
    
    public int top() {
        return stackData.peek();
    }
    
    public int min() {
        if(stackMin.isEmpty()){
            throw new RuntimeException("empty");
        }
        return stackMin.peek();
    }
}
