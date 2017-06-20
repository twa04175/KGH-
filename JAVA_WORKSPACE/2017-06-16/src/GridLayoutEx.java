import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GridLayoutEx extends JFrame {
	
	private static final long serialVersionUID = 1L;

	GridLayoutEx() {
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		GridLayout grid = new GridLayout(5,2,5,5);
		
		grid.setVgap(5);
		c.setLayout(grid);
		c.add(new JLabel("�̸�"));
		c.add(new JTextField(""));
		c.add(new JLabel("�й�"));
		c.add(new JTextField(""));
		c.add(new JLabel("�а�"));
		c.add(new JTextField(""));
		c.add(new JLabel("����"));
		c.add(new JTextField(""));
		
		JButton btn1 = new JButton("����");
		btn1.addActionListener(e->{
			//�ҷ��ͼ� �ʱ�ȭ
		});
		JButton btn2 = new JButton("���");
		btn2.addActionListener(e->{
			//�����ڵ�
		});

		c.add(btn1);
		c.add(btn2);
		
		setSize(250,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new GridLayoutEx();
	}

}