package mgh.��ö��˵�ͼ��.Ch1_1;

import java.util.Scanner;

/**
 * ������ͼ��
 * @author dell
 *
 */

public class Ch1_1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("�����������������");
		//ָscanner��ȡ��������int���͵ĳ��ȶ�ȡ
		int n = input.nextInt();
		Ch1_1.test1(n);
		Ch1_1.test2(n);
		Ch1_1.test3(n);
		
	}

	private static void test1(int n) {
		System.out.println("��һ���ֿ�ʼ��");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
			System.out.printf("\n");
		}
		System.out.println("��һ���ֽ�����");
		
	}
	private static void test2(int n) {
		System.out.println("�ڶ����ֿ�ʼ��");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*(n-i)+1;k++) {
				System.out.print("*");
			}
			System.out.printf("\n");
		}
		System.out.println("�ڶ����ֽ�����");
		
	}
	private static void test3(int n) {
		System.out.println("�������ֿ�ʼ��");
		for(int i=1;i<=n;i++) {
			for(int j=0;j<=n-i;j++) {
				System.out.print("*");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print(" ");
			}
			System.out.printf("\n");
		}
		System.out.println("�������ֽ�����");
		
	}

}

