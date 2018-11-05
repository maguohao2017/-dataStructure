package mgh.����.�����������;
/**
* @author maguohao
* @version ����ʱ�䣺2018��9��6�� ����11:43:30
* ��˵��:
*/
public class Link {

	//����ͷ���
	private Node head;
	
	//��ʼ��
	public Link() {
		//����
		head = new Node();
		head.next = null;
	}
	
	//�����ڵ�
	public void addNode(String data) {
		
		Node p = head;//1����ȡͷ�ڵ�
		while(p.next!=null) {//2��ͨ��ѭ���ҵ����һ��Ԫ��
			p = p.next;
		}
		//3���������Ľڵ�ŵ����һ��Ԫ�صĺ���
		Node temp = new Node(data);//��Ҫ�����Ľڵ�
		p.next = temp;
	}
	
	//ɾ���ڵ�
	public void delNode(String data) {
		Node p = head;//1����ȡͷ�ڵ�
		while(p.next!=null) {//2��ͨ��ѭ���ҵ����һ��Ԫ��
			//ɾ���ڵ�
			if(p.next.name.equals(data)) {
				p.next = p.next.next;
				break;
			}else {
				p = p.next;
			}
		}
	}
	
	//�����ڵ�
	public void display() {
		Node p = head;//1����ȡͷ�ڵ�
		while(p.next!=null) {//2��ͨ��ѭ���ҵ����һ��Ԫ��
			System.out.println(p.next.name+"->>");
			p = p.next;
		}
	}
	
	//���ҽڵ�
	public void findNode(String data) {
		Node p = head;//1����ȡͷ�ڵ�
		while(p.next!=null) {//2��ͨ��ѭ���ҵ����һ��Ԫ��
			if(p.next.name.equals(data)) {
				System.out.println("����data:"+p.next.name);
				break;
			}else {
				p = p.next;
			}
		}
	}
	
	//����ڵ�
	public void insertNode(String param,String data) {
		Node p = head;//1����ȡͷ�ڵ�
		while(p.next!=null) {
			if(p.next.name.equals(param)) {
				Node t = p.next;
				Node insertNode = new Node(data);
				
				insertNode.next = t.next;
				t.next = insertNode;
				break;
			}else {
				p = p.next;
			}
		}
	}
	
	//���������С
	public int size() {
		int n = 0;
		Node p = head;
		while(p.next != null) {
			p = p.next;
			n++;
		}
		System.out.println("�����Сsize = "+ n);
		return n;
	}
	
	public static void main(String[] args) {
		Link link = new Link();
		link.addNode("�鳤");
		link.addNode("���ž���");
		link.addNode("����");
		link.addNode("�ܾ���");
		
		link.display();//����
		System.out.println("---------------------------------");
		link.size();//��С
		
		System.out.println("---------------------------------");
		link.delNode("���ž���");//ɾ��
		link.display();
		
		System.out.println("---------------------------------");
		link.insertNode("�鳤","��Ա");
		link.display();
		
		System.out.println("---------------------------------");
		link.findNode("�鳤");
		
	}

}
