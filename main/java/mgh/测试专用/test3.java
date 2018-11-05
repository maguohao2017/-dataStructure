package mgh.测试专用;
/**
* @author maguohao
* @version 创建时间：2018年9月6日 下午11:32:34
* 类说明:
* 输入三个数组，求最大数。
*/
public class test3 {
	
	

	public static void main(String[] args) {
		
		int getMax1 = getMax1(66,666,6666);
		int getMax2 = getMax2(5566,666,6666);
		int getMax3 = getMax3(66,555666,6666);
		System.out.println("方法一：" + getMax1);
		System.out.println("方法二：" + getMax2);
		System.out.println("方法三：" + getMax3);

	}
	//第一种写法  大多数人正常写法
	public static int getMax1(int a,int b,int c) {
		
		int max;
		if(a>b && a>c) {
			max = a;
		}else if(c>a && c>b) {
			max = c;
		}else {
			max = b;
		}
		return max;
	} 
	//稍微高级一点的写法
	public static int getMax2(int a,int b,int c) {
		
		int max = a;
		if(b>max) {
			max = b;
		}else if(c>max) {
			max = c;
		}
		return max;
	} 
	
	//三元运算符
	public static int getMax3(int a,int b,int c) {
		
		int max = (a>b)?a:b;
		max = (max >c)?max:c;
		return max;
	} 
	
	
	

}
