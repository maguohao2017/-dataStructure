package mgh.排序算法.冒泡排序;

import mgh.接口.打印接口.*;
/**
* @author maguohao
* @version 创建时间：2018年9月4日 下午11:18:01
* 类说明:
* 冒泡排序（Bubble Sort）是一种简单的排序算法。它重复地走访过要排序的数列，一次比较两个元素，如果他们的顺序错误就把他们交换过来。
* 走访数列的工作是重复地进行直到没有再需要交换，也就是说该数列已经排序完成。
* 这个算法的名字由来是因为越小的元素会经由交换慢慢“浮”到数列的顶端。
* 
* 冒泡排序算法稳定,最坏情况下的时间复杂度是O(n^2)，最好情况下是O(n)，平均是O(n^2)。空间复杂度是O(1)。
*/
public class bubbleSort{

	private int[] arr;
	 
    public bubbleSort(int[] arr) {
        this.arr = arr;
    }
    
	/**
	 * 冒泡排序
	 * 
	 * @param data
	 *            目标数组
	 */
	public static void bubbleSort(int[] data) {
 
		int tmp;//临时变量
//		int kk = 0;
		//外层循环是排序的趟数
		for (int i = 0; i < data.length - 1; i++) {// 控制趟数
			//内层循环是当前趟数需要比较的次数
			
//			kk = 0;
			
			for (int j = i+1; j <= data.length - 1; j++) {
				
//				kk++;
				
				//打印每层循环一次数据的变化
//				System.out.println("第" + (i+1) + "趟的第" + kk + "次");
				
				print.printArray(data);
				if (data[i] > data[j]) { //前面的值大于后面的值就进行交换
					tmp = data[i];		 //前面大的值给变量
					data[i] = data[j];	 //后面小的值赋给前面位置
					data[j] = tmp;       //前面大的值赋给后面位置
				}
			}
		}
 
	}

	public static void main(String[] args) {
		
		int[] data = new int[] { 5, 3, 6, 2, 1, 9, 4, 8, 7 };
		print.printArray(data);
		bubbleSort(data);
		System.out.println("排序后的数组：");
		print.printArray(data);

	}

}
