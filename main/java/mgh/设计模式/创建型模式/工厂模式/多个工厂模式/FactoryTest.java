package mgh.设计模式.创建型模式.工厂模式.多个工厂模式;

import mgh.设计模式.创建型模式.工厂模式.简单工厂模式.Sender;

/**
* @author maguohao
* @version 创建时间：2018年9月17日 上午12:43:07
* 类说明:
*/
public class FactoryTest {

	public static void main(String[] args) {  
        SendFactory factory = new SendFactory();  
        Sender sender = factory.produceMail();  
        sender.Send();  
    }  
}
