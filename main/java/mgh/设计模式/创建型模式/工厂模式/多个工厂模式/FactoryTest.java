package mgh.���ģʽ.������ģʽ.����ģʽ.�������ģʽ;

import mgh.���ģʽ.������ģʽ.����ģʽ.�򵥹���ģʽ.Sender;

/**
* @author maguohao
* @version ����ʱ�䣺2018��9��17�� ����12:43:07
* ��˵��:
*/
public class FactoryTest {

	public static void main(String[] args) {  
        SendFactory factory = new SendFactory();  
        Sender sender = factory.produceMail();  
        sender.Send();  
    }  
}
