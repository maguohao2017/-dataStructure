package mgh.����.������ʵ�ֶ���;
/**
* @author maguohao
* @version ����ʱ�䣺2018��9��12�� ����10:35:31
* ��˵��:
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
	
	//�����Ƿ���������βָ��+1 = ����ָ��
	public boolean isFull() {
		if((rear + 1) % this.size == front) {
			return true;
		}else {
			return false;
		}
	}
	
	//����Ϊ�գ�front == rear
	public boolean isEmpty() {
		if(front==rear) {
			return true;
		}else {
			return false;
		}
	}
	
	//���е����:�Ӷ�β���
	public void inQueue(Object param) {
		if(isFull()) {
			System.out.println("��������");
		}else {
			rear++;
			rear = rear % this.size;
			data[rear] = param;
			System.out.println("���" + param.toString());
		}
	}
	
	//����
	public void outQueue() {
		if(isEmpty()) {
			System.out.println("����Ϊ��");
		}else {
			front++;
			front = front % this.size;
			System.out.println("���ӣ�" + data[front]);
		}
	}
	
	//����
	public void display() {
		int f = front + 1;
		int r = (rear+1) % this.size;
		while(f!=r) {
			System.out.println("������ "+data[f]);
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
