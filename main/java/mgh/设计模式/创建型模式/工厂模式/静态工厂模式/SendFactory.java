package mgh.���ģʽ.������ģʽ.����ģʽ.��̬����ģʽ;

import mgh.���ģʽ.������ģʽ.����ģʽ.�򵥹���ģʽ.Sender;
import mgh.���ģʽ.������ģʽ.����ģʽ.�򵥹���ģʽ.SmsSender;
import mgh.���ģʽ.������ģʽ.����ģʽ.�򵥹���ģʽ.MailSender;

/**
* @author maguohao
* @version ����ʱ�䣺2018��9��17�� ����12:45:22
* ��˵��:
* ��̬��������ģʽ��������Ķ����������ģʽ��ķ�����Ϊ��̬�ģ�����Ҫ����ʵ����ֱ�ӵ��ü��ɡ�
*/
public class SendFactory {

	public static Sender produceMail(){  
        return new MailSender();  
    }  
      
    public static Sender produceSms(){  
        return new SmsSender();  
    }  
}
