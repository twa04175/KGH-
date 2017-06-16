package game;

import java.util.Arrays;
import java.util.stream.Stream;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Start extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		FinishDTO isPlay = new FinishDTO(); //게임이 진행중인지판별
		KeyDTO key = new KeyDTO();
		
		StackPane st = new StackPane();
		AnchorPane root = new AnchorPane();
		
		st.getChildren().add(root);
		
		root.setPrefWidth(1000);
		root.setPrefHeight(700);
		
		Layout lay = new Layout();
		
	    EventHandler<KeyEvent> ev = new Ev(key);
	    EventHandler<KeyEvent> ev1 = new Ev1(key);    
	    EventHandler<KeyEvent> ev2 = new Ev2(key);
	     
	    primaryStage.addEventHandler(KeyEvent.KEY_PRESSED, ev);
	    primaryStage.addEventHandler(KeyEvent.KEY_RELEASED, ev1);
	    primaryStage.addEventHandler(KeyEvent.KEY_TYPED, ev2);
	    
	    Player ball = new Player();
	    ball.setFill(Color.CADETBLUE);
	    ball.setRadius(30);
	  
		lay.<Circle>setLayoutXY(ball, key.getX(), key.getY());
	
		key.img = ball;
		
		Text time = new Text("yy:mm:dd");
		lay.setLayoutXY(time,900,20);
		time.setFont(new Font(20));
		
		root.getChildren().add(time);
		root.getChildren().add(ball);
		
		MoveThread mt = new MoveThread(key);
		mt.start(); // 플레이어 움직이는 쓰레드
		
		Attackball[] atb = new Attackball[100];
		
		TimeDTO tdto = new TimeDTO();
		
		Thread[] threads = new Thread[]{
				new AttackThread(root,atb),
				new TimeThread(time,isPlay,tdto),
				new ImpactThread(ball,atb, isPlay),
				new FinishThread(isPlay,st,root,tdto)
		};
		
		Stream<Thread> thstream = Arrays.stream(threads);
		thstream.forEach(e->{
			e.setDaemon(true);
			e.start();
		});

		Scene scene = new Scene(st);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("공 피하기");
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
