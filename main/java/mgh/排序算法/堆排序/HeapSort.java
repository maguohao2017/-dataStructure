package mgh.�����㷨.������;

import mgh.�ӿ�.��ӡ�ӿ�.print;

/**
* @author maguohao
* @version ����ʱ�䣺2018��9��5�� ����1:37:57
* ��˵��:�������ǶԼ�ѡ������ĸĽ�
* ������������й����һ���󶥶ѡ���ʱ���������е����ֵ���ǶѶ��ĸ��ڵ㡣
* ��������(��ʵ���ǽ�����������ĩβԪ�ؽ�������ʱĩβԪ�ؾ������ֵ)��
* Ȼ��ʣ���n-1���������¹����һ���ѣ������ͻ�õ�n��Ԫ���еĴ����ֵ����˷���ִ�У����ܵõ�һ�����������ˡ�
* 
* �������㷨���ȶ�,�����µ�ʱ�临�Ӷ���O(nlog n)������������O(nlog n)��ƽ����O(nlog n)���ռ临�Ӷ���O(1)��
*/
public class HeapSort {

	public static void main(String[] args) {
		int[] data = new int[] { 5, 3, 6, 2, 1, 9, 4, 8, 7 };
		print.printArray(data);
		//����ִ��
		heapSort(data);
		System.out.println("���������飺");
		print.printArray(data);

	}
	
	/**
	 * ������
	 */
	private static void heapSort(int[] arr) { 
		// ������������й�����һ���󶥶�
		for (int i = arr.length / 2; i >= 0; i--){ 
			heapAdjust(arr, i, arr.length); 
		}
		
		// �𲽽�ÿ�����ֵ�ĸ��ڵ���ĩβԪ�ؽ����������ٵ�����������ʹ���Ϊ�󶥶�
		for (int i = arr.length - 1; i > 0; i--) { 
			swap(arr, 0, i); // ���Ѷ���¼�͵�ǰδ�����������е����һ����¼����
			heapAdjust(arr, 0, i); // ����֮����Ҫ���¼����Ƿ���ϴ󶥶ѣ���������Ҫ����
		}
	}
 
	/**
	 * �����ѵĹ���
	 * @param arr ��Ҫ���������
	 * @param i ��Ҫ�����ѵĸ��ڵ�����
	 * @param n ����ĳ���
	 */
	private static void heapAdjust(int[] arr, int i, int n) {
		int child;
		int father; 
		for (father = arr[i]; leftChild(i) < n; i = child) {
			child = leftChild(i);
			
			// ���������С��������������Ҫ�Ƚ��������͸��ڵ�
			if (child != n - 1 && arr[child] < arr[child + 1]) {
				child++; // �����1��ָ��������
			}
			
			// ������ڵ�С�ں��ӽ�㣬����Ҫ����
			if (father < arr[child]) {
				arr[i] = arr[child];
			} else {
				break; // �󶥶ѽṹδ���ƻ�������Ҫ����
			}
		}
		arr[i] = father;
	}
 
	// ��ȡ�����ӽ��
	private static int leftChild(int i) {
		return 2 * i + 1;
	}
	
	// ����Ԫ��λ��
	private static void swap(int[] arr, int index1, int index2) {
		int tmp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = tmp;
	}


}
