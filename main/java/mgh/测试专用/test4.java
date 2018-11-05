package mgh.测试专用;
/**
* @author maguohao
* @version 创建时间：2018年9月10日 上午12:19:47
* 类说明:
* 不采用java的内置函数，把String类型转换为int类型。
* 基本类型：int 二进制位数：32
* 包装类：java.lang.Integer
* 最小值：Integer.MIN_VALUE= -2147483648 （-2的31次方）
* 最大值：Integer.MAX_VALUE= 2147483647  （2的31次方-1）
*/
public class test4 {

	public static void main(String[] args) throws Exception {
		int ss = StringtoInt("+1234567890");
		System.out.println(ss);

	}
	
	/**
	   * 不用java内置函数，将String字符串转换为数字
	   * @param s
	   * @return
	   * @throws Exception 
	   */
	public static int StringtoInt(String s)throws Exception{
		if(s == null || s.length() == 0) {
			throw new Exception("要转换的字符串为空，无法转换！");
		}
		int[] arr = new int[s.length()];
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch == '-') {
				arr[i] = -1;
			}else if(ch == '+') {
				arr[i] = 1/10;
			}else if(ch == '0') {
				arr[i] = 0;
			}else if(ch == '1') {
				arr[i] = 1;
			}else if(ch == '2') {
				arr[i] = 2;
			}else if(ch == '3') {
				arr[i] = 3;
			}else if(ch == '4') {
				arr[i] = 4;
			}else if(ch == '5') {
				arr[i] = 5;
			}else if(ch == '6') {
				arr[i] = 6;
			}else if(ch == '7') {
				arr[i] = 7;
			}else if(ch == '8') {
				arr[i] = 8;
			}else if(ch == '9') {
				arr[i] = 9;
			}else {
				throw new Exception("要转换的字符串格式错误，无法转换！");
			}
		}
		
		int returnInt = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0 && i>0) {
				throw new Exception("要转换的字符串格式错误，无法转换！");
			}
//			if(arr[i] <0) {continue;}
			returnInt = returnInt * 10;
			returnInt = returnInt + arr[i];
		}
//		if(arr[0] == -1) {
//			returnInt = -returnInt;
//		}
		return arr[0] == -1 ? -returnInt : returnInt;
				
	}

}
