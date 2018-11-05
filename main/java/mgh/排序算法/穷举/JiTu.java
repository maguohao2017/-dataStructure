package mgh.排序算法.穷举;
/**
* @author maguohao
* @version 创建时间：2018年9月5日 上午11:33:04
* 类说明:
* 鸡兔同笼穷举算法  ，鸡兔一共50个头，120只脚
*/
public class JiTu {

	public static void main(String[] args) {
		
		//设置x只鸡
		for(int x=0;x<=50;x++) {
			//定义兔子数量
			int y = 50 - x;
			if(x*2 + y*4 == 120) {
				System.out.println("鸡=" + x + "只，兔=" + y + "只");
			}
		}

	}

}
