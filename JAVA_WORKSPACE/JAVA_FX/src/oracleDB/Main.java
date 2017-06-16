package oracleDB;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application{
	
	public void start (Stage primarystage) {// 오라클 데이터 베이스조작 & 조작 로그 파일화
		
		AnchorPane root = new AnchorPane();
		root.setPrefHeight(700);
		root.setPrefWidth(1000);
		
		String query = null; // 쿼리문을 저장할 스트링 
		DBConnect jdbc = new DBConnect();// 여기서 디비연결함
		
		jdbc.startquery(query);
		
		TextArea ta = new TextArea();// 쿼리문을 입력할 공간
		
		
		root.getChildren().add(ta);
		
		Scene scene = new Scene(root);
		
		primarystage.setTitle("데이터 베이스");
		primarystage.setScene(scene);
		primarystage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
