package mgh.设计模式.创建型模式.单例模式;
/**
* @author maguohao
* @version 创建时间：2018年9月17日 上午1:16:05
* 类说明:
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
