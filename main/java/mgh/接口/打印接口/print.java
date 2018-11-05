package mgh.接口.打印接口;
/**
* @author maguohao
* @version 创建时间：2018年9月5日 上午12:14:48
* 类说明:
* 打印输入输出
*/
public class print {

	public static void printArray(int[] data) {
		for (int i : data) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}
}
