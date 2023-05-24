package day21.com.ict.edu;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import day21.com.ict.edu.Ex02_Main;

public class Ex02_Join extends JPanel{
	
	Ex02_Main main ;
	JButton jb ;
	// main에 있는 cardlayout과 ,pg1을 이용하기 위해서 정보를 받아야한다.
	// 새로만들면 다른 객체 임으로 정보 교류를 할 수 가 없다.
	// 단, 전달 정보가 많으면 클래스(객체)자체를 받자.
	public Ex02_Join(Ex02_Main main) {
		this.main = main ;
		
		jb = new JButton("뒤로가기");
		
		add(new JLabel("회원가입 창입니다."));
		add(jb);
		
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// main으로 가져왔으니 main. 으로 사용
				main.cardLayout.show(main.pg1, "login");
			}
		});
	}
}
