package day21.com.ict.edu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ex02_Login_ok extends JPanel {
	Ex02_Main main;
	JButton jb;

	// main에 있는 cardlayout과 ,pg1을 이용하기 위해서 정보를 받아야한다.
	// 새로만들면 다른 객체 임으로 정보 교류를 할 수 가 없다.
	// 단, 전달 정보가 많으면 클래스(객체)자체를 받자.
	public Ex02_Login_ok(Ex02_Main main) {
		this.main = main;

		jb = new JButton("뒤로가기");

		add(new JLabel("로그인 성공 창입니다."));
		add(jb);
		
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				main.cardLayout.show(main.pg1, "login");
			}
		});
	}
}
