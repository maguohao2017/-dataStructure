package mgh.设计模式.行为型模式.观察者模式;

import mgh.设计模式.行为型模式.观察者模式.*;
/**
* @author maguohao
* @version 创建时间：2018年9月4日 下午2:27:49
* 类说明:
* 模拟两个使用者
*/
public class Observer2 implements Observer {

private Subject subject ; 
	
	public Observer2(Subject subject)
	{
		this.subject = subject  ;
		subject.registerObserver(this);
	}
	
	public void update(String msg)
	{
		System.out.println("observer2 得到 3D 号码 -->" + msg + "我要告诉舍友们。");
	}

}
