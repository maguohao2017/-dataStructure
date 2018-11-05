package mgh.设计模式.创建型模式.工厂模式.抽象工厂模式;
/**
* @author maguohao
* @version 创建时间：2018年9月17日 上午12:52:40
* 类说明:
* 其实这个模式的好处就是，如果你现在想增加一个功能：发及时信息，则只需做一个实现类，实现Sender接口，
* 同时做一个工厂类，实现Provider接口，就OK了，无需去改动现成的代码。这样做，拓展性较好！
*/
public class Test {

	public static void main(String[] args) {  
        Provider provider = new SendMailFactory();  
        Sender sender = provider.produce();  
        sender.Send();  
    }  
}
