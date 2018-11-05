package mgh.�����㷨.ѡ������;

import mgh.�ӿ�.��ӡ�ӿ�.print;

/**
* @author maguohao
* @version ����ʱ�䣺2018��9��5�� ����1:19:40
* ��˵��:����forѭ�������ѭ������������������ڲ�ѭ���ҵ���ǰ���������ֵ������뵱ǰ����������һλԪ�ؽ���
* 
* ѡ������(Selection sort)��һ�ּ�ֱ�۵������㷨�����Ĺ���ԭ�����¡�
* ������δ�����������ҵ���С����Ԫ�أ���ŵ��������е���ʼλ�ã�
* Ȼ���ٴ�ʣ��δ����Ԫ���м���Ѱ����С����Ԫ�أ�Ȼ��ŵ����������е�ĩβ��
* �Դ����ƣ�ֱ������Ԫ�ؾ�������ϡ�
* 
* ѡ�������㷨���ȶ�,�����µ�ʱ�临�Ӷ���O(n^2)������������O(n^2)��ƽ����O(n^2)���ռ临�Ӷ���O(1)��
*/
public class selectSort {

	public static void main(String[] args) {
		int[] data = new int[] { 5, 3, 6, 2, 1, 9, 4, 8, 7 };
		print.printArray(data);
		//����ִ��
		selectSort(data);
		System.out.println("���������飺");
		print.printArray(data);
	}
	/**
	 * ѡ������
	 * 
	 * @param data
	 *            Ŀ������
	 */
	public static void selectSort(int[] data) {
		if (data == null || data.length == 0) {
			return;
		}
 
		for (int i = 0; i < data.length - 1; i++) {
			int min = i;// ����ǰ�±궨Ϊ��Сֵ�±�
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
