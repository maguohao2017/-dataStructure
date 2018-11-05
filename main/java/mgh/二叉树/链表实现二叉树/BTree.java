package mgh.������.����ʵ�ֶ�����;
/**
* @author maguohao
* @version ����ʱ�䣺2018��9��12�� ����11:15:00
* ��˵��:
*/
public class BTree {

	//���ڵ�
	Node root;
	//������
	public BTree(int data) {
		root = new Node(data);
	}
	
	//�����ڵ�
	public void addNode(int data) {
		//��ȡ���ڵ�
		Node p = root;
		//���������ڵ�
		Node t = new Node(data);
		while(true) {
			//�ŵ����ڵ�����
			if(p.data > data) {
				if(p.leftChild != null) {
					//����������
					p = p.leftChild;
				}else {
					p.leftChild = t;
					break;
				}
			}else {//�ŵ����ڵ���ұ�
				if(p.rightChild != null) {
					//����������
					p = p.rightChild;
				}else {
					p.rightChild = t;
					break;
				}
			}
		}
	}
	
	public void display(Node node) {
		
		//ǰ�����
		//10 8 7 3 1 -10 6 20 90 100
//		System.err.println("ǰ�����: "+node.data);
		if(node.leftChild != null) {//������
			display(node.leftChild);
		}
		
		//�������
		//-10 1 3 6 7 8 10 20 90 100
//		System.out.println("�������: " + node.data);
		if(node.rightChild != null) {//������
			display(node.rightChild);
		}
		
		//��������
		//-10 1 6 3 7 8 100 90 20 10
		System.out.println("��������: " + node.data);
			
	}
	
	
	
	public static void main(String[] args) {
		//10 8 7 3 1 -10 6 20 90 100
		BTree tree = new BTree(10);
		tree.addNode(8);
		tree.addNode(7);
		tree.addNode(3);
		tree.addNode(1);
		tree.addNode(-10);
		tree.addNode(6);
		tree.addNode(20);
		tree.addNode(90);
		tree.addNode(100);
		tree.display(tree.root);
	}

}
