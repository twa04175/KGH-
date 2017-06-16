package swing;

import javax.swing.JFrame;

class MyFrame01 extends JFrame {
	
	private static final long serialVersionUID = 1L;

	public MyFrame01(String name) {
		super(name);
		setSize(600,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class MyApp01 {

	public static void main(String[] args) {
		new MyFrame01("첫번째 프레임");
	}
}
