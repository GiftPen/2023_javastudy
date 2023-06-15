package network.com.ict.edu6.copy;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class ChatClient_kakao2 extends JPanel{
	
	JScrollPane jsp;
	private JTextField textField_1;
	CardLayout cardLayout;
	JPanel pg1;
	public ChatClient_kakao2(CardLayout cardLayout, JPanel pg1) {
		JPanel panel2 = new JPanel();
		panel2.setSize(440,600);
		panel2.setLayout(null);
		
		JTextArea jta = new JTextArea();
		jta.setBounds(12, 10, 360, 501);
		jta.setLineWrap(true);
		jta.setEditable(false);
		jta.setFont(new Font("Sandoll 삼립호빵체 TTF Basic",	Font.PLAIN , 20));
		jta.setBackground(new Color(255,240,245));
		jta.setForeground(new Color(65,105,225));
		jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel2.add(jta);
		
		textField_1 = new JTextField();
		textField_1.setBounds(12, 521, 273, 30);
		panel2.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("보내기\r\n");
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setBackground(new Color(65, 105, 225));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(293, 521, 79, 30);
		panel2.add(btnNewButton_2);
		
		add(panel2);
	}
}
