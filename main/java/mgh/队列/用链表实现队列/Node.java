package mgh.����.������ʵ�ֶ���;


/**
* @author maguohao
* @version ����ʱ�䣺2018��9��12�� ����10:44:12
* ��˵��:
*/
public class Node {
	
	private String name;//�ڵ�������
	
	private Node next;//��һ���ڵ�ĵ�ַ
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node() {
		this.name = "";
		this.next = null;
	}
	
	public Node(String name) {
		this.name = name;
		this.next = null;
	}
}
