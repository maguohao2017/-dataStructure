package mgh.���ģʽ.��Ϊ��ģʽ.�۲���ģʽ;

import mgh.���ģʽ.��Ϊ��ģʽ.�۲���ģʽ.*;
/**
* @author maguohao
* @version ����ʱ�䣺2018��9��4�� ����2:27:49
* ��˵��:
* ģ������ʹ����
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
		System.out.println("observer2 �õ� 3D ���� -->" + msg + "��Ҫ���������ǡ�");
	}

}
