package mgh.设计模式.行为型模式.观察者模式;

import mgh.设计模式.行为型模式.观察者模式.*;
/**
* @author maguohao
* @version 创建时间：2018年9月4日 下午2:20:42
* 类说明:
* 所有的观察者需要实现此接口
*/
public interface Observer {

	public void update(String msg);
}
