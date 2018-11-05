package mgh.排序算法.插入排序;
import mgh.接口.打印接口.*;
/**
 * 直接插入排序
 * @author maguohao
 * @category 2018-8-27
 * 直接插入排序算法稳定。最坏情况下的时间复杂度是O(n^2)，最好情况下是O(n)，空间复杂度是O(1)
 * 
 * 算法的时间复杂度：用来度量算法的运行时间。它表示随着 输入大小n 的增大，算法执行需要的时间的增长速度可以用 f(n) 来描述。
 * 算法的空间复杂度(Space Complexity)S(n)： 算法所耗费的存储空间。   当一个算法的空间复杂度为一个常量，即不随被处理数据量n的大小而改变时，可表示为O(1)
 */
public class insertSort {
	
	public static void main(String[] args) {
		
		int[] arr = { 6, 5, 3, 1, 8, 7, 2, 4 };//排序数组
		
		System.out.println("排序前:");
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i]+"  ");
		}
		
		// 直接插入排序
		insertSort(arr);
		
		System.out.println();
		System.out.println("排序后:");
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i]+"  ");
		}
		
		
	}
	
	/**
	 * 直接插入排序
	 */
	private static void insertSort(int[] arr) {
		
		int j; // 已排序元素下标
		int t; // 待排序元素
		for(int i = 1; i < arr.length; i++) {
			
			if(arr[i] < arr[i-1]) {
				
				t = arr[i];// 赋值给待排序元素
				
//				for(j = i -1;j >= 0 && arr[j] > t;j--) {
//					arr[j + 1] = arr[j];// 从后往前遍历已排序列表，逐个和待排序元素比较，如果已排序元素较大，则将它后移
//				}
				
				//while循环比for循环瞅着舒服
				j = i - 1;
				while(j >= 0 && arr[j] > t) {
					
					arr[j + 1] = arr[j];// 从后往前遍历已排序列表，逐个和待排序元素比较，如果已排序元素较大，则将它后移
					j--;
				}
				
				arr[j + 1] = t;// 将待排序元素插入到正确的位置
			}
			
			print.printArray(arr);
		}
		
	}
	
}
