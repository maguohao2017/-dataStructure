package mgh.���ģʽ.������ģʽ.������ģʽ;

import java.util.ArrayList;
import java.util.List;

import mgh.���ģʽ.������ģʽ.����ģʽ.���󹤳�ģʽ.MailSender;
import mgh.���ģʽ.������ģʽ.����ģʽ.���󹤳�ģʽ.Sender;
import mgh.���ģʽ.������ģʽ.����ģʽ.���󹤳�ģʽ.SmsSender;

/**
* @author maguohao
* @version ����ʱ�䣺2018��9��17�� ����1:29:46
* ��˵��:
* ������ģʽ�ṩ���Ǵ����������ģʽ����������ģʽ���ǽ����ֲ�Ʒ�����������й��������������϶���
* ��ν���϶������ָĳ������в�ͬ�����ԣ���ʵ������ģʽ����ǰ����󹤳�ģʽ������Test��������õ��ġ�
*/
public class Builder {

	private List<Sender> list = new ArrayList<Sender>();  
    
    public void produceMailSender(int count){  
        for(int i=0; i<count; i++){  
            list.add(new MailSender());  
        }  
    }  
      
    public void produceSmsSender(int count){  
        for(int i=0; i<count; i++){  
            list.add(new SmsSender());  
        }  
    }  
}
