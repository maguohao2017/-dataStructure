package mgh.���ģʽ.������ģʽ.����ģʽ.�������ģʽ;

import mgh.���ģʽ.������ģʽ.����ģʽ.�򵥹���ģʽ.MailSender;
import mgh.���ģʽ.������ģʽ.����ģʽ.�򵥹���ģʽ.Sender;
import mgh.���ģʽ.������ģʽ.����ģʽ.�򵥹���ģʽ.SmsSender;

/**
* @author maguohao
* @version ����ʱ�䣺2018��9��17�� ����12:42:14
* ��˵��:
*/
public class SendFactory {
	
	public Sender produceMail(){  
		return new MailSender();  
    }  
      
    public Sender produceSms(){  
        return new SmsSender();  
    }  
}
