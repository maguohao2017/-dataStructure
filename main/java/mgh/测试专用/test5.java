package mgh.����ר��;
/**
* @author maguohao
* @version ����ʱ�䣺2018��9��11�� ����9:34:42
* ��˵��:
* ����java���ú�������String�ַ���ת��Ϊ����:������
* �������ͣ�int ������λ����32
* ��װ�ࣺjava.lang.Integer
* ��Сֵ��Integer.MIN_VALUE= -2147483648 ��-2��31�η���
* ���ֵ��Integer.MAX_VALUE= 2147483647  ��2��31�η�-1
*/
public class test5 {

	public static void main(String[] args) throws Exception {
		int ss = StringtoInt("-1234567890");
		System.out.println(ss);
	}
	
	public static int StringtoInt(String s)throws Exception {
		
		if(s == null || "".equals(s)) {
			throw new Exception("Ҫת�����ַ���Ϊ�գ��޷�ת����");
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
			        throw new Exception("Ҫת�����ַ�����ʽ�����޷�ת����");
			    }
			}
			System.out.println(s.charAt(i) +" ������ "+ flag);
			returnInt = returnInt * 10;
			returnInt = returnInt + (s.charAt(i) - '0');
			System.out.println(returnInt);
		}
		
		return flag ? -returnInt : returnInt;
	}

}
