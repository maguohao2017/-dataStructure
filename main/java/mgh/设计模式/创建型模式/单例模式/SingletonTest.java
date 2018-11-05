package mgh.���ģʽ.������ģʽ.����ģʽ;
/**
* @author maguohao
* @version ����ʱ�䣺2018��9��17�� ����1:16:05
* ��˵��:
*/
public class SingletonTest {

	private static SingletonTest instance = null;  
	  
    private SingletonTest() {  
    }  
  
    private static synchronized void syncInit() {  
        if (instance == null) {  
            instance = new SingletonTest();  
        }  
    }  
  
    public static SingletonTest getInstance() {  
        if (instance == null) {  
            syncInit();  
        }  
        return instance;  
    }  
}
