package mgh.���ģʽ.������ģʽ.����ģʽ.�򵥹���ģʽ;
/**
* @author maguohao
* @version ����ʱ�䣺2018��9��17�� ����12:29:17
* ��˵��:
*/
public class FactoryTest {

	public static void main(String[] args) {
		
		SendFactory factory = new SendFactory();
        Sender sender = factory.produce("sms");
        sender.Send();

	}

}
