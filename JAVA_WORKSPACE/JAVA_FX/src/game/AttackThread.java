package game;

import java.util.Random;

import javafx.animation.PathTransition;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Path;

public class AttackThread extends Thread {
	
	private AnchorPane root;
	private Attackball[] c ;// 원 10개를 만든다.
	
	public AttackThread(AnchorPane root,Attackball[] atb) {
		this.root = root;
		this.c = atb;
	}
	
	@Override
	public void run() {
		//자동으로 움직이는 근접하면 초기화되는 물체
		Random rand = new Random();
		Animation ani = new Animation();
	
		for(int i = 0; i<c.length; i++) {
			c[i] = new Attackball();
//			lay.setLayoutXY(c[i], rand.nextDouble()+rand.nextInt(1000), rand.nextDouble()+rand.nextInt(700));
			c[i].setRadius(10);
			root.getChildren().add(c[i]);
		}
		
		//2차원 배열을 100개 랜덤생성  == 높이가 100인 3차원 배열
		double[][][] pathbase = new double[c.length][100][2];
		for(int i = 0; i<pathbase.length; i++) {
			for(int j = 0; j<pathbase[i].length; j++) {
				for(int k = 0; k<pathbase[i][j].length; k++) {
					if(k == 0) {
						pathbase[i][j][k] = rand.nextDouble()+rand.nextInt(1000);
					} else if(k == 1) {
						pathbase[i][j][k] = rand.nextDouble()+rand.nextInt(700);
					}
				}
			}
		}
		//여기서 애니매이션을 쓰지말고 x,y값의 변화를 주고 무브쓰레드에서 맞추어 변화한다 ㅇ?
		Path[] patharr = new Path[c.length];
		
		for(int i = 0; i<pathbase.length; i++) {
			patharr[i] = ani.returnPath(pathbase[i]);
			PathTransition tran = ani.getAnimation(100000,3, 1,true,patharr[i], c[i]);
			tran.play();
		}
	}
}
