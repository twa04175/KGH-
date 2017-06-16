package oracleDB;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application{
	
	public void start (Stage primarystage) {// ����Ŭ ������ ���̽����� & ���� �α� ����ȭ
		
		AnchorPane root = new AnchorPane();
		root.setPrefHeight(700);
		root.setPrefWidth(1000);
		
		String query = null; // �������� ������ ��Ʈ�� 
		DBConnect jdbc = new DBConnect();// ���⼭ ��񿬰���
		
		jdbc.startquery(query);
		
		TextArea ta = new TextArea();// �������� �Է��� ����
		
		
		root.getChildren().add(ta);
		
		Scene scene = new Scene(root);
		
		primarystage.setTitle("������ ���̽�");
		primarystage.setScene(scene);
		primarystage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
