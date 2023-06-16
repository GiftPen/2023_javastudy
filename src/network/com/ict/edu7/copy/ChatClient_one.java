package network.com.ict.edu7.copy;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Icon;

public class ChatClient_one {

	
	private JTextField nickname_tf;
	private JPanel  login_p ;
	JLabel image ;
	JButton login_bt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatClient_one window = new ChatClient_one();
					window.login_p.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ChatClient_one() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		login_p = new JPanel();
		login_p.setBounds(100, 100, 450, 650);
		login_p.setLayout(null);
		
		
		JButton login_bt = new JButton("접속하기");
		login_bt.setBounds(281, 574, 116, 23);
		login_p.add(login_bt);
		
		nickname_tf = new JTextField();
		nickname_tf.setBounds(281, 543, 116, 21);
		login_p.add(nickname_tf);
		nickname_tf.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("아이디 입력");
		lblNewLabel.setBounds(292, 518, 97, 15);
		login_p.add(lblNewLabel);
		
		ImageIcon img = new ImageIcon("src/images/chat.PNG");
	
		image = new JLabel(img);
		image.setBounds(59, 63,331, 375);
		login_p.add(image);
		
	
		
	}
}
