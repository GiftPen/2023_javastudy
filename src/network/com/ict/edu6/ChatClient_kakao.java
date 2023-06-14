package network.com.ict.edu6;

import java.awt.EventQueue;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChatClient_kakao {

	private JFrame frame;
	private JTextField textField;
	CardLayout cardlayout	;
	JScrollPane jsp;
	
	
	Socket s = null; 
	BufferedReader in = null;
	PrintWriter out = null;
	private JTextField textField_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatClient_kakao window = new ChatClient_kakao();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ChatClient_kakao() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 400, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 240, 245));
		frame.getContentPane().add(panel, "name_1321241016566500");
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(92, 477, 29, 15);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(113, 474, 116, 21);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton login = new JButton("로그인");
		login.setBorderPainted(false);
		login.setBackground(new Color(65, 105, 225));
		login.setBounds(241, 473, 97, 23);
		panel.add(login);
		
		ImageIcon img = new ImageIcon("src/images/kakao.png");
		JButton btnNewButton_1 = new JButton(img);
		
		btnNewButton_1.setBorderPainted(false);
//		setPreferredSize(new Dimension(300, 50)); // 버튼 크기지정
		btnNewButton_1.setBounds(45, 90, 293, 287);
		panel.add(btnNewButton_1);
		
		JPanel panel2 = new JPanel();
		frame.getContentPane().add(panel2, "chat");
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
		
		cardlayout = new CardLayout();
		frame.getContentPane().setLayout(cardlayout);
		frame.getContentPane().add("1", panel);
		frame.getContentPane().add("2", panel2);
		
		login.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardlayout.show(frame.getContentPane(), "2");
				// cardlayout.next(frame.getContentPane());
			}
		});
		
	}
}
