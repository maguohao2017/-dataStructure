package mgh.���ģʽ.������ģʽ.����ģʽ.���󹤳�ģʽ;
/**
* @author maguohao
* @version ����ʱ�䣺2018��9��17�� ����12:50:50
* ��˵��:
* ����������
*/
public class SendMailFactory implements Provider{

    public Sender produce(){  
        return new MailSender();  
    }  
}
