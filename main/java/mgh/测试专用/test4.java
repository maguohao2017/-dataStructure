package mgh.����ר��;
/**
* @author maguohao
* @version ����ʱ�䣺2018��9��10�� ����12:19:47
* ��˵��:
* ������java�����ú�������String����ת��Ϊint���͡�
* �������ͣ�int ������λ����32
* ��װ�ࣺjava.lang.Integer
* ��Сֵ��Integer.MIN_VALUE= -2147483648 ��-2��31�η���
* ���ֵ��Integer.MAX_VALUE= 2147483647  ��2��31�η�-1��
*/
public class test4 {

	public static void main(String[] args) throws Exception {
		int ss = StringtoInt("+1234567890");
		System.out.println(ss);

	}
	
	/**
	   * ����java���ú�������String�ַ���ת��Ϊ����
	   * @param s
	   * @return
	   * @throws Exception 
	   */
	public static int StringtoInt(String s)throws Exception{
		if(s == null || s.length() == 0) {
			throw new Exception("Ҫת�����ַ���Ϊ�գ��޷�ת����");
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
				throw new Exception("Ҫת�����ַ�����ʽ�����޷�ת����");
			}
		}
		
		int returnInt = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0 && i>0) {
				throw new Exception("Ҫת�����ַ�����ʽ�����޷�ת����");
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
