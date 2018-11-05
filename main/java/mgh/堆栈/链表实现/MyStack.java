package mgh.堆栈.链表实现;



/**
* @author maguohao
* @version 创建时间：2018年9月12日 上午10:42:48
* 类说明:
* 链表实现堆栈
* 堆栈不允许遍历
*/
public class MyStack {

	private static Node head;
	private static int size;//返回元素个数 (全局变量)
	
	public MyStack() {
		head = new Node();
		
	}
	
	//新增元素，压入栈顶
	public static void push(String data) {
		//获取头指针,栈顶元素
		Node p = head;
		//新增节点
		Node d = new Node(data);
		//设置新节点的下一个节点为头结点的下一个节点
		d.next = p.next;
		//把头节点下一个节点指到新节点
		p.next = d;
		
		size++;//返回元素个数 (全局变量)
	}
	
	//删除元素，后入先出
	public static String pop() {
		//判断堆栈是否为空
		if(isEmpty()) {
			System.out.println("堆栈已经为空，无法删除");
			return null;
		}
		
		//获取头指针,栈顶元素
		Node p = head;
		
		Node temp = p.next;
		p.next = p.next.next;//删除
		
		size--;//返回元素个数 (全局变量)
		
		return temp.name;
	}
	
	//判断堆栈是否为空
	public static boolean isEmpty() {
		boolean flag = false;
		if(head.next == null) {
			flag = true;
		}
		return flag;
	}
	
	//返回元素个数
	public int size() {
		return size;
	}
	
	//查找元素
	public void find(String data) {
		Node p = head;
		while(p.next!=null) {
			if(p.next.name.equals(data)) {
				System.out.println("找到查找的数据: " + data);
				break;
			}else {
				p.next=p.next.next;
			}
		}
	}
	
	//获取栈顶元素
	public String peek() {
		if(isEmpty()) {
			return null;
		}
		return head.next.name;
	}
	
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push("组长");
		stack.push("部门经理");
		stack.push("副总");
		stack.push("总经理");
		stack.push("董事长");
		
		System.out.println("栈顶元素： "+ stack.peek());
		System.out.println("------------------------------>size为： " + stack.size());
		
		while(!stack.isEmpty()) {
			System.out.println("取出的元素为： "+stack.pop());
		}
		
		System.out.println("------------------------------>size为： " + stack.size());
		
	}

}
