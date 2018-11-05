package mgh.设计模式.创建型模式.工厂模式.简单工厂模式;
/**
* @author maguohao
* @version 创建时间：2018年9月17日 上午12:28:14
* 类说明:
* 最后，建工厂类：
*/
public class SendFactory {

	public Sender produce(String type) {
		
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }

}
