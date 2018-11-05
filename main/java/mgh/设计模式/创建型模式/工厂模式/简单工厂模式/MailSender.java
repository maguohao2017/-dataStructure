package mgh.设计模式.创建型模式.工厂模式.简单工厂模式;

import mgh.设计模式.创建型模式.工厂模式.简单工厂模式.Sender;
/**
* @author maguohao
* @version 创建时间：2018年9月17日 上午12:23:07
* 类说明:
* 其次，创建实现类：
*/
public class MailSender implements Sender{

	public void Send() {
		System.out.println("this is mail sender! 发送邮件");
	}
}
