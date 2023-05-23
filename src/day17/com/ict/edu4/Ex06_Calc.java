package day17.com.ict.edu4;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Label;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex06_Calc extends JFrame{
	public Ex06_Calc() {
		super("카페 주문");
		
		JPanel np = new JPanel();
		
		JLabel jl1 = new JLabel("원하는 음료를 선택하세요");
		
		JPanel np1 = new JPanel();
		JRadioButton jl2 = new JRadioButton("아메리카노(3000)");
		JRadioButton jl3 = new JRadioButton("카페모카(4000)");
		JRadioButton jl4 = new JRadioButton("카페라떼(3500)");
		JRadioButton jl5 = new JRadioButton("과일쥬스(3000)");
		
		JPanel np2 = new JPanel();
		JLabel jl6 = new JLabel("수량");
		JTextField jT6 = new JTextField(10);
		JLabel jl7 = new JLabel("입금액");
		JTextField jT7 = new JTextField(10);
		
		JPanel mainPanel = new JPanel(new BorderLayout());
		mainPanel.add(np, BorderLayout.NORTH);
		mainPanel.add(np1, BorderLayout.CENTER);
		mainPanel.add(np2, BorderLayout.SOUTH);
		
		// 라디오 버튼은 버튼구룹 반드시
		ButtonGroup bg = new ButtonGroup();
		bg.add(jl2);
		bg.add(jl3);
		bg.add(jl4);
		bg.add(jl5);
		
		np.add(jl1);
		np1.add(jl2);
		np1.add(jl3);		
		np1.add(jl4);		
		np1.add(jl5);		
		np2.add(jl6);		
		np2.add(jT6);		
		np2.add(jl7);		
		np2.add(jT7);		
		
		// 2번쨰 텍스트 에어리얼
		JTextArea jta = new JTextArea();
		jta.setLineWrap(true);  // 자동 줄바꾸기
		
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
		
		
		
		
		add(mainPanel,BorderLayout.NORTH);  // 프레임에 붙이기
		add(jta,BorderLayout.CENTER);
		add(sp,BorderLayout.SOUTH);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2 - 250, ds.height/2 - 250, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex06_Calc();
	}
}
