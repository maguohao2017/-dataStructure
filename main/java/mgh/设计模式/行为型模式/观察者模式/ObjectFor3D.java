package mgh.设计模式.行为型模式.观察者模式;

import java.util.ArrayList;
import java.util.List;
import mgh.设计模式.行为型模式.观察者模式.*;
/**
* @author maguohao
* @version 创建时间：2018年9月4日 下午2:21:35
* 类说明:
* 3D服务号的实现类
*/
public abstract class ObjectFor3D implements Subject{

	private List<Observer> observers = new ArrayList<Observer>();
	/**
	 * 3D彩票的号码
	 */
	private String msg;
	
	@Override
	public void registerObserver(Observer observer){
		observers.add(observer);
	}
	
	@Override
	public void removeObserver(Observer observer)
	{
		int index = observers.indexOf(observer);
		if (index >= 0)
		{
			observers.remove(index);
		}
	}
 
	@Override
	public void notifyObservers(){
		for (Observer observer : observers)
		{
			observer.update(msg);
		}
	}
	
	/**
	 * 主题更新消息
	 * 
	 * @param msg
	 */
	public void setMsg(String msg){
		this.msg = msg;
		
		notifyObservers();
	}

	public void registerObserver(Observer2 observer2) {
		// TODO Auto-generated method stub
		
	}

	public void removeObserver(java.util.Observer observer) {
		// TODO Auto-generated method stub
		
	}

	public void registerObserver(Observer1 observer1) {
		// TODO Auto-generated method stub
		
	}



}
