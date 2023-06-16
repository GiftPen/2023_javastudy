package network.com.ict.edu7.copy;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class ChatClient extends JFrame implements Runnable{
	
	
	CardLayout cardLayout ;
	JPanel pg ;
	ChatClient_one1 one ;
	ChatClient_two two ;
	ChatClient_three three ;
	
	// 접속
	Socket s = null;
	ObjectOutputStream out = null;
	ObjectInputStream in = null;
	
	public ChatClient() {
		super("멀티 채팅");
		cardLayout = new CardLayout();
		pg = new JPanel();
		pg.setBorder(new EmptyBorder(10, 10, 10, 10));
		pg.setLayout(cardLayout);
		
		
		
		pg.add(one,"login");
		pg.add(two,"wait");
		pg.add(three,"chat");
		
		// 첫카드를 지정
		cardLayout.show(pg, "login");
		
		add(pg);
		setSize(450,650);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		
		// 이벤트처리
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				if(s != null) {// 접속된 상태
					Protocol p = new Protocol();
					p.setCmd(0);
					try {
						out.writeObject(p);
						out.flush();
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}else {
					closed();
				}
			}
		});
		
		// 입장하기
		login_bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = nickname_tf.getText().trim();
				if(name.length() > 0) {
					// 서버 접속
					if(connected()) {
						try {
						// 닉네임 보내기
						Protocol p = new Protocol();
						p.setCmd(2);
						p.setMsg(name);
						out.writeObject(p);
						out.flush();
						cardLayout.show(pg, "wait");
						} catch (Exception e2) {
						}
					}
				}else {
					JOptionPane.showMessageDialog(getParent(), "닉네임 입력하세요");
					nickname_tf.setText("");
					nickname_tf.requestFocus();
				}
			}
		});
		
		exit_bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Protocol p = new Protocol();
					p.setCmd(0);
					out.writeObject(p);
					out.flush();
				} catch (Exception e2) {
				}
			}
		});
		
		memo_bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					String msg = JOptionPane.showInputDialog("내용을 입력하세요");
					if(msg.length() <= 0 || msg == null) {
						JOptionPane.showMessageDialog(getParent(), "내용을 입력하세요");
					}else {
						Protocol p =new Protocol();
						p.setCmd(6);
						p.setMsg(msg);
						// 대기실 리스트에서 특정 사람 선택
						p.setC_index(user_list.getSelectedIndex());
						out.writeObject(p);
						out.flush();
						
					}
				} catch (Exception e2) {
				}
			}
		});
		
		
		mkRoom_bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 사용자에게 방 제목을 받자
				String name = JOptionPane.showInputDialog(getParent(),"방 제목을 입력하세요");
				if(name.length() <= 0 || name == null) {
					JOptionPane.showMessageDialog(getParent(), "방 제목을 입력하세요");
				}else {
					try {
						Protocol p = new Protocol();
						p.setCmd(3);
						p.setMsg(name);
						
						out.writeObject(p);
						out.flush();
						cardLayout.show(pg, "chat");
					} catch (Exception e2) {
					}
				}
			}
		});
		
		join_bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int r_index = room_list.getSelectedIndex();
				if(r_index >= 0) {
					try {
						Protocol p =new Protocol();
						p.setCmd(4);
						p.setR_index(r_index);
						out.writeObject(p);
						out.flush();
						cardLayout.show(pg, "chat");
					} catch (Exception e2) {
					}
				}
			}
		});
		
		send_bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				sendMessage();
			}
		});
		msg_tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				sendMessage();
			}
		});
		// 방 나가기
		out_bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					jta.setText("");
					Protocol p = new Protocol();
					p.setCmd(5);
					out.writeObject(p);
					out.flush();
					cardLayout.show(pg, "wait");
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		});
		
	}
	
	
	private boolean connected() {
		boolean value = true ;
		try {
			s = new Socket("192.168.0.81", 7779);
			out = new ObjectOutputStream(s.getOutputStream());
			in = new ObjectInputStream(s.getInputStream());
			new Thread(this).start();
			return value;
		} catch (Exception e) {

		}
		return false;
	}
	private void closed() {
		try {
			out.close();
			in.close();
			s.close();
			System.exit(0);
		} catch (Exception e) {
		}
	}
	
	private void sendMessage() {
		try {
			String msg = msg_tf.getText().trim();
			if(msg.length() > 0) {
				Protocol p = new Protocol();
				p.setCmd(1);
				p.setMsg(msg);
				out.writeObject(p);
				out.flush();
				msg_tf.setText("");
				msg_tf.requestFocus();
			}
		} catch (Exception e) {
		}
	}
	@Override
	public void run() {
		esc:
			while(true) {
				try {
					Object obj = in.readObject();
					if(obj != null) {
						Protocol p = (Protocol)obj;
						switch (p.getCmd()) {
						case 0 : // 종료 
							break esc;
						case 1 : // 메세지 전달
							jta.append(p.getMsg() + "\n");
							jta.setCaretPosition(jta.getText().length());// 글자가 추가된 만큼 화면이 올라감
							break ;
						case 2 : // 접속 및 갱신
							// 대기자 명단
							user_list.setListData(p.getNames());
							// 방목록
							room_list.setListData(p.getRooms());
							break ;
						case 4 : // 방 참여
							join_list.setListData(p.getNames());
							jta.append(p.getMsg()+"\n");
							break ;
						case 6 : // 쪽지보내기
							JOptionPane.showMessageDialog(getParent(), p.getMsg());
							break ;
						}
					}
				} catch (Exception e) {
				}
			}// 무한 루프 끝
		closed();
		System.exit(0);
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new ChatClient();
			}
		});
	}
}
