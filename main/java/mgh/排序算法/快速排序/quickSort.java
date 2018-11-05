package mgh.�����㷨.��������;

import mgh.�ӿ�.��ӡ�ӿ�.print;

/**
* @author maguohao
* @version ����ʱ�䣺2018��9��5�� ����1:22:47
* ��˵��:
* ��������Quicksort���Ƕ�ð�������һ�ָĽ�����C. A. R. Hoare��1962�������
* ���Ļ���˼���ǣ�ͨ��һ������Ҫ��������ݷָ�ɶ����������֣�����һ���ֵ��������ݶ�������һ���ֵ��������ݶ�ҪС��
* Ȼ���ٰ��˷����������������ݷֱ���п�����������������̿��Եݹ���У��Դ˴ﵽ�������ݱ���������С�
* 
* ���������㷨���ȶ�,�����µ�ʱ�临�Ӷ���O(n^2)������������O(nlog n)��ƽ����O(nlog n)���ռ临�Ӷ���O(nlog n)��
*/
public class quickSort {

	public static void main(String[] args) {
		int[] data = new int[] { 5, 3, 6, 2, 1, 9, 4, 8, 7 };
		print.printArray(data);
		//����ִ��
		quickSort(data,0,data.length-1);
		System.out.println("���������飺");
		print.printArray(data);

	}
	/**
	 * ���������㷨
	 * 
	 * @param data
	 *            Ŀ������
	 * @param start
	 *            ��ʼλ
	 * @param end
	 *            ����λ
	 */
	public static void quickSort(int[] data, int start, int end) {
		// ���ùؼ�����keyΪҪ��������ĵ�һ��Ԫ�أ�
		// ����һ�������key�ұߵ���ȫ����key��key��ߵ���ȫ����keyС
		int key = data[start];
		// ����������ߵ������������ƶ���key�����
		int left = start;
		// ���������ұߵ������������ƶ���keyС����
		int right = end;
		// �������������ұ�����С����������û������
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
		// ��ʱ left==right
		data[left] = key;
 
		// �ݹ����
		if (left - 1 > start) {
			// �ݹ���ã���keyǰ����������
			quickSort(data, start, left - 1);
		}
		if (left + 1 < end) {
			// �ݹ���ã���key������������
			quickSort(data, left + 1, end);
		}
	}

}
