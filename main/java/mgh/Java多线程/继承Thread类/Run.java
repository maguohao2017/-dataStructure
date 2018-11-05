package mgh.Java多线程.继承Thread类;
/**
* @author maguohao
* @version 创建时间：2018年9月4日 上午1:52:32
* 类说明:线程启动顺序与start()执行顺序无关
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
		System.out.println("结束运行!");
		/**
		 * 线程启动顺序与start()执行顺序无关
		 * 
		 * 结束运行!
		 * MyThread2
		 * MyThread5
		 * MyThread3
		 * MyThread4
		 * MyThread1
		 */

	}

}
