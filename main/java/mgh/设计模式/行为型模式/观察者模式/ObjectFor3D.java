package mgh.���ģʽ.��Ϊ��ģʽ.�۲���ģʽ;

import java.util.ArrayList;
import java.util.List;
import mgh.���ģʽ.��Ϊ��ģʽ.�۲���ģʽ.*;
/**
* @author maguohao
* @version ����ʱ�䣺2018��9��4�� ����2:21:35
* ��˵��:
* 3D����ŵ�ʵ����
*/
public abstract class ObjectFor3D implements Subject{

	private List<Observer> observers = new ArrayList<Observer>();
	/**
	 * 3D��Ʊ�ĺ���
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
	 * ���������Ϣ
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
