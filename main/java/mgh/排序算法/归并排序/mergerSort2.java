package mgh.排序算法.归并排序;

import mgh.接口.打印接口.print;

/**
* @author maguohao
* @version 创建时间：2018年9月5日 上午12:44:32
* 类说明:
* 将两个已排好序的数组合并成一个有序的数组。
* 将元素分隔开来，看成是有序的数组，进行比较合并
* 不断拆分和合并，直到只有一个元素
*/
public class mergerSort2 {

	public static void main(String[] args) {
		int[] a = new int[] {1,8,11,19};
		int[] b = new int[] {3,4,7,12};
		//将两数组合并
		int[] c = merge(a,b);
		System.out.println("排序后的数组：");
		print.printArray(c);

	}
	
	/**
	 * 将两个数组进行归并，归并前面2个数组已有序，归并后依然有序
	 * 
	 * @param a
	 *            待排序数组a
	 * @param b
	 *            待排序数组b
	 * @return c
	 *            a , b 数组归并后的数组
	 */
	public static int[] merge(int[] a,int[] b) {
		//定义归并后的数组
		int[] temArr = new int[a.length+b.length];
		//数组下标
		int ai=0;//表示数组a的下标
		int bi=0;//表示数组b的下标
		int ti=0;//表示数组temArr结果的下标
		
		//待排序数组 最小值比较，最小值放入到temArr里面
		while(ai < a.length && bi < b.length) {
			if(a[ai] <= b[bi]) {
				temArr[ti++]=a[ai++];//先赋值，然后下标移动到下一个位置
			}else {
				temArr[ti++]=b[bi++];
			}
			
		}
		
		//若某一个数组长度已经完毕，则剩下的数据，依次放入到归并结果数组temArr
		while(ai < a.length) temArr[ti++]=a[ai++];
		while(bi < b.length) temArr[ti++]=b[bi++];
		
		return temArr;
	}
	
}
