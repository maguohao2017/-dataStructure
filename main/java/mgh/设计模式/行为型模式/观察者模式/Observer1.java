package mgh.设计模式.行为型模式.观察者模式;

import mgh.设计模式.行为型模式.观察者模式.*;
/**
* @author maguohao
* @version 创建时间：2018年9月4日 下午2:25:09
* 类说明:
* 模拟两个使用者
*/
public class Observer1 implements Observer {

	private Subject subject;

	public Observer1(Subject subject){
		this.subject = subject;
		subject.registerObserver(this);
	}

	public void update(String msg){
		System.out.println("observer1 得到 3D 号码  -->" + msg + ", 我要记下来。");
	}

}
