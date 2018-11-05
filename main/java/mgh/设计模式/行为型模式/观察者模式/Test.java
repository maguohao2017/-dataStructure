package mgh.设计模式.行为型模式.观察者模式;

import mgh.设计模式.行为型模式.观察者模式.*;
/**
* @author maguohao
* @version 创建时间：2018年9月4日 下午2:28:31
* 设计模式 观察者模式 微信公众服务
* 观察者模式的定义:定义了对象之间的一对多的依赖，这样一来，当一个对象改变时，它的所有的依赖者都会收到通知并自动更新。
* 1、服务号就是主题，业务就是推送消
* 2、观察者只需要订阅主题，只要有新的消息就会送来
* 3、当不想要此主题消息时，取消订阅
* 4、只要服务号还在，就会一直有人订阅
* 类说明:服务号中维护了所有向它订阅消息的使用者，当服务号有新消息时，通知所有的使用者。
* 整个架构是一种松耦合，主题的实现不依赖与使用者，当增加新的使用者时，主题的代码不需要改变；使用者如何处理得到的数据与主题无关。
*/
public class Test {

	public static void main(String[] args) {
		
		//模拟一个3D的服务号
		ObjectFor3D subjectFor3d = new ObjectFor3D();
		//客户1
		Observer observer1 = new Observer1(subjectFor3d);
		Observer observer2 = new Observer2(subjectFor3d);
 
		subjectFor3d.setMsg("20140420的3D号码是：127" );
		subjectFor3d.setMsg("20140421的3D号码是：333" );
	}

}
