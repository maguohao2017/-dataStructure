package mgh.����ר��;
/**
* @author maguohao
* @version ����ʱ�䣺2018��9��6�� ����1:17:53
* ��˵��:
* ��Сдת��
* ��һ���ַ���Сд��ĸת��Ϊ��д��ĸ
* ����
* a -> A
* b -> B
*/
public class test2 {

	public static void main(String[] args) {
		
		char character = 'v';
		char ch = lowercaseToUppercase(character);
		System.out.println(character + " ת����: " + ch);
	}
	/**
	 * 
	 * @Title: lowercaseToUppercase
	 * @Description: ��1��String.valueOf(boolean b) : �� boolean ���� b ת�����ַ��� 
	 * ��2��String.valueOf(char c) : �� char ���� c ת�����ַ��� 
	 * ��3��String.valueOf(char[] data) : �� char ���� data ת�����ַ��� 
	 * ��4��String.valueOf(char[] data, int offset, int count) : �� char ���� data �� �� data[offset] ��ʼȡ count ��Ԫ�� ת�����ַ��� 
	 * ��5��String.valueOf(double d) : �� double ���� d ת�����ַ��� 
	 * ��6��String.valueOf(float f) : �� float ���� f ת�����ַ��� 
	 * ��7��String.valueOf(int i) : �� int ���� i ת�����ַ��� 
	 * ��8��String.valueOf(long l) : �� long ���� l ת�����ַ��� 
	 * ��9��String.valueOf(Object obj) : �� obj ����ת���� �ַ���, ���� obj.toString() 
	 * @param character
	 * @return: char
	 */
	public static char lowercaseToUppercase(char character) {
		String str = String.valueOf(character).toUpperCase();
        return str.charAt(0);//charAt() �������ڷ���ָ�����������ַ���������ΧΪ�� 0 �� length() - 1��
    }
}
