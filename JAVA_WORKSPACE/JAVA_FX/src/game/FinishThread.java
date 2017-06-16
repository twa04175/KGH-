package game;

import javafx.application.Platform;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class FinishThread extends Thread{

	private FinishDTO isPlay;
	private StackPane st;
	private AnchorPane root;
	private TimeDTO t;
	
	public FinishThread(FinishDTO isPlay, StackPane st, AnchorPane root, TimeDTO time) {
		this.isPlay = isPlay;
		this.st = st;
		this.root = root;
		this.t = time;
	}
	
	@Override
	public void run() {
		while(true) {
			
			if(!isPlay.isPlay()) {//플레이종료되면 실행
				//게임오버 출력하면서 시간 표시
				System.out.println("실행됨 ㅇㅇ");
				
				AnchorPane ap = new AnchorPane();
				
				ap.setPrefHeight(700);
				ap.setPrefWidth(1000);
				
				Layout lay = new Layout();
				
				Text tx = new Text("GAME OVER");
				
				tx.setFont(new Font(100));
				tx.setFill(Color.DARKCYAN);
				lay.setLayoutXY(tx, 230, 300);
				
				ap.getChildren().add(tx);
				
				Text time = new Text();
				time.setText(String.format("%02d:%02d:%02d",t.getHour(),t.getMin(),t.getSec()));
				time.setFill(Color.BLUE);
				time.setFont(new Font(30));
				
				lay.setLayoutXY(time, 450, 400);
				
				ap.getChildren().add(time);
				
				Text re = new Text("click to restart");
				lay.setLayoutXY(re, 415, 500);
				re.setFont(new Font(30));
				
				ap.getChildren().add(re);
				
				Platform.runLater(()->{
					st.getChildren().add(ap);
//					st.getChildren().remove(root);
					//루트의 투명도를 낮춰주자
					root.setOpacity(0.1);
				});
				break;
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
