package mgh.Java���߳�.�̳�Thread��;
/**
* @author maguohao
* @version ����ʱ�䣺2018��9��4�� ����1:53:19
* ��˵��:
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
