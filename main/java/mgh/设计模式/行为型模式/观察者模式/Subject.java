package mgh.���ģʽ.��Ϊ��ģʽ.�۲���ģʽ;

import java.util.Observer;
import mgh.���ģʽ.��Ϊ��ģʽ.�۲���ģʽ.*;
/**
* @author maguohao
* @version ����ʱ�䣺2018��9��4�� ����2:17:41
* ��˵��
* ����ӿڣ����е��������ʵ�ִ˽ӿ�
*/

public interface Subject {

	/**
	 * ע��һ���۲���
	 * 
	 * @param observer2
	 */
	public void registerObserver(Observer2 observer2);
 
	/**
	 * �Ƴ�һ���۲���
	 * 
	 * @param observer
	 */
	public void removeObserver(Observer observer);
 
	/**
	 * ֪ͨ���еĹ۲���
	 */
	public void notifyObservers();

	public void registerObserver(Observer1 observer1);

	void registerObserver(mgh.���ģʽ.��Ϊ��ģʽ.�۲���ģʽ.Observer observer);

}
