package mgh.���ģʽ.������ģʽ.����ģʽ.���󹤳�ģʽ;
/**
* @author maguohao
* @version ����ʱ�䣺2018��9��17�� ����12:52:40
* ��˵��:
* ��ʵ���ģʽ�ĺô����ǣ����������������һ�����ܣ�����ʱ��Ϣ����ֻ����һ��ʵ���࣬ʵ��Sender�ӿڣ�
* ͬʱ��һ�������࣬ʵ��Provider�ӿڣ���OK�ˣ�����ȥ�Ķ��ֳɵĴ��롣����������չ�ԽϺã�
*/
public class Test {

	public static void main(String[] args) {  
        Provider provider = new SendMailFactory();  
        Sender sender = provider.produce();  
        sender.Send();  
    }  
}
