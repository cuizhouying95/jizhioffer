package jianzhioffer;
import java.util.Queue;
import java.util.LinkedList;
public class tuozhan_queuetostack {
	Queue<Integer> queue1 = new LinkedList<Integer>();
	Queue<Integer> queue2 = new LinkedList<Integer>();
//入栈：将元素进队列1 
//出栈：判断队列1元素的个数是否为1，如果等于1，则出队列，否则将队列1中的元素移出队列，并放入队列2，
//直到队列1中的元素留下一个，然后队列1出队列，再把，队列2中的元素出队列以此放入队列1中。
// 入队
    public void push(int t) {
        queue1.add(t);
    }
    // 出队
    public int pop() {
        if (queue1.size() <= 1) {
            return queue1.poll();
        } else {
            while (queue1.size() > 1) {
                queue2.add(queue1.poll());
            }
        }
        while (queue2.size() > 0) {
            queue1.add(queue2.poll());
        }
        return queue1.poll();
    }
    
    public static void main(String[] args) {
    	tuozhan_queuetostack a=new tuozhan_queuetostack();
    	a.push(1);
    	a.push(2);
    	a.push(3);
    	System.out.println(a.pop());
    	System.out.println(a.pop());
    }
}