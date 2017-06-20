package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class ContentPaneEx extends JFrame {
	
	static int a = 0;
	static int sum = 0;
	boolean num = true;
	static JTextArea ta = new JTextArea(2,20);

	private static final long serialVersionUID = 1L;

	ContentPaneEx() {
		setTitle("ContentPane 과 JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn = new JButton("1");
		JButton btn1 = new JButton("2");
		JButton btn2 = new JButton("3");
		JButton btn3 = new JButton("4");
		JButton btn4 = new JButton("5");
		JButton btn5 = new JButton("6");
		JButton btn6 = new JButton("7");
		JButton btn7 = new JButton("8");
		JButton btn8 = new JButton("9");
		JButton btn9 = new JButton("0");
	
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT,30,20));
		
		btn.addActionListener(e->{
			onClick(1);
		});
		
		btn1.addActionListener(e->{
			onClick(2);
		});
		
		btn2.addActionListener(e->{
			onClick(3);
		});
		
		btn3.addActionListener(e->{
			onClick(4);
		});
		
		btn4.addActionListener(e->{
			onClick(5);
		});
		
		btn5.addActionListener(e->{
			onClick(6);
		});
		
		btn6.addActionListener(e->{
			onClick(7);
		});
		
		btn7.addActionListener(e->{
			onClick(8);
		});
		
		btn8.addActionListener(e->{
			onClick(9);
		});
		
		btn9.addActionListener(e->{
			onClick(0);
		});
		
		JButton op = new JButton("+");
		JButton op1 = new JButton("=");
		ta.setFont(new Font("고딕", 30, 30));
		
		op.addActionListener(e->{
			sum+=a;
			a=0;
		});
		
//		op.addActionListener(new ActionListener(){
//
//			@Override
//			public void actionPerformed(ActionEvent arg0) {
//				// TODO Auto-generated method stub
//			}
//			
//		});
//		
//		ActionListener a = new ActionListener(){
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//		};
//		
		op1.addActionListener(e->{
			sum+=a;
			ta.setText("숫자들의 합은 "+sum+"입니다.");
			a = 0;
			sum = 0;
		});
		
		contentPane.add(btn);
		contentPane.add(btn1);
		contentPane.add(btn2);
		contentPane.add(btn3);
		contentPane.add(btn4);
		contentPane.add(btn5);
		contentPane.add(btn6);
		contentPane.add(btn7);
		contentPane.add(btn8);
		contentPane.add(btn9);

		contentPane.add(op);
		contentPane.add(op1);
		contentPane.add(ta);
		
		setSize(600,300);
		setVisible(true);
	}
	
	public static void onClick(int n){
		a=a*10+n;
		ta.setText(""+a);
	}
	
	public static void main(String[] args) {
		new ContentPaneEx();
	}
	
}
