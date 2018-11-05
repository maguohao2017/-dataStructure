package mgh.����ר��;
/**
* @author maguohao
* @version ����ʱ�䣺2018��9��12�� ����12:54:43
* ��˵��:
* ������������к�
* ������������к���һ�������������⣬Ҳ���㷨�о����һ�����⡣��Ϊ�ܽᣬ����ʹ���򵥵ı�����⣬д��Ŀǰ�ܴﵽ��õ�����ʱ�临�Ӷȵ��㷨��
* �����������ҳ�һ�����������е�������������еĺ� 
* ����������int[] a = { 1, -3, 7, 8, -4, 12, -10, 6 }; 
* �����23
* ��������������к��� 7 + 8 - 4+ 12 = 23
*/
public class test11 {

	public static void main(String[] args) {
		int[] a = { 1, -3, 7, 8, -4, 12, -10, 6 };
        System.out.println("��һ�ֱ���������" + maxSubSum1(a));
        System.out.println("�ڶ��ֱ����Ľ�������" + maxSubSum2(a));
        System.out.println("�����ַ��β��Է�����" + maxSubSum3(a));
        System.out.println("���������Է�����" + maxSubSum4(a));
        System.out.println("�����ֶ�̬�滮������" + maxSubSum5(a));
	}
	
	//1��O��n^3���ı������
	/**
     * ���˼·������ö�����еĿ����ԣ��ó����Ľ��
     *  ʱ�临�Ӷ�ΪO(n^3) 
     * �൱����һ�ֽ���˼·��ֻ�����ڲο���û��ʵ�ü�ֵ
     */
    public static int maxSubSum1(int[] a) {
        int maxSum = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                int tempSum = 0;

                for (int k = i; k <= j; k++) {
                    tempSum += a[k];
                }

                if (tempSum > maxSum) {
                    maxSum = tempSum;
                }

            }
        }
        return maxSum;
    }
    //2��O��n^2���ı������Ľ��㷨
    /**
     * ���˼·�����Կ�һ�۱�������˼·û���ͻᷢ�֣���kȥ��������ʵ��һ�����������
     * ���ԣ��ڴ˽����޸Ĵ��룬����һ��forѭ��
     * ʱ�临�Ӷȣ�O(n^2)
     * ����㷨�ȱ��������΢���˵����������ȻЧ����⣬û��ʵ�ü�ֵ
     */
    public static int maxSubSum2(int[] a) {
        int maxSum = 0;

        for (int i = 0; i < a.length; i++) {
            int tempSum = 0;

            for (int j = i; j < a.length; j++) {
                tempSum += a[j];

                if (tempSum > maxSum)
                    maxSum = tempSum;
            }
        }
        return maxSum;
    }
    //3��O(NlogN)�ķ��β����㷨
    /**
     * ����˼·����һ��������Ҫ�ҵ�������������кͣ������Ҫô��������벿�֣�Ҫô�������Ұ벿��
     *          Ҫô�����ں��������֮��
     * ʱ�临�Ӷ�:O(NlogN)
     * ����㷨����һ����ʵ�ü�ֵ����Ȼ��Ч���ϻ���ѷɫ�����Ը��Ӷȵ��㷨
     */

    public static int maxSubSum3(int[] a) {
        return subSum3(a, 0, a.length - 1);
    }

    private static int subSum3(int[] a, int left, int right) {
        if (left == right)
            if (a[left] > 0)
                return a[left];
            else
                return 0;

        int center = (left + right) / 2;
        int maxLeftSum = subSum3(a, left, center);
        int maxRightSum = subSum3(a, center + 1, right);

        int maxLeftBorderSum = 0, leftBorderSum = 0;
        for (int i = center; i >= left; i--) {
            leftBorderSum += a[i];
            if (leftBorderSum > maxLeftBorderSum)
                maxLeftBorderSum = leftBorderSum;
        }

        int maxRightBorderSum = 0, rightBorderSum = 0;
        for (int i = center + 1; i <= right; i++) {
            rightBorderSum += a[i];
            if (rightBorderSum > maxRightBorderSum)
                maxRightBorderSum = rightBorderSum;
        }

        return Math.max(Math.max(maxLeftSum, maxRightSum), maxLeftBorderSum + maxRightBorderSum);

    }
    //4��O(N)���Ż��㷨
    /**
     * ���˼·�����㷨һ���㷨���У�����һֱ����������������ʶ��������
     *  j����ǰ���е��ص㣬i����ǰ���е����
     *  �������ֻ�ǵ�������֪��������������еĺͣ�������֪��������������е������յ�Ļ�
     *  ��ô���i����ȫ���Ա��Ż�����
     * ʱ�临�Ӷȣ�O(N)
     * ����㷨�������Ǿ������õ��㷨֮һ���������ź�����û�취��ʶ������������е�λ��
     */
    public static int maxSubSum4(int[] a) {
        int maxSum = 0;
        int tempSum = 0;

        for (int i = 0; i < a.length; i++) {
            tempSum += a[i];

            if (tempSum > maxSum)
                maxSum = tempSum;
            else if (tempSum < 0)
                tempSum = 0;
        }
        return maxSum;
    }
    //5��O��N���Ķ�̬�滮�㷨
    /**
     * ���˼·����sum(j)��ʾa1��aj�ĺͣ������������̬�滮�ĵݹ�ʽ��
     *  sum(j) = max(sum(j-1)+aj , aj)
     * ʱ�临�Ӷȣ�O(N)
     * ��̬�滮�ĺô����ڣ��ܺ�����ķ���������������к͵���ʼλ�ú��յ�λ��
     *
     */
    public static int maxSubSum5(int[] a) {
        int maxSum = 0;
        int tempSum = 0;
//        int begin = 0;

        for (int i = 0; i < a.length; i++) {
            if (tempSum > 0)
                tempSum += a[i];
            else {
                tempSum = a[i];
//                begin = i;  //���
            }

            if (tempSum > maxSum) {
                maxSum = tempSum;
                //�����������ȡ������������к͵����λ��begin���ص�λ��i
            }

        }
        return maxSum;
    }
    

}
