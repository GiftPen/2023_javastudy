package day17.com.ict.edu4;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex03_Calc extends JFrame{
	public Ex03_Calc() {
		super("계산기");
		
		JPanel np = new JPanel();
		// 라벨 3개  텍스트 필드 3개
		
		JLabel jl1 = new JLabel("수1 : ");
		JTextField jtf1 = new JTextField(5);
		
		JLabel jl2 = new JLabel("수2 : ");
		JTextField jtf2 = new JTextField(5);
		
		JLabel jl3 = new JLabel("연산자 : ");
		String[] items = {"선택하세요","+","-","*","/"};
		JComboBox<String> jcom = new JComboBox<>(items);
		//JTextField jtf3 = new JTextField(5);
		
		np.add(jl1);
		np.add(jtf1);
		np.add(jl2);
		np.add(jtf2);
		np.add(jl3);
		np.add(jcom);
		
		// 2번쨰 텍스트 에어리얼
		JTextArea jta = new JTextArea();
		jta.setLineWrap(true);  // 자동 줄바꾸기
		JScrollPane jsp = new JScrollPane(jta,  // 스크롤
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER
				);
		// 편집 불가능으로 만들기
		jta.setEditable(false);
		
		// 3번쨰
		JPanel sp = new JPanel();
		JButton jb1 = new JButton("계 산");
		JButton jb2 = new JButton("종 료");
		JButton jb3 = new JButton("취 소");
		sp.add(jb1);
		sp.add(jb2);
		sp.add(jb3);
		
		
		
		
		add(np,BorderLayout.NORTH);  // 프레임에 붙이기
		add(jsp,BorderLayout.CENTER);
		add(sp,BorderLayout.SOUTH);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2 - 250, ds.height/2 - 250, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex03_Calc();
	}
}
