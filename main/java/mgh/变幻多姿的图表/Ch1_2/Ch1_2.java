package mgh.变幻多姿的图表.Ch1_2;

import java.util.Scanner;

/**
 * 九九乘法表
 * @author dell
 *
 */

public class Ch1_2 {

	public static void main(String[] args) {
		
		for(int i=1;i<10;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+"*"+j+"="+(i*j)+" ");
			}
			System.out.println();
		}
		
	}

		

}

