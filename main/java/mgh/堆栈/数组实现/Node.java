package mgh.堆栈.数组实现;


/**
* @author maguohao
* @version 创建时间：2018年9月12日 上午10:44:12
* 类说明:
* 
*/
public class Node {
	
public String name;//节点数据域
	
	public Node next;//下一个节点的地址
	
	public Node() {
		this.name = "";
		this.next = null;
	}
	
	public Node(String name) {
		this.name = name;
		this.next = null;
	}
}
