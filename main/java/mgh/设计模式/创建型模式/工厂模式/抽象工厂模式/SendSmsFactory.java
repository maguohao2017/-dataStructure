package mgh.���ģʽ.������ģʽ.����ģʽ.���󹤳�ģʽ;
/**
* @author maguohao
* @version ����ʱ�䣺2018��9��17�� ����12:52:12
* ��˵��:
*/
public class SendSmsFactory implements Provider{  
  
    public Sender produce() {  
        return new SmsSender();  
    }  

}
