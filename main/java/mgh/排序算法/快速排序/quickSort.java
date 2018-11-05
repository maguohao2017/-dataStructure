package mgh.排序算法.快速排序;

import mgh.接口.打印接口.print;

/**
* @author maguohao
* @version 创建时间：2018年9月5日 上午1:22:47
* 类说明:
* 快速排序（Quicksort）是对冒泡排序的一种改进。由C. A. R. Hoare在1962年提出。
* 它的基本思想是：通过一趟排序将要排序的数据分割成独立的两部分，其中一部分的所有数据都比另外一部分的所有数据都要小，
* 然后再按此方法对这两部分数据分别进行快速排序，整个排序过程可以递归进行，以此达到整个数据变成有序序列。
* 
* 快速排序算法不稳定,最坏情况下的时间复杂度是O(n^2)，最好情况下是O(nlog n)，平均是O(nlog n)。空间复杂度是O(nlog n)。
*/
public class quickSort {

	public static void main(String[] args) {
		int[] data = new int[] { 5, 3, 6, 2, 1, 9, 4, 8, 7 };
		print.printArray(data);
		//初次执行
		quickSort(data,0,data.length-1);
		System.out.println("排序后的数组：");
		print.printArray(data);

	}
	/**
	 * 快速排序算法
	 * 
	 * @param data
	 *            目标数组
	 * @param start
	 *            起始位
	 * @param end
	 *            结束位
	 */
	public static void quickSort(int[] data, int start, int end) {
		// 设置关键数据key为要排序数组的第一个元素，
		// 即第一趟排序后，key右边的数全部比key大，key左边的数全部比key小
		int key = data[start];
		// 设置数组左边的索引，往右移动比key大的数
		int left = start;
		// 设置数组右边的索引，往左移动比key小的数
		int right = end;
		// 如果左边索引比右边索引小，则还有数据没有排序
		while (left < right) {
			while (data[right] > key && right > left) {
				right--;
			}
			data[left] = data[right];
 
			while (data[left] < key && left < right) {
				left++;
			}
			data[right] = data[left];
		}
		// 此时 left==right
		data[left] = key;
 
		// 递归调用
		if (left - 1 > start) {
			// 递归调用，把key前面的完成排序
			quickSort(data, start, left - 1);
		}
		if (left + 1 < end) {
			// 递归调用，把key后面的完成排序
			quickSort(data, left + 1, end);
		}
	}

}
