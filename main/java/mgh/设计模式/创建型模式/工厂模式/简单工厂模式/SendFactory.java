package mgh.���ģʽ.������ģʽ.����ģʽ.�򵥹���ģʽ;
/**
* @author maguohao
* @version ����ʱ�䣺2018��9��17�� ����12:28:14
* ��˵��:
* ��󣬽������ࣺ
*/
public class SendFactory {

	public Sender produce(String type) {
		
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("��������ȷ������!");
            return null;
        }
    }

}
