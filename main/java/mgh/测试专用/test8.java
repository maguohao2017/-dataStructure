package mgh.����ר��;
/**
* @author maguohao
* @version ����ʱ�䣺2018��9��12�� ����12:13:43
* ��˵��:
* �����ַ���s��t��ȫ������Сд��ĸ��ɣ�����t����s����˳�������һ��λ�������һ���ַ����ҳ�����ַ���
* ��s="abcdf"
* t="abcdefg"
* ��1��ͨ����������count[26]�����¼26����ĸ���ֵĴ�����ͳ��sʱ�����ӷ���ͳ��t��ʱ�������������Ϊ-1�ľ��ǽ⡣��ֱ�ӷ��ʣ��ܿ죩
* ��2���õ����,����t����Ǹ��ַ��⣬�����������������
* ��3������ֱ����java�Դ���contains�����ж�s���Ƿ��������ĸ���������������������ӵ������ĸ֮ǰ���ַ���s��û�г��ֹ��������������Ŀ����test��Ƶ�һ��Ͷ��ȡ�ɵ����ӣ������Ժ���Ȼ���С����ǻ�������������¼һ���Լ���˼·���̣�return���Ǹ���1������㶨��ġ�
*/
public class test8 {

	public static void main(String[] args) {
		char ch = findTheDifference("ee", "eee");
		System.out.println(ch);
		System.out.println("--------�������ָ���---------");
		char ch2 = findTheDifference2("aac", "baac");
		System.out.println(ch2);
		System.out.println("--------�������ָ���---------");
		char ch3 = findTheDifference3("a", "ab");
		System.out.println(ch3);
		

	}
	
	public static char findTheDifference(String s,String t) {
		
		int[] ss = new int[26];
		int[] tt = new int[26];
		
		for(int i=0;i<s.length();i++) {
			ss[s.charAt(i) - 'a']++;
		}
		for(int i=0;i<t.length();i++) {
			tt[t.charAt(i) - 'a']++;
		}
		
		for(int i=0;i<26;i++) {
			
			if(ss[i]!=tt[i]) {
				return (char)('a' + i);
			}
		}
		return 0;
	}
	
	public static char findTheDifference2(String s, String t) {
        char tmp = 0x00;
        for(int i=0;i<s.length();i++)
            tmp =(char)( tmp ^ s.charAt(i));
        for(int i=0;i<t.length();i++)
            tmp = (char)(tmp ^ t.charAt(i));
        return tmp;
    }
	
	public static char findTheDifference3(String s, String t) {
		for(int i = 0; i < t.length(); i++){
    	   s.contains(String.valueOf(t.charAt(i)));
    	   if( !s.contains(String.valueOf(t.charAt(i)))){
    		   return t.charAt(i);
    	   }   
       }
        return '1';
    }


}
