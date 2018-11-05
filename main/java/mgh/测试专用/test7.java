package mgh.测试专用;
/**
* @author maguohao
* @version 创建时间：2018年9月12日 上午12:13:32
* 类说明:
* 题目描述: 4 5 6 8
* 我们有n条长度不一的绳子。现在我们想从绳子中切割出来m条长度相同的绳子，问这k条绳子最长有多长？ 
* 输入格式 
* 多组输入(<=20组数据，读入以EOF结尾) 
* 每组第一行输入两个数字，n(1<=n<=1000)为绳子数目，m(1<=m<=n)切割后相同长度的绳子的数目。 
* 每组第二行输入n个正整数，表示最初绳子的长度(<=10000) 
* 输出格式 
* 每组输出一行结果，表示切割后绳子的最长长度(保留两位有效数字)
* 样例输入
* 5 5
* 12 6 3 7 8
* 样例输出6.00
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
	    System.out.println("切割后绳子的最长长度: " + lb);
	}

}
