package mgh.测试专用;
/**
* @author maguohao
* @version 创建时间：2018年9月6日 上午1:17:53
* 类说明:
* 大小写转换
* 将一个字符由小写字母转换为大写字母
* 样例
* a -> A
* b -> B
*/
public class test2 {

	public static void main(String[] args) {
		
		char character = 'v';
		char ch = lowercaseToUppercase(character);
		System.out.println(character + " 转换后: " + ch);
	}
	/**
	 * 
	 * @Title: lowercaseToUppercase
	 * @Description: （1）String.valueOf(boolean b) : 将 boolean 变量 b 转换成字符串 
	 * （2）String.valueOf(char c) : 将 char 变量 c 转换成字符串 
	 * （3）String.valueOf(char[] data) : 将 char 数组 data 转换成字符串 
	 * （4）String.valueOf(char[] data, int offset, int count) : 将 char 数组 data 中 由 data[offset] 开始取 count 个元素 转换成字符串 
	 * （5）String.valueOf(double d) : 将 double 变量 d 转换成字符串 
	 * （6）String.valueOf(float f) : 将 float 变量 f 转换成字符串 
	 * （7）String.valueOf(int i) : 将 int 变量 i 转换成字符串 
	 * （8）String.valueOf(long l) : 将 long 变量 l 转换成字符串 
	 * （9）String.valueOf(Object obj) : 将 obj 对象转换成 字符串, 等于 obj.toString() 
	 * @param character
	 * @return: char
	 */
	public static char lowercaseToUppercase(char character) {
		String str = String.valueOf(character).toUpperCase();
        return str.charAt(0);//charAt() 方法用于返回指定索引处的字符。索引范围为从 0 到 length() - 1。
    }
}
