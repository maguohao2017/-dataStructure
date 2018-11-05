package mgh.排序算法.二分法查找;

import java.util.Scanner;

import mgh.排序算法.归并排序.MergeSort;
import mgh.接口.打印接口.print;

/**
* @author maguohao
* @version 创建时间：2018年9月5日 上午10:19:20
* 类说明:
*/
public class binarySeach {

	public static void main(String[] args) {
		int[] data = { 1, 2, 3, 4, 5, 6, 7, 8 };//排序数组
		
//		MergeSort.sort(data, 0, data.length-1);//归并排序
		print.printArray(data);//归并排序完是有序的
		
		//使用二分法查找相应的数据
		Scanner input = new Scanner(System.in);
		System.out.println("请输入您想要查找的数据：");
		int target = input.nextInt();
		
		//定义查找的索引，查找数据的索引
		int index = binarySearch(data,0,data.length-1,target);
		
		if(index > -1)
			System.out.println("数据存在，位置是第" + (index+1));
		else
			System.out.println("数据没有找到");
	}

   /**
	* @param data   已经排序的数组，要查找的目标数组
	* @param start  起始位置
	* @param end	终止位置
	* @param target	要查找的值
	* @return 		返回要查找的值在数组中的位置，如果没有找到，则返回-1
	* @throws 
	*/
	public static int binarySearch(int[] data,int start,int end,int target) {
		
		//先看循环里面
		while(start <= end) {
			
			//找到中间的下标
			int mid = (start + end) / 2;
			if(data[mid] < target) {   
				start = mid + 1;       //目标元素大于中间值，则舍弃左部分，起始位置为mid+1
			}else if(data[mid] > target) {
				end = mid -1;          //目标元素小于中间值，则舍弃右部分，结束位置为mid - 1
			}else {
				return mid;
			}
			
		}
		return -1;
	}
}
