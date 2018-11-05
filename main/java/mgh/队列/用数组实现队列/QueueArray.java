package mgh.队列.用数组实现队列;
/**
* @author maguohao
* @version 创建时间：2018年9月12日 下午5:33:46
* 类说明:
* 用数组实现队列
* 会出现假溢出的情况
*/
public class QueueArray {

	Object[] data;//数组对象
	int front;//队头
	int rear;//队尾
	int size;//数组大小
	
	public QueueArray() {
		size = 10;
		front = -1;
		rear = -1;
		data = new Object[10];
	}
	
	public QueueArray(int size) {
		this.size = size;
		front = -1;
		rear = -1;
		data = new Object[size];
	}
	
	//队列的入队:从队尾入队
	public void inQueue(Object obj) {
		//判断队列是否已满
		if(rear + 1 < size) {
			rear++;
			data[rear] = obj;
			System.out.println("入队: " + obj.toString());
		}else {
			System.out.println("队列已满");
		}
		
	}
	
	//队列的出队:从队首出队
	public void outQueue() {
		//判断队列是否为空
		if(front == rear) {
			System.out.println("队列已空");
			return;
		}
		front++;
		System.out.println("出队： " + data[front]);
	}
	
	//遍历
	public void display() {
		for(int i=front+1;i<rear+1;i++) {
			System.out.println("遍历： " + data[i]);
		}
	}
	
	public static void main(String[] args) {
		QueueArray queue = new QueueArray();
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
