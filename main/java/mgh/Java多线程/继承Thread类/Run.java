package mgh.Java���߳�.�̳�Thread��;
/**
* @author maguohao
* @version ����ʱ�䣺2018��9��4�� ����1:52:32
* ��˵��:�߳�����˳����start()ִ��˳���޹�
*/
public class Run {

	public static void main(String[] args) {
		MyThread myThread1 = new MyThread(1);
		MyThread myThread2 = new MyThread(2);
		MyThread myThread3 = new MyThread(3);
		MyThread myThread4 = new MyThread(4);
		MyThread myThread5 = new MyThread(5);
		myThread1.start();
		myThread2.start();
		myThread3.start();
		myThread4.start();
		myThread5.start();
		System.out.println("��������!");
		/**
		 * �߳�����˳����start()ִ��˳���޹�
		 * 
		 * ��������!
		 * MyThread2
		 * MyThread5
		 * MyThread3
		 * MyThread4
		 * MyThread1
		 */

	}

}
