package mgh.�����㷨.��������;
import mgh.�ӿ�.��ӡ�ӿ�.*;
/**
 * ֱ�Ӳ�������
 * @author maguohao
 * @category 2018-8-27
 * ֱ�Ӳ��������㷨�ȶ��������µ�ʱ�临�Ӷ���O(n^2)������������O(n)���ռ临�Ӷ���O(1)
 * 
 * �㷨��ʱ�临�Ӷȣ����������㷨������ʱ�䡣����ʾ���� �����Сn �������㷨ִ����Ҫ��ʱ��������ٶȿ����� f(n) ��������
 * �㷨�Ŀռ临�Ӷ�(Space Complexity)S(n)�� �㷨���ķѵĴ洢�ռ䡣   ��һ���㷨�Ŀռ临�Ӷ�Ϊһ�������������汻����������n�Ĵ�С���ı�ʱ���ɱ�ʾΪO(1)
 */
public class insertSort {
	
	public static void main(String[] args) {
		
		int[] arr = { 6, 5, 3, 1, 8, 7, 2, 4 };//��������
		
		System.out.println("����ǰ:");
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i]+"  ");
		}
		
		// ֱ�Ӳ�������
		insertSort(arr);
		
		System.out.println();
		System.out.println("�����:");
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i]+"  ");
		}
		
		
	}
	
	/**
	 * ֱ�Ӳ�������
	 */
	private static void insertSort(int[] arr) {
		
		int j; // ������Ԫ���±�
		int t; // ������Ԫ��
		for(int i = 1; i < arr.length; i++) {
			
			if(arr[i] < arr[i-1]) {
				
				t = arr[i];// ��ֵ��������Ԫ��
				
//				for(j = i -1;j >= 0 && arr[j] > t;j--) {
//					arr[j + 1] = arr[j];// �Ӻ���ǰ�����������б�����ʹ�����Ԫ�رȽϣ����������Ԫ�ؽϴ���������
//				}
				
				//whileѭ����forѭ���������
				j = i - 1;
				while(j >= 0 && arr[j] > t) {
					
					arr[j + 1] = arr[j];// �Ӻ���ǰ�����������б�����ʹ�����Ԫ�رȽϣ����������Ԫ�ؽϴ���������
					j--;
				}
				
				arr[j + 1] = t;// ��������Ԫ�ز��뵽��ȷ��λ��
			}
			
			print.printArray(arr);
		}
		
	}
	
}
