//package network.com.ict.edu6.copy;
//
//import java.awt.EventQueue;
//import java.awt.Font;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
//import java.io.PrintWriter;
//import java.net.Socket;
//
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.JScrollPane;
//import javax.swing.JTextArea;
//
//import java.awt.BorderLayout;
//import java.awt.CardLayout;
//import java.awt.Color;
//import javax.swing.JLabel;
//import javax.swing.JOptionPane;
//import javax.swing.JTextField;
//import javax.swing.ScrollPaneConstants;
//import javax.swing.ImageIcon;
//import javax.swing.JButton;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;
//
//public class ChatClient_kakao extends JPanel{
//	
//	 JPanel JPanel;
//	 JTextField textField;
//	JScrollPane jsp;
//	
//	Socket s = null;
//	ObjectOutputStream out = null;
//	ObjectInputStream in = null;
//	private JTextField textField_1;
//	CardLayout cardLayout;
//	JPanel pg1;
//	private JButton login;
//	/**
//	 * Launch the application.
//	 */
//	
//
//
//	/**
//	 * Create the application.
//	 */
//	public ChatClient_kakao(CardLayout cardLayout, JPanel pg1) {
//
//		JPanel panel1 = new JPanel();
//		panel1.setSize(440,600);
//		panel1.setBackground(new Color(255, 240, 245));
//		panel1.setLayout(null);
//		
//		JLabel lblNewLabel = new JLabel("ID");
//		lblNewLabel.setBounds(92, 477, 29, 15);
//		panel1.add(lblNewLabel);
//		
//		textField = new JTextField();
//		textField.setBounds(113, 474, 116, 21);
//		panel1.add(textField);
//		textField.setColumns(10);
//		
//		login = new JButton("로그인");
//		login.setBorderPainted(false);
//		login.setBackground(new Color(65, 105, 225));
//		login.setBounds(241, 473, 97, 23);
//		panel1.add(login);
//		
//		ImageIcon img = new ImageIcon("src/images/kakao.png");
//		JButton btnNewButton_1 = new JButton(img);
//		
//		btnNewButton_1.setBorderPainted(false);
////		setPreferredSize(new Dimension(300, 50)); // 버튼 크기지정
//		btnNewButton_1.setBounds(45, 90, 293, 287);
//		panel1.add(btnNewButton_1);
//		
//		add(panel1);
//		
////		cardlayout = new CardLayout();
////		frame.getContentPane().setLayout(cardlayout);
////		frame.getContentPane().add("1", panel);
////		frame.getContentPane().add("2", panel2);
//		login.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// cardLayout.show(contentPane, "chat");
//				// 사용자 닉네임 받기
//				String name = textField.getText().trim();
//				if (name.length() > 0) {
//					
//					// 서버 접속
//					if (connected()) {
//						try {
//							cardLayout.show(pg1, "join");
//							// 닉네임 보내기
//							Protocol p = new Protocol();
//							p.setCmd(1);
//							p.setMsg(name);
//							out.writeObject(p);
//						} catch (IOException e1) {
//							// TODO Auto-generated catch block
//							e1.printStackTrace();
//						}
//					}
//				} else {
//					JOptionPane.showMessageDialog(getParent(), "닉네임 입력하세요");
//					textField.setText("");
//					textField.requestFocus();
//				}
//			}
//		});
//	     }
//	
//
//	}
//
//		
//	