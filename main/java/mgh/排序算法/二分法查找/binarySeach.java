package mgh.�����㷨.���ַ�����;

import java.util.Scanner;

import mgh.�����㷨.�鲢����.MergeSort;
import mgh.�ӿ�.��ӡ�ӿ�.print;

/**
* @author maguohao
* @version ����ʱ�䣺2018��9��5�� ����10:19:20
* ��˵��:
*/
public class binarySeach {

	public static void main(String[] args) {
		int[] data = { 1, 2, 3, 4, 5, 6, 7, 8 };//��������
		
//		MergeSort.sort(data, 0, data.length-1);//�鲢����
		print.printArray(data);//�鲢�������������
		
		//ʹ�ö��ַ�������Ӧ������
		Scanner input = new Scanner(System.in);
		System.out.println("����������Ҫ���ҵ����ݣ�");
		int target = input.nextInt();
		
		//������ҵ��������������ݵ�����
		int index = binarySearch(data,0,data.length-1,target);
		
		if(index > -1)
			System.out.println("���ݴ��ڣ�λ���ǵ�" + (index+1));
		else
			System.out.println("����û���ҵ�");
	}

   /**
	* @param data   �Ѿ���������飬Ҫ���ҵ�Ŀ������
	* @param start  ��ʼλ��
	* @param end	��ֹλ��
	* @param target	Ҫ���ҵ�ֵ
	* @return 		����Ҫ���ҵ�ֵ�������е�λ�ã����û���ҵ����򷵻�-1
	* @throws 
	*/
	public static int binarySearch(int[] data,int start,int end,int target) {
		
		//�ȿ�ѭ������
		while(start <= end) {
			
			//�ҵ��м���±�
			int mid = (start + end) / 2;
			if(data[mid] < target) {   
				start = mid + 1;       //Ŀ��Ԫ�ش����м�ֵ���������󲿷֣���ʼλ��Ϊmid+1
			}else if(data[mid] > target) {
				end = mid -1;          //Ŀ��Ԫ��С���м�ֵ���������Ҳ��֣�����λ��Ϊmid - 1
			}else {
				return mid;
			}
			
		}
		return -1;
	}
}
