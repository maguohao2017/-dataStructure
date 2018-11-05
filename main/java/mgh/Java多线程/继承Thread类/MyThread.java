package mgh.Java多线程.继承Thread类;
/**
* @author maguohao
* @version 创建时间：2018年9月4日 上午1:53:19
* 类说明:
*/
public class MyThread extends Thread{
	private int i;
	public MyThread(int i) {
		super();
		this.i= i;
	}
	
	@Override
	public void run() {
		super.run();
		System.out.println("MyThread" + i);
	}
}
