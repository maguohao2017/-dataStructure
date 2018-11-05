package mgh.变幻多姿的图表.Ch1_1;

import java.util.Scanner;

/**
 * 金字塔图案
 * @author dell
 *
 */

public class Ch1_1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("请输入金字塔层数：");
		//指scanner读取的数据以int类型的长度读取
		int n = input.nextInt();
		Ch1_1.test1(n);
		Ch1_1.test2(n);
		Ch1_1.test3(n);
		
	}

	private static void test1(int n) {
		System.out.println("第一部分开始！");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
			System.out.printf("\n");
		}
		System.out.println("第一部分结束！");
		
	}
	private static void test2(int n) {
		System.out.println("第二部分开始！");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*(n-i)+1;k++) {
				System.out.print("*");
			}
			System.out.printf("\n");
		}
		System.out.println("第二部分结束！");
		
	}
	private static void test3(int n) {
		System.out.println("第三部分开始！");
		for(int i=1;i<=n;i++) {
			for(int j=0;j<=n-i;j++) {
				System.out.print("*");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print(" ");
			}
			System.out.printf("\n");
		}
		System.out.println("第三部分结束！");
		
	}

}

