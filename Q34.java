package jianzhioffer;
//��ʵ��һ�����������ҳ��ַ����е�һ��ֻ����һ�ε��ַ������磬�����ַ�����ֻ����ǰ�����ַ�"go"ʱ����һ��ֻ����һ�ε��ַ���"g"��
//���Ӹ��ַ����ж���ǰ�����ַ���google"ʱ����һ��ֻ����һ�ε��ַ���"l"��
//�������:
//�����ǰ�ַ���û�д��ڳ���һ�ε��ַ�������#�ַ���
import java.util.*;
public class Q34 {
	HashMap<Character, Integer> map=new HashMap<>();//ͳ���ַ����ֵĴ���
    ArrayList<Character> list=new ArrayList<Character>();
    public void Insert(char ch)
    {
        if(map.containsKey(ch)){
            map.put(ch,map.get(ch)+1);
        }else{
            map.put(ch,1);
        }
         
        list.add(ch);  
    }
  //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        char c='#';
        for(char key : list){
            if(map.get(key)==1){
                c=key;
                break;
            }
        }
         
        return c;
    }
}
