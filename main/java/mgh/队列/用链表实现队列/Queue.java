package mgh.����.������ʵ�ֶ���;

import mgh.����.������ʵ�ֶ���.Node;

/**
* @author maguohao
* @version ����ʱ�䣺2018��9��12�� ����5:33:46
* ��˵��:
* ������ʵ�ֶ���
*/
public class Queue {

	Node head;
	
	public Queue() {
		head = new Node();
	}
	
	//���е����:�Ӷ�β���
	public void inQueue(String data) {
		Node p = head;
		Node t = new Node(data);
		
		while(p.getNext()!=null) {
			p = p.getNext();
		}
		p.setNext(t);
		System.out.println("�������" + t.getName());
	}
	
	//���еĳ���:�Ӷ��׳���
	public String outQueue() {
		String data = "";
		
		Node p = head;
		if(head.getNext()!=null) {
			data = head.getNext().getName();
			head.setNext(head.getNext().getNext());
			System.out.println("���г���" + data);
		}else {
			System.out.println("����Ϊ��");
		}
		return data;
	}
	
	//����
	public void display() {
		Node p = head;
		
		while(p.getNext()!=null) {
			System.out.println("������ "+p.getNext().getName());
			p = p.getNext();
		}
	}
	
	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.inQueue("1");
		queue.inQueue("2");
		queue.inQueue("3");
		queue.inQueue("4");
		queue.inQueue("5");
		queue.inQueue("6");
		queue.display();
		queue.outQueue();
		queue.outQueue();
		queue.outQueue();
		queue.outQueue();
		queue.display();

	}

}
