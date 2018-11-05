package mgh.变幻多姿的图表.Ch1_3;

import java.applet.Applet;
import java.awt.*;

/**
 * 余弦曲线
 * @author dell
 *
 */

public class Ch1_3 extends Applet{
	
	int x,y;
	public void start() {
		
		//画画之前先取得画笔
		Graphics g=getGraphics();
		//画x轴、y轴
		for(x=0;x<=750;x+=1) {
			g.drawString(".", x, 200);
			if(x<=385) g.drawString(".",360,x);
		}
		g.drawString("Y", 330, 20);
		//画y轴箭头
		for(x=360;x<=370;x+=1) {
			g.drawString(".", x-10, 375-x);
			g.drawString(".", x, x-355);
		}
		//画x轴箭头
		g.drawString("X", 735, 230);
		for(x=740;x<=750;x+=1) {
			g.drawString(".", x, x-550);
			g.drawString(".", x, 950-x);
		}
		//画cos()曲线
		for(x=0;x<=720;x+=1) {
			double a = Math.cos(x*Math.PI/180+Math.PI);
			y=(int)(200+80*a);
			g.drawString(".",x,y);
		}
	}

//	public static void main(String[] args) {
//		
//		
//	}

		

}

