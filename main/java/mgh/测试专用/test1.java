package mgh.����ר��;

import java.util.Stack;

/**
* @author maguohao
* @version ����ʱ�䣺2018��9��5�� ����11:22:45
* ��˵��:
* ����1����תһ��ֻ��3λ����������
* ����
* 123 ��ת֮���� 321��
* 900 ��ת֮���� 9��
* ����ջ�����ȳ�ԭ����������û�����ֽⷨ�������Դ���
*/
public class test1 {

	public static void main(String[] args) {
		
		Integer num = reverseInteger(123456);
		System.out.println(num);

	}
	
	public static Integer reverseInteger(int number) {
        
        String str = number+"";
        
        Stack stack = new Stack();
        
        char[] ch = str.toCharArray();
        for(char c : ch){
            stack.push(c);
        }
        
        Stack stack2 = new Stack();
        String strF = "";
        while(!stack.empty()){
        	strF +=stack.pop().toString();
        }
        Integer n = Integer.valueOf(strF);
        return n;
 
}

}
