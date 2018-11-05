package mgh.�����㷨.���ַ�����;
/**
* @author maguohao
* @version ����ʱ�䣺2018��9��5�� ����1:43:57
* ��˵��:
* �㷨�����������ܴ����˲��ø÷��������ö��ַ�����ʱ���������������ظ��ġ� 
* ����˼�룺���������ǰ���������ģ����ڸ���ֵ x�������е��м�λ�ÿ�ʼ�Ƚϣ�
* �����ǰλ��ֵ���� x������ҳɹ����� x С�ڵ�ǰλ��ֵ���������е�ǰ����в��ң��� x ���ڵ�ǰλ��ֵ�������еĺ����м������ң�ֱ���ҵ�Ϊֹ��
*/
public class twoSearch {

	public static void main(String[] args) {
		int[] arr = new int[] { 12, 23, 34, 45, 56, 67, 77, 89, 90 };
	       System.out.println(search(arr, 12));
	       System.out.println(search(arr, 45));
	       System.out.println(search(arr, 67));
	       System.out.println(search(arr, 89));
	       System.out.println(search(arr, 99));

	}
	public static int search(int[] arr, int key) {
	       int start = 0;
	       int end = arr.length - 1;
	       while (start <= end) {
	           int middle = (start + end) / 2;
	           if (key < arr[middle]) {
	               end = middle - 1;
	           } else if (key > arr[middle]) {
	               start = middle + 1;
	           } else {
	               return middle;
	           }
	       }
	       return -1;
	   }

}
