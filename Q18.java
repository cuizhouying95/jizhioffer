package jianzhioffer;
import java.util.Stack;
//定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
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
