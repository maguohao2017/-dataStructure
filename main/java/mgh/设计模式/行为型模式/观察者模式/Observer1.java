package mgh.���ģʽ.��Ϊ��ģʽ.�۲���ģʽ;

import mgh.���ģʽ.��Ϊ��ģʽ.�۲���ģʽ.*;
/**
* @author maguohao
* @version ����ʱ�䣺2018��9��4�� ����2:25:09
* ��˵��:
* ģ������ʹ����
*/
public class Observer1 implements Observer {

	private Subject subject;

	public Observer1(Subject subject){
		this.subject = subject;
		subject.registerObserver(this);
	}

	public void update(String msg){
		System.out.println("observer1 �õ� 3D ����  -->" + msg + ", ��Ҫ��������");
	}

}
