package mgh.测试专用;
/**
 * @author maguohao
 * @version 创建时间：2018年9月11日 下午10:00:06
 * 类说明:
 * 不用java内置函数，将String字符串转换为double
 * 基本类型：double 二进制位数：64
 * 包装类：java.lang.Double
 * 最小值：Double.MIN_VALUE=4.9E-324 （2的-1074次方）
 * 最大值：Double.MAX_VALUE=1.7976931348623157E308 （2的1024次方-1）
 */
public class test6 {




	public static void main(String[] args) throws Exception {
		double ss = StringtoDouble("-12345678.0");
		System.out.println(ss);
	}

	/**

	 * before  : 小数点前面的数值
	 * after = : 小数点后面的数值
	 * afterE :    指数E后面的数值

	 * flag ：标识是否大于0

	 * eflag ：标识e的指数是否大于0

	 * beforePointFlag ：标识是否在小数点前面，此处用byte是后面要用来做累加计算，多个小数点时返回0.0

	 * beforeEflag ：标识是否在E前面，此处用byte是后面要用来做累加计算，多个E时返回0.0

	 * 算法基本思想：用一个char型数组来保存string，然后逐个分析各个char，

	 * 首先：如果开始有正负符号的话，正负符号保留

	 * 然后分：      0-9之间的字符 用字符的ASII码-48得到对应的数字，然后根据两个标识位（小数点前/后，E前/后）来取得对应的数值。

	 *                       如果是小数点的话：第一次出现正确标识，大于一次时，非合法数字串，返回0.0

	 *                         如果是E/e: 第一个正确标识标示位。  ，大于一个是，返回0.0，

	 *                        再次出现正负号，出现一次时候是E后面的指数，大于一个，返回0.0，

	 *                          其他情况一律返回0.0
	 */
	public static double StringtoDouble(String str)throws Exception {
		if(str == null || "".equals(str)) {
			throw new Exception("要转换的字符串为空，无法转换！");
		}

		double before = 0.0, after = 0.0;

		int afterE = 0;//指数E后面的数值
		double index = 1.0;//标识系数
		boolean flag = true;//标识是否大于0
		boolean eflag = true;//标识e的指数是否大于0   
		byte beforePointFlag = 0;//标识是否在小数点前面，此处用byte是后面要用来做累加计算，多个小数点时返回0.0
		byte beforeEflag = 0;//标识是否在E前面，此处用byte是后面要用来做累加计算，多个E时返回0.0

		int len = str.length();
		char temp[];
		if (str.startsWith("+")) {
			temp = str.substring(1).toCharArray();
			len--;
		} else if (str.startsWith("-")) {
			flag = false;
			temp = str.substring(1).toCharArray();
			len--;
		} else {
			temp = str.toCharArray();
		};

		for (int i = 0; i < len; i++) {

			if (temp[i] >= '0' && temp[i] <= '9') {
				if (beforeEflag == 0) {
					if (beforePointFlag == 0) {
						before = before * 10.0 + (temp[i] - 48);
					} else if (beforePointFlag == 1) {
						index = index * 0.1;
						after = after + (temp[i] - 48) * index;
					}
				} else if (beforeEflag == 1) {
					afterE = afterE * 10 + (temp[i] - 48);
				}

			} else if (temp[i] == '.') {

				beforePointFlag++;
				if (beforePointFlag > 1) {
					return 0.0;
				}
			} else if (temp[i] == 'e' || temp[i] == 'E') {

				beforeEflag++;
				if (beforeEflag > 1) {
					return 0.0;
				}
			} else if (temp[i] == '+' || temp[i] == '-') {
				if (beforeEflag == 1 && temp[i] == '-') {
					eflag = false;
				} else {
					return 0.0;
				}
			} else {
				return 0.0;
			}

		}// end for

		if (eflag == false) {
			afterE = afterE * (-1);
		}
		if (flag == false) {
			return (before + after) * Math.pow(10, afterE * 1.0) * (-1.0);
		} else {
			return (before + after) * Math.pow(10, afterE * 1.0);
		}

	}

}
