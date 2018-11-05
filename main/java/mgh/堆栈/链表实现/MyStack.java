package mgh.��ջ.����ʵ��;



/**
* @author maguohao
* @version ����ʱ�䣺2018��9��12�� ����10:42:48
* ��˵��:
* ����ʵ�ֶ�ջ
* ��ջ���������
*/
public class MyStack {

	private static Node head;
	private static int size;//����Ԫ�ظ��� (ȫ�ֱ���)
	
	public MyStack() {
		head = new Node();
		
	}
	
	//����Ԫ�أ�ѹ��ջ��
	public static void push(String data) {
		//��ȡͷָ��,ջ��Ԫ��
		Node p = head;
		//�����ڵ�
		Node d = new Node(data);
		//�����½ڵ����һ���ڵ�Ϊͷ������һ���ڵ�
		d.next = p.next;
		//��ͷ�ڵ���һ���ڵ�ָ���½ڵ�
		p.next = d;
		
		size++;//����Ԫ�ظ��� (ȫ�ֱ���)
	}
	
	//ɾ��Ԫ�أ������ȳ�
	public static String pop() {
		//�ж϶�ջ�Ƿ�Ϊ��
		if(isEmpty()) {
			System.out.println("��ջ�Ѿ�Ϊ�գ��޷�ɾ��");
			return null;
		}
		
		//��ȡͷָ��,ջ��Ԫ��
		Node p = head;
		
		Node temp = p.next;
		p.next = p.next.next;//ɾ��
		
		size--;//����Ԫ�ظ��� (ȫ�ֱ���)
		
		return temp.name;
	}
	
	//�ж϶�ջ�Ƿ�Ϊ��
	public static boolean isEmpty() {
		boolean flag = false;
		if(head.next == null) {
			flag = true;
		}
		return flag;
	}
	
	//����Ԫ�ظ���
	public int size() {
		return size;
	}
	
	//����Ԫ��
	public void find(String data) {
		Node p = head;
		while(p.next!=null) {
			if(p.next.name.equals(data)) {
				System.out.println("�ҵ����ҵ�����: " + data);
				break;
			}else {
				p.next=p.next.next;
			}
		}
	}
	
	//��ȡջ��Ԫ��
	public String peek() {
		if(isEmpty()) {
			return null;
		}
		return head.next.name;
	}
	
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push("�鳤");
		stack.push("���ž���");
		stack.push("����");
		stack.push("�ܾ���");
		stack.push("���³�");
		
		System.out.println("ջ��Ԫ�أ� "+ stack.peek());
		System.out.println("------------------------------>sizeΪ�� " + stack.size());
		
		while(!stack.isEmpty()) {
			System.out.println("ȡ����Ԫ��Ϊ�� "+stack.pop());
		}
		
		System.out.println("------------------------------>sizeΪ�� " + stack.size());
		
	}

}
