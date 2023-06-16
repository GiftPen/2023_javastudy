package network.com.ict.edu7.copy;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Builder_check extends JFrame{
	

	private JTextField nickname_tf;
	private JPanel  login_p ;
	JLabel image ;
	JButton login_bt;

	
	public Builder_check() {
		super("테스트");
		
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
		
		add(login_p);
		
		
		
		
		setSize(450, 650);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new Builder_check();
	}
}
