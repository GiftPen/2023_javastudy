package network.com.ict.edu7.copy;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class Builder_cardLayout_check {

	private JFrame frame;
	private JTextField login_tf;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Builder_cardLayout_check window = new Builder_cardLayout_check();
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
	public Builder_cardLayout_check() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 618);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel one = new JPanel();
		frame.getContentPane().add(one, "one");
		one.setLayout(null);
		
		JLabel image = new JLabel("");
		image.setIcon(new ImageIcon("D:\\KJH\\javastudy\\javastudy\\src\\images\\chat.PNG"));
		image.setBounds(97, 80, 293, 314);
		one.add(image);
		
		JLabel login_id = new JLabel("아이디:");
		login_id.setBounds(125, 500, 72, 30);
		one.add(login_id);
		
		login_tf = new JTextField();
		login_tf.setBounds(182, 505, 116, 21);
		one.add(login_tf);
		login_tf.setColumns(10);
		
		JButton join_bt = new JButton("접속하기");
		join_bt.setBounds(310, 504, 97, 23);
		one.add(join_bt);
	
		
		JPanel two = new JPanel();
		frame.getContentPane().add(two, "two");
		two.setLayout(null);
		
		JList list = new JList();
		list.setBounds(281, 36, 141, 417);
		two.add(list);
		
		JLabel wait_list = new JLabel("[대기자]");
		wait_list.setBounds(285, 10, 87, 34);
		two.add(wait_list);
		
		JButton message = new JButton("쪽지보내기");
		message.setBounds(281, 452, 141, 28);
		two.add(message);
		
		JButton join = new JButton("방 참여");
		join.setBounds(281, 480, 141, 28);
		two.add(join);
		
		JButton create_room = new JButton("방 만들기");
		create_room.setBounds(281, 508, 141, 28);
		two.add(create_room);
		
		JButton exit_bt = new JButton("종료");
		exit_bt.setBounds(281, 535, 141, 28);
		two.add(exit_bt);
		
		JList list_1 = new JList();
		list_1.setBounds(12, 36, 261, 527);
		two.add(list_1);
		
		JLabel room_name = new JLabel("[방이름]");
		room_name.setBounds(12, 10, 87, 34);
		two.add(room_name);
	
		
		JPanel three = new JPanel();
		frame.getContentPane().add(three, "three");
		three.setLayout(null);
		
		JList list_2 = new JList();
		list_2.setBounds(281, 36, 141, 497);
		three.add(list_2);
		
		JLabel lblNewLabel = new JLabel("[참여자]");
		lblNewLabel.setBounds(285, 10, 87, 34);
		three.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(12, 543, 227, 26);
		three.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("보내기");
		btnNewButton.setBounds(240, 543, 79, 25);
		three.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("방 나가기");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(321, 544, 101, 25);
		three.add(btnNewButton_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 27, 247, 506);
		three.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setColumnHeaderView(textArea);
	
		
//		join_bt.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				String name = login_tf.getText().trim();
//				if(name.length() > 0) {
//					// 서버 접속
//					if(connected()) {
//						try {
//						// 닉네임 보내기
//						Protocol p = new Protocol();
//						p.setCmd(2);
//						p.setMsg(name);
//						out.writeObject(p);
//						out.flush();
//						cardLayout.show(, "one");
//						} catch (Exception e2) {
//						}
//					}
//				}else {
//					JOptionPane.showMessageDialog(getParent(), "닉네임 입력하세요");
//					nickname_tf.setText("");
//					nickname_tf.requestFocus();
//				}
//			}
//			}
//		});
	}
}
