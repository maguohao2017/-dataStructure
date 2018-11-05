package mgh.�����㷨.�鲢����;

import mgh.�ӿ�.��ӡ�ӿ�.print;

/**
* @author maguohao
* @version ����ʱ�䣺2018��9��5�� ����12:44:32
* ��˵��:
* ���������ź��������ϲ���һ����������顣
* ��Ԫ�طָ���������������������飬���бȽϺϲ�
* ���ϲ�ֺͺϲ���ֱ��ֻ��һ��Ԫ��
*/
public class mergerSort2 {

	public static void main(String[] args) {
		int[] a = new int[] {1,8,11,19};
		int[] b = new int[] {3,4,7,12};
		//��������ϲ�
		int[] c = merge(a,b);
		System.out.println("���������飺");
		print.printArray(c);

	}
	
	/**
	 * ������������й鲢���鲢ǰ��2�����������򣬹鲢����Ȼ����
	 * 
	 * @param a
	 *            ����������a
	 * @param b
	 *            ����������b
	 * @return c
	 *            a , b ����鲢�������
	 */
	public static int[] merge(int[] a,int[] b) {
		//����鲢�������
		int[] temArr = new int[a.length+b.length];
		//�����±�
		int ai=0;//��ʾ����a���±�
		int bi=0;//��ʾ����b���±�
		int ti=0;//��ʾ����temArr������±�
		
		//���������� ��Сֵ�Ƚϣ���Сֵ���뵽temArr����
		while(ai < a.length && bi < b.length) {
			if(a[ai] <= b[bi]) {
				temArr[ti++]=a[ai++];//�ȸ�ֵ��Ȼ���±��ƶ�����һ��λ��
			}else {
				temArr[ti++]=b[bi++];
			}
			
		}
		
		//��ĳһ�����鳤���Ѿ���ϣ���ʣ�µ����ݣ����η��뵽�鲢�������temArr
		while(ai < a.length) temArr[ti++]=a[ai++];
		while(bi < b.length) temArr[ti++]=b[bi++];
		
		return temArr;
	}
	
}
