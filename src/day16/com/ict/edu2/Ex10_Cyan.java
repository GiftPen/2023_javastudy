package day16.com.ict.edu2;

import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Ex10_Cyan extends JPanel{
	public Ex10_Cyan() {
		setBackground(Color.CYAN);
		
		JRadioButton jb1 = new JRadioButton("+");
		JRadioButton jb2 = new JRadioButton("-");
		JRadioButton jb3 = new JRadioButton("*");
		JRadioButton jb4 = new JRadioButton("/");
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(jb1);
		bg.add(jb2);
		bg.add(jb3);
		bg.add(jb4);
		
		
		add(jb1);
		add(jb2);
		add(jb3);
		add(jb4);
		
	}
}
