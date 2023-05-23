package day16.com.ict.edu2;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class Ex10_Green extends JPanel{
	public Ex10_Green() {
		setBackground(Color.GREEN);
		
		JCheckBox jb1 = new JCheckBox("+");
		JCheckBox jb2 = new JCheckBox("-");
		JCheckBox jb3 = new JCheckBox("*");
		JCheckBox jb4 = new JCheckBox("/");
		
		add(jb1);
		add(jb2);
		add(jb3);
		add(jb4);
	
	}

}
