package mgh.����ר��;
/**
* @author maguohao
* @version ����ʱ�䣺2018��9��12�� ����12:13:32
* ��˵��:
* ��Ŀ����: 4 5 6 8
* ������n�����Ȳ�һ�����ӡ�������������������и����m��������ͬ�����ӣ�����k��������ж೤�� 
* �����ʽ 
* ��������(<=20�����ݣ�������EOF��β) 
* ÿ���һ�������������֣�n(1<=n<=1000)Ϊ������Ŀ��m(1<=m<=n)�и����ͬ���ȵ����ӵ���Ŀ�� 
* ÿ��ڶ�������n������������ʾ������ӵĳ���(<=10000) 
* �����ʽ 
* ÿ�����һ�н������ʾ�и�����ӵ������(������λ��Ч����)
* ��������
* 5 5
* 12 6 3 7 8
* �������6.00
*/
public class test7 {

	public static void main(String[] args) {
		int[] k = {12,6,3,7,8};
		test(5,5,k);
	}
	
	public static void test(int n,int m,int[] k) {
		
		int max = 0;
		while(n>1 && m>1) {
			for(int i=0;i<n;i++) {
				if(max < k[i]) {
					max = k[i];
				}
			}
			volidate(max,n,m,k);
			break;
		}
	}
	
	public static void volidate(int max,int n,int m,int[] k) {
		float  lb = 0, ub = 2 * max;
	    for (int i = 0; i < 100; i++)
	    {
	        float mid = (lb + ub) / 2;
	        int b = 0;
	        for (int j = 0; j < n; j++) {
	            b += (int)(k[j] / mid);
	        }

	        if (b < m)
	            ub = mid;
	        else
	            lb = mid;
	    }
	    System.out.println("�и�����ӵ������: " + lb);
	}

}
