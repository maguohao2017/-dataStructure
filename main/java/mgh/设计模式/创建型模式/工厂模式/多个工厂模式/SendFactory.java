package mgh.设计模式.创建型模式.工厂模式.多个工厂模式;

import mgh.设计模式.创建型模式.工厂模式.简单工厂模式.MailSender;
import mgh.设计模式.创建型模式.工厂模式.简单工厂模式.Sender;
import mgh.设计模式.创建型模式.工厂模式.简单工厂模式.SmsSender;

/**
* @author maguohao
* @version 创建时间：2018年9月17日 上午12:42:14
* 类说明:
*/
public class SendFactory {
	
	public Sender produceMail(){  
		return new MailSender();  
    }  
      
    public Sender produceSms(){  
        return new SmsSender();  
    }  
}
