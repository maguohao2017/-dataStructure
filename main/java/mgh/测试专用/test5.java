package mgh.测试专用;
/**
* @author maguohao
* @version 创建时间：2018年9月11日 下午9:34:42
* 类说明:
* 不用java内置函数，将String字符串转换为数字:方法二
* 基本类型：int 二进制位数：32
* 包装类：java.lang.Integer
* 最小值：Integer.MIN_VALUE= -2147483648 （-2的31次方）
* 最大值：Integer.MAX_VALUE= 2147483647  （2的31次方-1
*/
public class test5 {

	public static void main(String[] args) throws Exception {
		int ss = StringtoInt("-1234567890");
		System.out.println(ss);
	}
	
	public static int StringtoInt(String s)throws Exception {
		
		if(s == null || "".equals(s)) {
			throw new Exception("要转换的字符串为空，无法转换！");
		}
		int returnInt = 0;
		boolean flag = false;
		for(int i=0;i<s.length();i++) {
			if(i==0) {
				if(s.charAt(i)=='-') {
					flag = true;
					continue;
				}
			}else {
				if(s.charAt(i)>'9' || s.charAt(i)<'0'){
			        throw new Exception("要转换的字符串格式错误，无法转换！");
			    }
			}
			System.out.println(s.charAt(i) +" ？？？ "+ flag);
			returnInt = returnInt * 10;
			returnInt = returnInt + (s.charAt(i) - '0');
			System.out.println(returnInt);
		}
		
		return flag ? -returnInt : returnInt;
	}

}
