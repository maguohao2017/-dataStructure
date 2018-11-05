package mgh.排序算法.归并排序;

import java.awt.TexturePaint;
import mgh.接口.打印接口.*;

/**
 * 归并排序 
 * @author maguohao
 * @category 2018-8-30
 * 归并排序（Merge）是将两个（或两个以上）有序表合并成一个新的有序表，即把待排序序列分为若干个子序列，每个子序列是有序的。
 * 然后再把有序子序列合并为整体有序序列。归并排序是建立在归并操作上的一种有效的排序算法。
 * 该算法是采用分治法（Divide and Conquer）的一个非常典型的应用。 
 * 将已有序的子序列合并，得到完全有序的序列；即先使每个子序列有序，再使子序列段间有序。
 * 若将两个有序表合并成一个有序表，称为2-路归并。
 * 归并排序算法稳定，数组需要O(n)的额外空间，链表需要O(log(n))的额外空间，时间复杂度都为O(nlog(n))，算法不是自适应的，不需要对数据的随机读取。
 * 工作原理：
 * 1、申请空间，使其大小为两个已经排序序列之和，该空间用来存放合并后的序列
 * 2、设定两个指针，最初位置分别为两个已经排序序列的起始位置
 * 3、比较两个指针所指向的元素，选择相对小的元素放入到合并空间，并移动指针到下一位置
 * 4、重复步骤3直到某一指针达到序列尾
 * 5、将另一序列剩下的所有元素直接复制到合并序列尾
 */
public class MergeSort {

	public static void main(String[] args) {
		
		int[] data = new int[] { 5, 3, 6, 2, 1, 9, 4, 8, 7 };
		print.printArray(data);
		//初次执行
		mergeSort(data);
		System.out.println("排序后的数组：");
		print.printArray(data);

	}
	
	public static void mergeSort(int[] data) {
		sort(data,0,data.length-1);
	}
	
	public static void sort(int[] data,int left,int right) {
		
		if(left >= right) {
			return;
		}
		// 找出中间索引
		int center = (left + right) / 2;
		// 对左边数组进行递归
		sort(data,left,center);
		// 对右边数组进行递归
		sort(data,center + 1,right);
		// 合并
		merge(data, left, center, right);
		print.printArray(data);
	}
	
	/**
	 * 将两个数组进行归并，归并前面2个数组已有序，归并后依然有序
	 * 
	 * @param data
	 *            数组对象
	 * @param left
	 *            左数组的第一个元素的索引
	 * @param center
	 *            左数组的最后一个元素的索引，center+1是右数组第一个元素的索引
	 * @param right
	 *            右数组最后一个元素的索引
	 */
	public static void merge(int[] data,int left,int center,int right) {
		
		// 临时数组
		int[] tmpArr = new int[data.length];	 
		// 右数组第一个元素索引下标
		int b = center + 1;
		// 记录临时数组的索引下标
		int a = left;
		// 缓存左数组第一个元素的索引下标
		int tmp = left;
		
		while (left <= center && b <= right) {
			// 从两个数组中取出最小的放入临时数组
			if(data[left] <= data[b]) {
				tmpArr[a++] = data[left++];
			}else {
				tmpArr[a++] = data[b++];
			}
		}
		
		// 剩余部分依次放入临时数组（实际上两个while只会执行其中一个）
		while(b <= right) {
			tmpArr[a++] = data[a++];
		}
		while(left <= center) {
			tmpArr[a++] = data[left++];
		}
		
		// 将临时数组中的内容拷贝回原数组中
		// （原left-right范围的内容被复制回原数组）
		while(tmp <= right) {
			data[tmp] = tmpArr[tmp++];
		}
		
	}
	
}
