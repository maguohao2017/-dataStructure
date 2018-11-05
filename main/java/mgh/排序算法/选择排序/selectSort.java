package mgh.排序算法.选择排序;

import mgh.接口.打印接口.print;

/**
* @author maguohao
* @version 创建时间：2018年9月5日 上午1:19:40
* 类说明:两个for循环，外层循环控制排序的趟数，内层循环找到当前趟数的最大值，随后与当前趟数组最后的一位元素交换
* 
* 选择排序(Selection sort)是一种简单直观的排序算法。它的工作原理如下。
* 首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置，
* 然后，再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
* 以此类推，直到所有元素均排序完毕。
* 
* 选择排序算法不稳定,最坏情况下的时间复杂度是O(n^2)，最好情况下是O(n^2)，平均是O(n^2)。空间复杂度是O(1)。
*/
public class selectSort {

	public static void main(String[] args) {
		int[] data = new int[] { 5, 3, 6, 2, 1, 9, 4, 8, 7 };
		print.printArray(data);
		//初次执行
		selectSort(data);
		System.out.println("排序后的数组：");
		print.printArray(data);
	}
	/**
	 * 选择排序
	 * 
	 * @param data
	 *            目标数组
	 */
	public static void selectSort(int[] data) {
		if (data == null || data.length == 0) {
			return;
		}
 
		for (int i = 0; i < data.length - 1; i++) {
			int min = i;// 将当前下标定为最小值下标
			for (int j = i + 1; j < data.length; j++) {
				if (data[j] < data[min]) {
					min = j;
				}
			}
 
			if (i != min) {
				int tmp = data[i];
				data[i] = data[min];
				data[min] = tmp;
			}
		}
	}
}
