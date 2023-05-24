package day21.com.ict.edu;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class Ex02_Login extends JPanel{
// 메인에서 만든 카드레이아웃을 받아와야한다(아래처럼 하거나 메인자체를 가져오자)
	// main에 있는 cardlayout과 ,pg1을 이용하기 위해서 정보를 받아야한다.
	// 새로만들면 다른 객체 임으로 정보 교류를 할 수 가 없다.
	
	CardLayout cardLayout;
	JPanel pg1;
	
	////
	
	JButton jb1, jb2 ;
	
	public Ex02_Login(CardLayout cardLayout, JPanel pg1) {
		// 생성자에서 받은 정보(인자)는 무조건 전역 변수로 만들어라.
		this.cardLayout = cardLayout ;
		this.pg1 = pg1 ;
		
		jb1 = new JButton("회원가입");
		jb2 = new JButton("로그인");
		
		add(jb1);
		add(jb2);
		
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(pg1, "join");
			}
		});
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(pg1, "loginok");
			}
		});
		
		
	}
}
