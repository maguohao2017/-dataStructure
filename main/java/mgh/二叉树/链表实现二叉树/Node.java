package mgh.������.����ʵ�ֶ�����;


/**
* @author maguohao
* @version ����ʱ�䣺2018��9��12�� ����11:11:54
* ��˵��:
*/
public class Node {

	//������
	int data;
	
	//����
	Node leftChild;
	
	//�Һ���
	Node rightChild;
	
	public Node() {
		data = 0;
	}
	
	public Node(int data) {
		this.data = data;
		leftChild = null;
		rightChild = null;
	}
}
