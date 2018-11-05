package mgh.设计模式.创建型模式.工厂模式.静态工厂模式;

import mgh.设计模式.创建型模式.工厂模式.简单工厂模式.Sender;
import mgh.设计模式.创建型模式.工厂模式.简单工厂模式.SmsSender;
import mgh.设计模式.创建型模式.工厂模式.简单工厂模式.MailSender;

/**
* @author maguohao
* @version 创建时间：2018年9月17日 上午12:45:22
* 类说明:
* 静态工厂方法模式，将上面的多个工厂方法模式里的方法置为静态的，不需要创建实例，直接调用即可。
*/
public class SendFactory {

	public static Sender produceMail(){  
        return new MailSender();  
    }  
      
    public static Sender produceSms(){  
        return new SmsSender();  
    }  
}
