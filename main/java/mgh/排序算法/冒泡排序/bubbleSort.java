package mgh.�����㷨.ð������;

import mgh.�ӿ�.��ӡ�ӿ�.*;
/**
* @author maguohao
* @version ����ʱ�䣺2018��9��4�� ����11:18:01
* ��˵��:
* ð������Bubble Sort����һ�ּ򵥵������㷨�����ظ����߷ù�Ҫ��������У�һ�αȽ�����Ԫ�أ�������ǵ�˳�����Ͱ����ǽ���������
* �߷����еĹ������ظ��ؽ���ֱ��û������Ҫ������Ҳ����˵�������Ѿ�������ɡ�
* ����㷨��������������ΪԽС��Ԫ�ػᾭ�ɽ������������������еĶ��ˡ�
* 
* ð�������㷨�ȶ�,�����µ�ʱ�临�Ӷ���O(n^2)������������O(n)��ƽ����O(n^2)���ռ临�Ӷ���O(1)��
*/
public class bubbleSort{

	private int[] arr;
	 
    public bubbleSort(int[] arr) {
        this.arr = arr;
    }
    
	/**
	 * ð������
	 * 
	 * @param data
	 *            Ŀ������
	 */
	public static void bubbleSort(int[] data) {
 
		int tmp;//��ʱ����
//		int kk = 0;
		//���ѭ�������������
		for (int i = 0; i < data.length - 1; i++) {// ��������
			//�ڲ�ѭ���ǵ�ǰ������Ҫ�ȽϵĴ���
			
//			kk = 0;
			
			for (int j = i+1; j <= data.length - 1; j++) {
				
//				kk++;
				
				//��ӡÿ��ѭ��һ�����ݵı仯
//				System.out.println("��" + (i+1) + "�˵ĵ�" + kk + "��");
				
				print.printArray(data);
				if (data[i] > data[j]) { //ǰ���ֵ���ں����ֵ�ͽ��н���
					tmp = data[i];		 //ǰ����ֵ������
					data[i] = data[j];	 //����С��ֵ����ǰ��λ��
					data[j] = tmp;       //ǰ����ֵ��������λ��
				}
			}
		}
 
	}

	public static void main(String[] args) {
		
		int[] data = new int[] { 5, 3, 6, 2, 1, 9, 4, 8, 7 };
		print.printArray(data);
		bubbleSort(data);
		System.out.println("���������飺");
		print.printArray(data);

	}

}
