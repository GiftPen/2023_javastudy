package day16.com.ict.edu2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;

public class Ex09_JTab extends JFrame{
	public Ex09_JTab() {
		super("JTab");
		
		// xxxPane = 컨테이너 = 다른 컨테이너를 가질 수 있고, 컴포넌트도 가질 수 있다.
		JTabbedPane jtab = new JTabbedPane();
		
		JPanel jp1 = new JPanel();
		// 배경색
		jp1.setBackground(Color.BLUE);
		JButton jb1 = new JButton("+");
		JButton jb2 = new JButton("-");
		JButton jb3 = new JButton("*");
		JButton jb4 = new JButton("/");
		
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		jp1.add(jb4);
		
		jtab.addTab("블루 탭", jp1);
		
		// 라디오버튼
		
		JPanel jp2 = new JPanel();
		jp2.setBackground(Color.CYAN);
		
		JRadioButton jrb1 = new JRadioButton("+");
		JRadioButton jrb2 = new JRadioButton("-");
		JRadioButton jrb3 = new JRadioButton("*");
		JRadioButton jrb4 = new JRadioButton("/");
		
		
		// 버튼에 색 넣어보기
//		jrb1.setBackground(Color.CYAN);
//		jrb2.setBackground(Color.CYAN);
//		jrb3.setBackground(Color.CYAN);
//		jrb4.setBackground(Color.CYAN);
		
		
		// 기능적 역할을 하는것
		ButtonGroup bg = new ButtonGroup() ;
		bg.add(jrb1);
		bg.add(jrb2);
		bg.add(jrb3);
		bg.add(jrb4);
		
		// 화면에 붙여지는 것
		jp2.add(jrb1);
		jp2.add(jrb2);
		jp2.add(jrb3);
		jp2.add(jrb4);
		
		jtab.addTab("시안 탭", jp2);
		
		// 체크박스
		
		JPanel jp3 = new JPanel();
		jp3.setBackground(Color.GREEN);
		
		JCheckBox jcb1 = new JCheckBox("+");
		JCheckBox jcb2 = new JCheckBox("-");
		JCheckBox jcb3 = new JCheckBox("*");
		JCheckBox jcb4 = new JCheckBox("/");
		
		jp3.add(jcb1);
		jp3.add(jcb2);
		jp3.add(jcb3);
		jp3.add(jcb4);
		
		jtab.addTab("그린 탭", jp3);
		
		
		add(jtab);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2 - 150, ds.height/2 - 250, 500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	public static void main(String[] args) {
		new Ex09_JTab();
	}
}
