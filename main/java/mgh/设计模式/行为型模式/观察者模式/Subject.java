package mgh.设计模式.行为型模式.观察者模式;

import java.util.Observer;
import mgh.设计模式.行为型模式.观察者模式.*;
/**
* @author maguohao
* @version 创建时间：2018年9月4日 下午2:17:41
* 类说明
* 主题接口，所有的主题必须实现此接口
*/

public interface Subject {

	/**
	 * 注册一个观察着
	 * 
	 * @param observer2
	 */
	public void registerObserver(Observer2 observer2);
 
	/**
	 * 移除一个观察者
	 * 
	 * @param observer
	 */
	public void removeObserver(Observer observer);
 
	/**
	 * 通知所有的观察着
	 */
	public void notifyObservers();

	public void registerObserver(Observer1 observer1);

	void registerObserver(mgh.设计模式.行为型模式.观察者模式.Observer observer);

}
