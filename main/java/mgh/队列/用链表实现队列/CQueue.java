package mgh.队列.用链表实现队列;
/**
* @author maguohao
* @version 创建时间：2018年9月12日 下午10:35:31
* 类说明:
*/
public class CQueue {

	Object[] data;
	int size;
	int front;
	int rear;
	public CQueue() {
		this.size = 11;
		front = 0;
		rear = 0;
		data = new Object[(this.size)];
	}
	public CQueue(int size) {
		this.size = size + 1;
		front = 0;
		rear = 0;
		data = new Object[(this.size)];
	}
	
	//队列是否已满：队尾指针+1 = 队首指针
	public boolean isFull() {
		if((rear + 1) % this.size == front) {
			return true;
		}else {
			return false;
		}
	}
	
	//队列为空：front == rear
	public boolean isEmpty() {
		if(front==rear) {
			return true;
		}else {
			return false;
		}
	}
	
	//队列的入队:从队尾入队
	public void inQueue(Object param) {
		if(isFull()) {
			System.out.println("队列已满");
		}else {
			rear++;
			rear = rear % this.size;
			data[rear] = param;
			System.out.println("入队" + param.toString());
		}
	}
	
	//出队
	public void outQueue() {
		if(isEmpty()) {
			System.out.println("队列为空");
		}else {
			front++;
			front = front % this.size;
			System.out.println("出队：" + data[front]);
		}
	}
	
	//遍历
	public void display() {
		int f = front + 1;
		int r = (rear+1) % this.size;
		while(f!=r) {
			System.out.println("遍历： "+data[f]);
			f = f % this.size;
			f++;
		}
	}
	
	public static void main(String[] args) {
		CQueue queue = new CQueue();
		queue.inQueue("1");
		queue.inQueue("2");
		queue.inQueue("3");
		queue.inQueue("4");
		queue.inQueue("5");
		queue.inQueue("6");
		queue.inQueue("7");
		queue.inQueue("8");
		queue.inQueue("9");
		queue.display();
		queue.outQueue();
		queue.outQueue();
		queue.outQueue();
		queue.outQueue();
		queue.display();
	}

}
