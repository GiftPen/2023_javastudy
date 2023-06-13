package mybatis.com.ict.edu.copy;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import mybatis.com.ict.edu.DAO;
import mybatis.com.ict.edu.Ex01;
import mybatis.com.ict.edu.VO;

public class Ex02_Main extends JFrame {
	JPanel jp1, jp2, jp3, jp4, jp5, jp6;
	JTextField jtf1, jtf2, jtf3, jtf4;
	JButton jb0,jb1, jb2, jb3, jb4, jb5, jb6;
	JTextArea jta;
	JScrollPane jsp;

	public Ex02_Main() {
		super("DB 연동 정보");
		jp1 = new JPanel(new GridLayout(0, 2));
		jp2 = new JPanel(new GridLayout(0, 2));
		jp3 = new JPanel(new GridLayout(0, 2));
		jp4 = new JPanel(new GridLayout(0, 2));
		jp5 = new JPanel(new GridLayout(4, 0));
		jp6 = new JPanel();

		jtf1 = new JTextField();
		jtf2 = new JTextField();
		jtf3 = new JTextField();
		jtf4 = new JTextField();
		
		jb0 = new JButton("초기화");
		jb1 = new JButton("전체보기");
		jb2 = new JButton("삽입");
		jb3 = new JButton("삭제");
		jb4 = new JButton("검색");
		jb5 = new JButton(" 불러오기 ");
		jb6 = new JButton(" 고치기 ");

		jp1.add(new JLabel("CUSTID  :  ", JLabel.CENTER));
		jp1.add(jtf1);

		jp2.add(new JLabel("NAME  :  ", JLabel.CENTER));
		jp2.add(jtf2);

		jp3.add(new JLabel("ADDRESS  :  ", JLabel.CENTER));
		jp3.add(jtf3);

		jp4.add(new JLabel("PHONE  :  ", JLabel.CENTER));
		jp4.add(jtf4);

		jp5.add(jp1);
		jp5.add(jp2);
		jp5.add(jp3);
		jp5.add(jp4);
		jp5.add(jb5);
		jp5.add(jb6);

		jta = new JTextArea();
		jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jta.setLineWrap(true);
		jta.setEditable(false);

		jp6.add(jb0);
		jp6.add(jb1);
		jp6.add(jb2);
		jp6.add(jb3);
		jp6.add(jb4);
		jp6.add(jb5);
		jp6.add(jb6);

		add(jp5, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		add(jp6, BorderLayout.SOUTH);

		setSize(650, 500);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		jta.setFont(new Font("굴림", Font.PLAIN, 15));
		
		jb2.setEnabled(false);
		jb6.setEnabled(false);
		jb0.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jta.setText("");
				jtf1.setEditable(true);
				jb2.setEnabled(false);
				jtf1.setText("");
				jtf2.setText("");
				jtf3.setText("");
				jtf4.setText("");
				jb6.setEnabled(false);
			}
		});

		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jta.setText("");
				List<VO> list = DAO.getList();
				prn(list);
				jb2.setEnabled(true);
				jtf1.setEditable(false);
			}
		});

		jb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jta.setText("");
				String name = jtf2.getText().trim();
				String address = jtf3.getText().trim();
				String phone = jtf4.getText().trim();
				VO vo2 = new VO();
				vo2.setName(name);
				vo2.setAddress(address);
				vo2.setPhone(phone);
				int result = DAO.getInsert(vo2);
				if(result>0) {
					List<VO> list = DAO.getList();
					prn(list);
					
					jtf1.setText("");
					jtf2.setText("");
					jtf3.setText("");
					jtf4.setText("");
					jtf1.setEditable(true);
					jb2.setEnabled(false);
				}
			}
		});

		jb3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jta.setText("");
				String custid2 = jtf1.getText();
				VO vo3 = new VO();
				vo3.setCustid(custid2);
				int result2 = DAO.getDelete(vo3);
				if(result2>0) {
					List<VO> list = DAO.getList();
					prn(list);
					jtf1.setText("");
					jtf2.setText("");
					jtf3.setText("");
					jtf4.setText("");
				}
			}
		});
		jb4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jta.setText("");
				String custid = jtf1.getText();
				VO vo = DAO.getOne(custid);
				prn2(vo);
			}
		});
		
		jb5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jta.setText("");
				String custid = jtf1.getText();
				VO vo = DAO.getOne(custid);
				prn3(vo);
				jb6.setEnabled(true);
				jtf1.setText("");
				jtf1.setEditable(false);
				jb5.setEnabled(false);
			}
		});
		
		jb6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jta.setText("");
				List<VO> list = DAO.getList();
				prn(list);
				jb6.setEnabled(false);
				jb5.setEnabled(true);
			}
		});
	}

	public void prn(List<VO> List) {
		jta.append("번호\t이름\t주소\t\t전화번호\n");
		for (VO k : List) {
			jta.append(k.getCustid() + "\t");
			jta.append(k.getName() + "\t");
			jta.append(k.getAddress() + "\t");
			jta.append(k.getPhone() + "\n");
		}
	}

	public void prn2(VO vo) {
		jta.append("번호\t이름\t주소\t\t전화번호\n");
		jta.append(vo.getCustid() + "\t");
		jta.append(vo.getName() + "\t");
		jta.append(vo.getAddress() + "\t");
		jta.append(vo.getPhone() + "\n");

	}
	public void prn3(VO vo) {
	
		jtf2.setText(vo.getName());
		jtf3.setText(vo.getAddress());
		jtf4.setText(vo.getPhone());

	}

	public static void main(String[] args) {
		new Ex02_Main();
	}
}
