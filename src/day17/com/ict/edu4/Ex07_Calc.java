package day17.com.ict.edu4;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ex07_Calc extends JFrame{
	public Ex07_Calc() {
		super("회원가입");
		
		// 작은패널1번
		JPanel jp = new JPanel();
		jp.setLayout(new BoxLayout(jp, BoxLayout.X_AXIS));
		
		JLabel jl = new JLabel("이름 : ");
		JTextField text_f = new JTextField(10);
		
		
		JLabel jl1 = new JLabel("성별 : ");
		JRadioButton radio_b = new JRadioButton();
		JLabel jl2 = new JLabel("남 ");
		JRadioButton radio_b1 = new JRadioButton();
		JLabel jl3 = new JLabel("여");
		
		
		// 라디오 기능 버튼, 버튼그룹
		ButtonGroup bg = new ButtonGroup();
		bg.add(radio_b);
		bg.add(radio_b1);
		// 작은패널 2번
		JPanel jp1 = new JPanel();
		jp1.setLayout(new BoxLayout(jp1, BoxLayout.X_AXIS));
		
		JLabel jl4 = new JLabel("생년월일 : ");
		JTextField text_f1 = new JTextField(5);
		
		// 작은패널 3번
		JPanel jp2 = new JPanel();
		jp2.setLayout(new BoxLayout(jp2, BoxLayout.X_AXIS));
		
		JLabel jl5 = new JLabel("주  소 : ");
		JTextField text_f2 = new JTextField(15);
		
		
		
		// 중간패널 1번
		JPanel semiPanel = new JPanel(new BorderLayout());
		semiPanel.add(jp, BorderLayout.NORTH);
		semiPanel.add(jp1, BorderLayout.CENTER);
		semiPanel.add(jp2, BorderLayout.SOUTH);
		// 작은패널4번
		JPanel jp3 = new JPanel();
		jp3.setLayout(new BoxLayout(jp3, BoxLayout.X_AXIS));
		
		JLabel bu_name = new JLabel("부서명 : ");
		String[] items = {"부서", "기획", "디자인", "개발","보안"};
		JComboBox<String> jcom = new JComboBox<>(items);
		
		//========================
		// 작은패널 5번
		JPanel jp4 = new JPanel();
		jp4.setLayout(new BoxLayout(jp4, BoxLayout.X_AXIS));
		
		JLabel hobby = new JLabel("취 미 : ");
		JCheckBox check_b = new JCheckBox("운동");
		JCheckBox check_b1 = new JCheckBox("영화");
		JCheckBox check_b2 = new JCheckBox("독서");
		JCheckBox check_b3 = new JCheckBox("컴퓨터");
		
		
		
		// 중간패널 2번
		JPanel semiPanel1 = new JPanel(new BorderLayout());
		
		semiPanel1.add(jp3, BorderLayout.NORTH);
		semiPanel1.add(jp4, BorderLayout.CENTER);
		
		//======================
		// 작은패널 6번
		JPanel jp5 = new JPanel();
		jp5.setLayout(new BoxLayout(jp5, BoxLayout.X_AXIS));
		JLabel pre = new JLabel("자기소개");
		
		// 작은패널 7번(텍스트)
		JTextArea text_a = new JTextArea();
		text_a.setLayout(new BoxLayout(text_a, BoxLayout.X_AXIS));
		text_a.setLineWrap(true);  // 자동 줄바꾸기
		text_a.setColumns(80);
		text_a.setRows(19);
		
		// 작은패널 8번(저장,종료,취소)
		JPanel jp6 = new JPanel();
		JButton jb1 = new JButton("저 장");
		JButton jb2 = new JButton("종 료");
		JButton jb3 = new JButton("취 소");
		
		// 중간패널 3번
		JPanel semiPanel2 = new JPanel(new BorderLayout());
		semiPanel2.add(jp5, BorderLayout.NORTH);
		semiPanel2.add(text_a, BorderLayout.CENTER);
		semiPanel2.add(jp6, BorderLayout.SOUTH);
		
		//=======================
		jp.add(Box.createRigidArea(new Dimension(5, 0)));
		jp.add(jl);
		
		// 왼쪽으로 공간을 띄우기위해
		jp.add(Box.createRigidArea(new Dimension(5, 0)));
		jp.add(text_f);
		jp.add(Box.createRigidArea(new Dimension(10, 0)));
		jp.add(jl1);
		jp.add(radio_b);
		jp.add(jl2);
		jp.add(radio_b1);
		jp.add(jl3);
		jp.add(Box.createRigidArea(new Dimension(190, 0)));
		jp1.add(Box.createRigidArea(new Dimension(5, 0)));
		jp1.add(jl4);
		jp1.add(text_f1);
		jp1.add(Box.createRigidArea(new Dimension(280, 0)));
		jp2.add(Box.createRigidArea(new Dimension(5, 0)));
		jp2.add(jl5);
		jp2.add(text_f2);
		jp2.add(Box.createRigidArea(new Dimension(230, 0)));
		//===================
		jp3.add(Box.createRigidArea(new Dimension(5, 0)));
		jp3.add(bu_name);
		jp3.add(jcom);
		jp3.add(Box.createRigidArea(new Dimension(380, 0)));
		jp4.add(Box.createRigidArea(new Dimension(5, 0)));
		jp4.add(hobby);
		jp4.add(Box.createRigidArea(new Dimension(5, 0)));
		jp4.add(check_b);
		jp4.add(Box.createRigidArea(new Dimension(5, 0)));
		jp4.add(check_b1);
		jp4.add(Box.createRigidArea(new Dimension(5, 0)));
		jp4.add(check_b2);
		jp4.add(Box.createRigidArea(new Dimension(5, 0)));
		jp4.add(check_b3);
		//=====================
		jp5.add(Box.createRigidArea(new Dimension(5, 0)));
		jp5.add(pre);
		jp6.add(jb1);
		jp6.add(jb2);
		jp6.add(jb3);
		
		
		// 모든 중간패널 위,가운데,아래로 나누기
		add(semiPanel,BorderLayout.NORTH);
		add(semiPanel1,BorderLayout.CENTER);
		add(semiPanel2, BorderLayout.SOUTH);
		
	
        
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2 - 250, ds.height/2 - 250, 500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new Ex07_Calc();
	}
}
