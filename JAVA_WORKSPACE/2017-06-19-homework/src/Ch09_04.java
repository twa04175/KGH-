import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ch09_04 extends JFrame {
	
	private static final long serialVersionUID = 1L;

	Ch09_04(){
		setTitle("Ten Color Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(1,10));
		JButton[] jbtn = new JButton[10];
		
		Color[] c = new Color[]{Color.RED,Color.ORANGE,Color.YELLOW,Color.GREEN,Color.CYAN,Color.BLUE,
				Color.MAGENTA,Color.DARK_GRAY,Color.PINK,Color.LIGHT_GRAY};
		
		for(int i = 0; i<10; i++) {
			jbtn[i] = new JButton(""+i);
			jbtn[i].setBackground(c[i]);
			add(jbtn[i]);
		}
		
		setSize(600,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ch09_04();
	}
}
