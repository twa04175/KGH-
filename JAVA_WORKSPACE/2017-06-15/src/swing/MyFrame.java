package swing;

import java.awt.Color;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;

	MyFrame() {
		setTitle("ù��° ������");
		setSize(600,300);
		setVisible(true);
		getContentPane().setBackground(Color.DARK_GRAY);
	}
	
	
	public static void main(String[] args) {
		new MyFrame();
	}

}
