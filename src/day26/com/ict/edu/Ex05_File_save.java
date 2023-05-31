package day26.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class Ex05_File_save extends JFrame{
	JPanel jp;
	JTextArea jta;
	JTextField jtf;
	JScrollPane jsp;
	JButton jb1;
	public Ex05_File_save() {
		super("저장하기");
		
		jp = new JPanel();
		jb1 = new JButton("SAVE");
		jtf = new JTextField(20);
		
		jta = new JTextArea(20, 0);
		jta.setLineWrap(true);
		jta.setEditable(true);
		jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		jp.add(new JLabel("파일 경로 :"));
		jp.add(jtf);
		jp.add(jb1);
		
		
		add(jp, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		
		setSize(500,550);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				String pathname = jtf.getText() ;
				File file = new File(pathname);
				byte[] b = jta.getText().getBytes();
				FileOutputStream fos = null;
				BufferedOutputStream bos = null;
				
				try {
					file.createNewFile();
					fos = new FileOutputStream(file, true);
					bos = new BufferedOutputStream(fos);
					
					bos.write(b);
					bos.flush();
					
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}finally {
					try {
						bos.close();
						fos.close();
					} catch (Exception e2) {
						
					}
				}
				
			}
		});
		
	}
	public static void main(String[] args) {
		new Ex05_File_save();
	} 
}
