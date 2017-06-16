package game;

import java.util.Random;

import javafx.animation.PathTransition;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Path;

public class AttackThread extends Thread {
	
	private AnchorPane root;
	private Attackball[] c ;// �� 10���� �����.
	
	public AttackThread(AnchorPane root,Attackball[] atb) {
		this.root = root;
		this.c = atb;
	}
	
	@Override
	public void run() {
		//�ڵ����� �����̴� �����ϸ� �ʱ�ȭ�Ǵ� ��ü
		Random rand = new Random();
		Animation ani = new Animation();
	
		for(int i = 0; i<c.length; i++) {
			c[i] = new Attackball();
//			lay.setLayoutXY(c[i], rand.nextDouble()+rand.nextInt(1000), rand.nextDouble()+rand.nextInt(700));
			c[i].setRadius(10);
			root.getChildren().add(c[i]);
		}
		
		//2���� �迭�� 100�� ��������  == ���̰� 100�� 3���� �迭
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
		//���⼭ �ִϸ��̼��� �������� x,y���� ��ȭ�� �ְ� ���꾲���忡�� ���߾� ��ȭ�Ѵ� ��?
		Path[] patharr = new Path[c.length];
		
		for(int i = 0; i<pathbase.length; i++) {
			patharr[i] = ani.returnPath(pathbase[i]);
			PathTransition tran = ani.getAnimation(100000,3, 1,true,patharr[i], c[i]);
			tran.play();
		}
	}
}
