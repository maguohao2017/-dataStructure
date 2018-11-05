package mgh.队列.用链表实现队列;

import mgh.队列.用数组实现队列.Node;

/**
* @author maguohao
* @version 创建时间：2018年9月12日 下午5:33:46
* 类说明:
* 用数组实现队列
*/
public class Queue {

	Node head;
	
	public Queue() {
		head = new Node();
	}
	
	//队列的入队:从队尾入队
	public void inQueue(String data) {
		Node p = head;
		Node t = new Node(data);
		
		while(p.getNext()!=null) {
			p = p.getNext();
		}
		p.setNext(t);
		System.out.println("队列入队" + t.getName());
	}
	
	//队列的出队:从队首出队
	public String outQueue() {
		String data = "";
		
		Node p = head;
		if(head.getNext()!=null) {
			data = head.getNext().getName();
			head.setNext(head.getNext().getNext());
			System.out.println("队列出队" + data);
		}else {
			System.out.println("队列为空");
		}
		return data;
	}
	
	//遍历
	public void display() {
		Node p = head;
		
		while(p.getNext()!=null) {
			System.out.println("遍历： "+p.getNext().getName());
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
