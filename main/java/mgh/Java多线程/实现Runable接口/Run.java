package mgh.Java���߳�.ʵ��Runable�ӿ�;
/**
* @author maguohao
* @version ����ʱ�䣺2018��9��4�� ����2:06:59
* ��˵��:
*/
public class Run {

	public static void main(String[] args) {
		
		Runnable runnable = new MyRunable(); 
		Thread thread = new Thread(runnable);
		thread.start();
		System.out.println("���н���!");
	}

}
