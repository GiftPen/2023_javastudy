package day17.com.ict.edu4;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

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
import javax.swing.ScrollPaneConstants;

public class Ex08_Clac extends JFrame{
	public Ex08_Clac() {
		super("회원가입");
		
		JTextField jtf1 = new JTextField(10); 
		JTextField jtf2 = new JTextField(10); 
		JTextField jtf3 = new JTextField(20); 
		
		// 첫번째 패널
		JPanel ap = new JPanel();
		ap.setLayout(new FlowLayout(FlowLayout.LEFT)); // 왼쪽 정렬
		ap.add(new JLabel("이름 : "));
		ap.add(jtf1);
		
		ap.add(new JLabel("성별 : "));
		JRadioButton man = new JRadioButton("남");
		ap.add(man);
		JRadioButton woman = new JRadioButton("여");
		ap.add(woman);
		// ButtonGroup
		ButtonGroup bg = new ButtonGroup();
		bg.add(man);
		bg.add(woman);
		
		// 두번째 패널
		JPanel bp = new JPanel();
		bp.setLayout(new FlowLayout(FlowLayout.LEFT));
		bp.add(new JLabel("생년월일 : "));
		bp.add(jtf2);
		
		// 세번째 패널
		JPanel cp = new JPanel();
		cp.setLayout(new FlowLayout(FlowLayout.LEFT));
		cp.add(new JLabel("주소 : "));
		cp.add(jtf3);
		
		// 네번쨰 패널
		JPanel dp = new JPanel();
		dp.setLayout(new FlowLayout(FlowLayout.LEFT));
		dp.add(new JLabel("부서명"));
		String[] depart = {"부서", "기획", "디자인", "개발","보안"};
		JComboBox<String> jcom = new JComboBox<>(depart);
		dp.add(jcom);
		
		// 다섯번째 패널
		JPanel ep = new JPanel();
		ep.setLayout(new FlowLayout(FlowLayout.LEFT));
		ep.add(new JLabel("취미 : "));
		JCheckBox exercise = new JCheckBox("운동");
		JCheckBox movie = new JCheckBox("영화");
		JCheckBox book = new JCheckBox("독서");
		JCheckBox com = new JCheckBox("컴퓨터");
		ep.add(exercise);
		ep.add(movie);
		ep.add(book);
		ep.add(com);
		
		JPanel mainPanel_01 = new JPanel(new BorderLayout());
		mainPanel_01.add(ap, BorderLayout.NORTH);
		mainPanel_01.add(bp, BorderLayout.CENTER);
		mainPanel_01.add(cp, BorderLayout.SOUTH);
		
		JPanel mainPanel_02 = new JPanel(new BorderLayout());
		mainPanel_02.add(dp, BorderLayout.NORTH);
		mainPanel_02.add(ep, BorderLayout.CENTER);
		
		// 자기소개
		JPanel intro = new JPanel();
		intro.setLayout(new FlowLayout(FlowLayout.LEFT));
		intro.add(new JLabel("자기소개"));
		
		JTextArea jta = new JTextArea(20,10);
		jta.setLineWrap(true); // 자동 줄바꾸기
		JScrollPane jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		//편집 불가능하게 만들자
		jta.setEditable(true);
		
		JPanel sp = new JPanel();
		JButton jb1 = new JButton("저 장");
		JButton jb2 = new JButton("종 료");
		JButton jb3 = new JButton("취 소");
		
		sp.add(jb1);
		sp.add(jb2);
		sp.add(jb3);
		
		JPanel mainPanel_03 = new JPanel(new BorderLayout());
		mainPanel_03.add(intro, BorderLayout.NORTH);
		mainPanel_03.add(jta, BorderLayout.CENTER);
		mainPanel_03.add(sp, BorderLayout.SOUTH);
		
		add(mainPanel_01,BorderLayout.NORTH);
		add(mainPanel_02,BorderLayout.CENTER);
		add(mainPanel_03,BorderLayout.SOUTH);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250, ds.height/2-300, 500, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	
	public static void main(String[] args) {
		new Ex08_Clac();
	}
}