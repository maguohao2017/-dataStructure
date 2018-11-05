package mgh.����.������ʵ�ֶ���;
/**
* @author maguohao
* @version ����ʱ�䣺2018��9��12�� ����5:33:46
* ��˵��:
* ������ʵ�ֶ���
* ����ּ���������
*/
public class QueueArray {

	Object[] data;//�������
	int front;//��ͷ
	int rear;//��β
	int size;//�����С
	
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
	
	//���е����:�Ӷ�β���
	public void inQueue(Object obj) {
		//�ж϶����Ƿ�����
		if(rear + 1 < size) {
			rear++;
			data[rear] = obj;
			System.out.println("���: " + obj.toString());
		}else {
			System.out.println("��������");
		}
		
	}
	
	//���еĳ���:�Ӷ��׳���
	public void outQueue() {
		//�ж϶����Ƿ�Ϊ��
		if(front == rear) {
			System.out.println("�����ѿ�");
			return;
		}
		front++;
		System.out.println("���ӣ� " + data[front]);
	}
	
	//����
	public void display() {
		for(int i=front+1;i<rear+1;i++) {
			System.out.println("������ " + data[i]);
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
