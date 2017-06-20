import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ch09_05 extends JFrame {
	
	private static final long serialVersionUID = 1L;

	Ch09_05(){
		setTitle("4x4 Color Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Color[] c = new Color[]{Color.RED,Color.ORANGE,Color.YELLOW,Color.GREEN,Color.CYAN,Color.BLUE,
				Color.MAGENTA,Color.DARK_GRAY,Color.PINK,Color.LIGHT_GRAY};
		
		setLayout(new GridLayout(3,4));
		
		JLabel[]  jlb = new JLabel[12];
		for(int i = 0; i<12; i++) {
			jlb[i] = new JLabel(""+i);
			jlb[i].setBackground(c[(int)(Math.random()*10)]);
			jlb[i].setSize(150, 75);
			jlb[i].setOpaque(true);
			add(jlb[i]);
		}
		
		setSize(600,300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Ch09_05();
	}
}