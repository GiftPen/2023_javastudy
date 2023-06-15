//package network.com.ict.edu6.copy;
//
//import java.awt.CardLayout;
//import java.awt.EventQueue;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.WindowAdapter;
//import java.awt.event.WindowEvent;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
//import java.net.Socket;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JOptionPane;
//import javax.swing.JPanel;
//import javax.swing.JScrollPane;
//import javax.swing.JTextArea;
//import javax.swing.JTextField;
//
//public class ChatClient extends JFrame implements Runnable {
//	
//	
//	
//	CardLayout cardLayout;
//	JPanel pg1 ;;
//
//	// 접속
//	Socket s = null;
//	ObjectOutputStream out = null;
//	ObjectInputStream in = null;
//
//	public ChatClient() {
//		super("멀티캐스팅 ver 0.2");
//		cardLayout = new CardLayout();
//		setBounds(100, 100, 380, 520);
//		pg1 = new JPanel();
//		cardLayout = new CardLayout();
//		pg1.setLayout(cardLayout);
//		
//		ChatClient_kakao login = new ChatClient_kakao(cardLayout, pg1);
//		ChatClient_kakao2 join = new ChatClient_kakao2(cardLayout, pg1);
//		
//		pg1.add("login", login);  //(호출이름,panel)
//		pg1.add("join",join);
//		
//		add(pg1);
//		
//		setSize(440,600);
//		setLocationRelativeTo(null);
//		setVisible(true);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		
//		
//		
//		
//		
//		login.login.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// cardLayout.show(contentPane, "chat");
//				// 사용자 닉네임 받기
//				String name = login.textField.getText().trim();
//				if (name.length() > 0) {
//
//					// 서버 접속
//					if (connected()) {
//						try {
//							cardLayout.show(pg1, "chat");
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
//					login.textField.setText("");
//					login.textField.requestFocus();
//				}
//			}
//		});
//
//		// 창 종료 했을때
//		addWindowListener(new WindowAdapter() {
//			@Override
//			public void windowClosing(WindowEvent e) {
//				if (s != null) {
//					try {
//						Protocol p = new Protocol();
//						p.setCmd(0);
//						out.writeObject(p);
//					} catch (IOException e1) {
//						// TODO Auto-generated catch block
//						e1.printStackTrace();
//					}
//				} else {
//					closed();
//				}
//			}
//		});
//
//		input_tf.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				sendMessage();
//			}
//		});
//		send_bt.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				sendMessage();
//			}
//		});
//
//	}
//
//	private void sendMessage() {
//		String msg = input_tf.getText().trim();
//		if (msg.length() > 0) {
//			try {
//				// 메세지 보내기
//				Protocol p = new Protocol();
//				p.setCmd(2);
//				p.setMsg(msg);
//				out.writeObject(p);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			;
//		}
//		input_tf.setText("");
//		input_tf.requestFocus();
//	}
//
//	private boolean connected() {
//		boolean value = true;
//		try {
//			s = new Socket("192.168.0.81", 7778);
//			out = new ObjectOutputStream(s.getOutputStream());
//			in = new ObjectInputStream(s.getInputStream());
//			new Thread(this).start();
//
//			return value;
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		return false;
//	}
//
//	private void closed() {
//		try {
//			out.close();
//			in.close();
//			s.close();
//			System.exit(0);
//		} catch (Exception e) {
//		}
//	}
//
//	// 받기
//	@Override
//	public void run() {
//		esc: while (true) {
//			try {
//				Object obj = in.readObject();
//				if (obj != null) {
//					Protocol p = (Protocol) obj;
//					switch (p.getCmd()) {
//					case 0: // 종료
//						break esc;
//
//					case 2: // 메세지
//						jta.append(p.getMsg() + "\n");
//						jta.setCaretPosition(jta.getText().length());
//						break;
//					}
//				}
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//		}
//		closed();
//	}
//
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//
//			@Override
//			public void run() {
//				ChatClient cc = new ChatClient();
//				cc.setVisible(true);
//			}
//		});
//	}
//
//}
