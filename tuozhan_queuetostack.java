package jianzhioffer;
import java.util.Queue;
import java.util.LinkedList;
public class tuozhan_queuetostack {
	Queue<Integer> queue1 = new LinkedList<Integer>();
	Queue<Integer> queue2 = new LinkedList<Integer>();
//��ջ����Ԫ�ؽ�����1 
//��ջ���ж϶���1Ԫ�صĸ����Ƿ�Ϊ1���������1��������У����򽫶���1�е�Ԫ���Ƴ����У����������2��
//ֱ������1�е�Ԫ������һ����Ȼ�����1�����У��ٰѣ�����2�е�Ԫ�س������Դ˷������1�С�
// ���
    public void push(int t) {
        queue1.add(t);
    }
    // ����
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