package mgh.二叉树.链表实现二叉树;


/**
* @author maguohao
* @version 创建时间：2018年9月12日 下午11:11:54
* 类说明:
*/
public class Node {

	//数据域
	int data;
	
	//左孩子
	Node leftChild;
	
	//右孩子
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
