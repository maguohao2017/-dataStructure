package mgh.����ר��;
/**
 * @author maguohao
 * @version ����ʱ�䣺2018��9��11�� ����10:00:06
 * ��˵��:
 * ����java���ú�������String�ַ���ת��Ϊdouble
 * �������ͣ�double ������λ����64
 * ��װ�ࣺjava.lang.Double
 * ��Сֵ��Double.MIN_VALUE=4.9E-324 ��2��-1074�η���
 * ���ֵ��Double.MAX_VALUE=1.7976931348623157E308 ��2��1024�η�-1��
 */
public class test6 {




	public static void main(String[] args) throws Exception {
		double ss = StringtoDouble("-12345678.0");
		System.out.println(ss);
	}

	/**

	 * before  : С����ǰ�����ֵ
	 * after = : С����������ֵ
	 * afterE :    ָ��E�������ֵ

	 * flag ����ʶ�Ƿ����0

	 * eflag ����ʶe��ָ���Ƿ����0

	 * beforePointFlag ����ʶ�Ƿ���С����ǰ�棬�˴���byte�Ǻ���Ҫ�������ۼӼ��㣬���С����ʱ����0.0

	 * beforeEflag ����ʶ�Ƿ���Eǰ�棬�˴���byte�Ǻ���Ҫ�������ۼӼ��㣬���Eʱ����0.0

	 * �㷨����˼�룺��һ��char������������string��Ȼ�������������char��

	 * ���ȣ������ʼ���������ŵĻ����������ű���

	 * Ȼ��֣�      0-9֮����ַ� ���ַ���ASII��-48�õ���Ӧ�����֣�Ȼ�����������ʶλ��С����ǰ/��Eǰ/����ȡ�ö�Ӧ����ֵ��

	 *                       �����С����Ļ�����һ�γ�����ȷ��ʶ������һ��ʱ���ǺϷ����ִ�������0.0

	 *                         �����E/e: ��һ����ȷ��ʶ��ʾλ��  ������һ���ǣ�����0.0��

	 *                        �ٴγ��������ţ�����һ��ʱ����E�����ָ��������һ��������0.0��

	 *                          �������һ�ɷ���0.0
	 */
	public static double StringtoDouble(String str)throws Exception {
		if(str == null || "".equals(str)) {
			throw new Exception("Ҫת�����ַ���Ϊ�գ��޷�ת����");
		}

		double before = 0.0, after = 0.0;

		int afterE = 0;//ָ��E�������ֵ
		double index = 1.0;//��ʶϵ��
		boolean flag = true;//��ʶ�Ƿ����0
		boolean eflag = true;//��ʶe��ָ���Ƿ����0   
		byte beforePointFlag = 0;//��ʶ�Ƿ���С����ǰ�棬�˴���byte�Ǻ���Ҫ�������ۼӼ��㣬���С����ʱ����0.0
		byte beforeEflag = 0;//��ʶ�Ƿ���Eǰ�棬�˴���byte�Ǻ���Ҫ�������ۼӼ��㣬���Eʱ����0.0

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
