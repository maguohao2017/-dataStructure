package mgh.����ר��;
/**
* @author maguohao
* @version ����ʱ�䣺2018��9��6�� ����11:32:34
* ��˵��:
* �����������飬���������
*/
public class test3 {
	
	

	public static void main(String[] args) {
		
		int getMax1 = getMax1(66,666,6666);
		int getMax2 = getMax2(5566,666,6666);
		int getMax3 = getMax3(66,555666,6666);
		System.out.println("����һ��" + getMax1);
		System.out.println("��������" + getMax2);
		System.out.println("��������" + getMax3);

	}
	//��һ��д��  �����������д��
	public static int getMax1(int a,int b,int c) {
		
		int max;
		if(a>b && a>c) {
			max = a;
		}else if(c>a && c>b) {
			max = c;
		}else {
			max = b;
		}
		return max;
	} 
	//��΢�߼�һ���д��
	public static int getMax2(int a,int b,int c) {
		
		int max = a;
		if(b>max) {
			max = b;
		}else if(c>max) {
			max = c;
		}
		return max;
	} 
	
	//��Ԫ�����
	public static int getMax3(int a,int b,int c) {
		
		int max = (a>b)?a:b;
		max = (max >c)?max:c;
		return max;
	} 
	
	
	

}
