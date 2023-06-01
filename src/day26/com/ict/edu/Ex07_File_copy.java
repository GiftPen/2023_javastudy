package day26.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ex07_File_copy extends JFrame{
	JPanel jp1, jp2 ;
	JLabel jlb1 , jlb2 ;
	JTextField jtf1 ,jtf2 ;
	JButton jb ;
	String in_path, out_path ;
	
	public Ex07_File_copy() {
		super("복사하기");
		
		jp1 = new JPanel();
		jp1.setLayout(new FlowLayout(FlowLayout.LEFT));
		jlb1 = new JLabel("원본위치 : ");
		jtf1 = new JTextField(15);
		
		jp1.add(jlb1);
		jp1.add(jtf1);
		
		jp2 = new JPanel();
		jlb2 = new JLabel("사본위치 : ");
		jtf2 = new JTextField(15);
		jb = new JButton("복사하기");
		
		jp2.add(jlb2);
		jp2.add(jtf2);
		jp2.add(jb);
		
		
		add(jp1, BorderLayout.NORTH);
		add(jp2, BorderLayout.CENTER);
		
		
		pack();
//		setSize(300, 100);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		jtf1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FileDialog fd = new FileDialog((Frame) getParent(), "불러오기", FileDialog.LOAD);
				fd.setVisible(true);
				String msg = fd.getDirectory() + fd.getFile();
				if (! msg.equals("nullnull")) {
					jtf1.setText(msg);
				}
			}
		});
		jtf2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FileDialog fd = new FileDialog((Frame) getParent(), "불러오기", FileDialog.LOAD);
				fd.setVisible(true);
				String msg = fd.getDirectory() ;
				if (! msg.equals("nullnull")) {
					jtf2.setText(msg);
				}
			}
		});
		
	}
	public static void main(String[] args) {
		new Ex07_File_copy();
	}
}
