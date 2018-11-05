package mgh.二叉树.链表实现二叉树;
/**
* @author maguohao
* @version 创建时间：2018年9月12日 下午11:15:00
* 类说明:
*/
public class BTree {

	//根节点
	Node root;
	//创建树
	public BTree(int data) {
		root = new Node(data);
	}
	
	//新增节点
	public void addNode(int data) {
		//获取根节点
		Node p = root;
		//生成新增节点
		Node t = new Node(data);
		while(true) {
			//放到根节点的左边
			if(p.data > data) {
				if(p.leftChild != null) {
					//继续往下找
					p = p.leftChild;
				}else {
					p.leftChild = t;
					break;
				}
			}else {//放到根节点的右边
				if(p.rightChild != null) {
					//继续往下找
					p = p.rightChild;
				}else {
					p.rightChild = t;
					break;
				}
			}
		}
	}
	
	public void display(Node node) {
		
		//前序遍历
		//10 8 7 3 1 -10 6 20 90 100
//		System.err.println("前序遍历: "+node.data);
		if(node.leftChild != null) {//往左走
			display(node.leftChild);
		}
		
		//中序遍历
		//-10 1 3 6 7 8 10 20 90 100
//		System.out.println("中序遍历: " + node.data);
		if(node.rightChild != null) {//往右走
			display(node.rightChild);
		}
		
		//后续遍历
		//-10 1 6 3 7 8 100 90 20 10
		System.out.println("后续遍历: " + node.data);
			
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
