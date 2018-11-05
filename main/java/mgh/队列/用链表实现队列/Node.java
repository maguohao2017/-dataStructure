package mgh.队列.用链表实现队列;


/**
* @author maguohao
* @version 创建时间：2018年9月12日 上午10:44:12
* 类说明:
*/
public class Node {
	
	private String name;//节点数据域
	
	private Node next;//下一个节点的地址
	
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
