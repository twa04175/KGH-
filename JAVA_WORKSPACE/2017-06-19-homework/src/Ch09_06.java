import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ch09_06 extends JFrame {
	
	private static final long serialVersionUID = 1L;

	Ch09_06(){
		setTitle("Random Labels");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(null);
		
		JLabel[]  jlb = new JLabel[12];
		for(int i = 0; i<12; i++) {
			jlb[i] = new JLabel();
			jlb[i].setBackground(Color.BLUE);
			jlb[i].setLocation((int)(Math.random()*200)+50,(int)(Math.random()*200)+50);
			jlb[i].setSize(10, 10);
			jlb[i].setOpaque(true);
			add(jlb[i]);
		}
		
		setSize(300,300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Ch09_06();
	}
}