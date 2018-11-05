package mgh.设计模式.创建型模式.工厂模式.抽象工厂模式;
/**
* @author maguohao
* @version 创建时间：2018年9月17日 上午12:23:07
* 类说明:
*/
public class MailSender implements Sender{

	public void Send() {
		System.out.println("this is mailsender!");
	}
}
