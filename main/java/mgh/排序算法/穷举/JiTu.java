package mgh.�����㷨.���;
/**
* @author maguohao
* @version ����ʱ�䣺2018��9��5�� ����11:33:04
* ��˵��:
* ����ͬ������㷨  ������һ��50��ͷ��120ֻ��
*/
public class JiTu {

	public static void main(String[] args) {
		
		//����xֻ��
		for(int x=0;x<=50;x++) {
			//������������
			int y = 50 - x;
			if(x*2 + y*4 == 120) {
				System.out.println("��=" + x + "ֻ����=" + y + "ֻ");
			}
		}

	}

}
