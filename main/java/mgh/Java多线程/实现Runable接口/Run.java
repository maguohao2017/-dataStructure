package mgh.Java多线程.实现Runable接口;
/**
* @author maguohao
* @version 创建时间：2018年9月4日 上午2:06:59
* 类说明:
*/
public class Run {

	public static void main(String[] args) {
		
		Runnable runnable = new MyRunable(); 
		Thread thread = new Thread(runnable);
		thread.start();
		System.out.println("运行结束!");
	}

}
