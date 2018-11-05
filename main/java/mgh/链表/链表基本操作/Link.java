package mgh.链表.链表基本操作;
/**
* @author maguohao
* @version 创建时间：2018年9月6日 下午11:43:30
* 类说明:
*/
public class Link {

	//定义头结点
	private Node head;
	
	//初始化
	public Link() {
		//建表
		head = new Node();
		head.next = null;
	}
	
	//新增节点
	public void addNode(String data) {
		
		Node p = head;//1、获取头节点
		while(p.next!=null) {//2、通过循环找到最后一个元素
			p = p.next;
		}
		//3、把新增的节点放到最后一个元素的后面
		Node temp = new Node(data);//需要新增的节点
		p.next = temp;
	}
	
	//删除节点
	public void delNode(String data) {
		Node p = head;//1、获取头节点
		while(p.next!=null) {//2、通过循环找到最后一个元素
			//删除节点
			if(p.next.name.equals(data)) {
				p.next = p.next.next;
				break;
			}else {
				p = p.next;
			}
		}
	}
	
	//遍历节点
	public void display() {
		Node p = head;//1、获取头节点
		while(p.next!=null) {//2、通过循环找到最后一个元素
			System.out.println(p.next.name+"->>");
			p = p.next;
		}
	}
	
	//查找节点
	public void findNode(String data) {
		Node p = head;//1、获取头节点
		while(p.next!=null) {//2、通过循环找到最后一个元素
			if(p.next.name.equals(data)) {
				System.out.println("发现data:"+p.next.name);
				break;
			}else {
				p = p.next;
			}
		}
	}
	
	//插入节点
	public void insertNode(String param,String data) {
		Node p = head;//1、获取头节点
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
	
	//计算链表大小
	public int size() {
		int n = 0;
		Node p = head;
		while(p.next != null) {
			p = p.next;
			n++;
		}
		System.out.println("链表大小size = "+ n);
		return n;
	}
	
	public static void main(String[] args) {
		Link link = new Link();
		link.addNode("组长");
		link.addNode("部门经理");
		link.addNode("副总");
		link.addNode("总经理");
		
		link.display();//遍历
		System.out.println("---------------------------------");
		link.size();//大小
		
		System.out.println("---------------------------------");
		link.delNode("部门经理");//删除
		link.display();
		
		System.out.println("---------------------------------");
		link.insertNode("组长","组员");
		link.display();
		
		System.out.println("---------------------------------");
		link.findNode("组长");
		
	}

}
