package mgh.����ר��;

import java.util.ArrayDeque;
import java.util.Queue;

/**
* @author maguohao
* @version ����ʱ�䣺2018��9��12�� ����12:43:30
* ��˵��:
* ��������ʵ��һ��ջ
* �����������Ԫ�أ��ĸ�����Ϊ�գ����������Ԫ��ʱ��Ҫ������ӦԪ�ص��ƶ�����ȥβ��Ԫ�أ���
* ����Ҫ�ڶ�Ӧ��Ϊ�յĶ��н���Ԫ�ص���ӣ����������ʱ��Ҫ�����������еı����������Ϊ�յĶ���Ҫ������Ϊ�յĶ��������Ԫ�أ�ֱ��βԪ��������ɣ�
*/
public class test9 {//QueuesToStack

	public static void main(String[] args) {
		
		test9 qs = new test9();
		qs.push(1);
		qs.push(2);
		qs.push(3);
		qs.push(4);
		System.out.println(qs.pop());
		System.out.println(qs.pop());
		
		qs.push(5);
		System.out.println(qs.pop());

	}
	
	Queue<Integer> queue1 = new ArrayDeque<Integer>();
	Queue<Integer> queue2 = new ArrayDeque<Integer>();
	
	/*
	 * ��ջ��ѹ������
	 */
	public void push(Integer element){
		//�������ж�Ϊ��ʱ�����ȿ��� queue1
		if(queue1.isEmpty() && queue2.isEmpty()){
			queue1.add(element);
			return;
		}
		
		//���queue1Ϊ�գ�queue2�����ݣ�ֱ�ӷ���queue2
		if(queue1.isEmpty()){
			queue2.add(element);
			return;
		}
		
		//���queue2Ϊ�գ�queue1�����ݣ�ֱ�ӷ���queue1��
		if(queue2.isEmpty()){
			queue1.add(element);
			return;
		}
	}
	
	/*
	 * ��ջ�е���һ������
	 */
	public Integer pop(){
		//�������ջ��Ϊ�գ���û��Ԫ�ؿ��Ե������쳣
		if(queue1.isEmpty() && queue2.isEmpty()){
			try{
				throw new Exception("satck is empty!");
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		//���queue1��û��Ԫ�أ�queue2����Ԫ�أ�����queue2�е�Ԫ�����η���queue1�У�ֱ�����һ��Ԫ�أ���������
		if(queue1.isEmpty()){
			while(queue2.size() > 1){
				queue1.add(queue2.poll());//poll�Ƕ������ݽṹʵ����ķ������Ӷ��׻�ȡԪ�أ�ͬʱ��ȡ�����Ԫ�ؽ���ԭ����ɾ����
			}
			return queue2.poll();
		}
		
		//���queue2��û��Ԫ�أ�queue1����Ԫ�أ�����queue1�е�Ԫ�����η���queue2�У�ֱ�����һ��Ԫ�أ���������
		if(queue2.isEmpty()){
			while(queue1.size() > 1){
				queue2.add(queue1.poll());
			}
			return queue1.poll();
		}
		
		return null;
	}
	

}
