package jdbc.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Hw_06_02_2 extends JFrame {
	JPanel jp, jp0, jp1, jp2, jp3, jp4, jp5;
	JTextField custid, name, address, phone;
	JTextArea jta;
	JScrollPane jsp;
	JButton jb1, jb2, jb3, jb4, jb5, jb6;

	public Hw_06_02_2() {
		super("DB 연동 정보");

		jp1 = new JPanel();
		jp1.setLayout(new FlowLayout(FlowLayout.RIGHT));
		custid = new JTextField(20);
		jp1.add(new JLabel("CUSTID :                         "));
		jp1.add(custid);

		jp2 = new JPanel();
		jp2.setLayout(new FlowLayout(FlowLayout.RIGHT));
		name = new JTextField(20);
		jp2.add(new JLabel("NAME :                         "));
		jp2.add(name);

		jp3 = new JPanel();
		jp3.setLayout(new FlowLayout(FlowLayout.RIGHT));
		address = new JTextField(20);
		jp3.add(new JLabel("ADDRESS :                         "));
		jp3.add(address);

		jp4 = new JPanel();
		jp4.setLayout(new FlowLayout(FlowLayout.RIGHT));
		phone = new JTextField(20);
		jp4.add(new JLabel("PHONE :                         "));
		jp4.add(phone);

		jta = new JTextArea(20, 0);
		jta.setLineWrap(true);
		jta.setEditable(false);
		jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		jp5 = new JPanel();
		jb1 = new JButton(" 전체보기 ");
		jb2 = new JButton(" 삽입 ");
		jb3 = new JButton(" 삭제 ");
		jb4 = new JButton(" 검색 ");
		jb5 = new JButton(" 불러오기 ");
		jb6 = new JButton(" 고치기 ");
		jp5.add(jb1);
		jp5.add(jb2);
		jp5.add(jb3);
		jp5.add(jb4);
		jp5.add(jb5);
		jb6.setEnabled(false);
		jp5.add(jb6);

		jp = new JPanel();
		jp.setLayout(new BorderLayout());
		jp0 = new JPanel();
		jp0.setLayout(new BorderLayout());

		jp.add(jp1, BorderLayout.NORTH);
		jp.add(jp2, BorderLayout.CENTER);
		jp.add(jp3, BorderLayout.SOUTH);
		jp0.add(jp, BorderLayout.NORTH);
		jp0.add(jp4, BorderLayout.CENTER);

		add(jp0, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		add(jp5, BorderLayout.SOUTH);

		// pack();
		setSize(550, 450);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		jb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				Connection conn = null;
				PreparedStatement pstm = null;
				ResultSet rs = null;
				jta.setText("");
				int result = 0;
				try {

					String url = "jdbc:oracle:thin:@localhost:1521:xe";
					String user = "C##KIMJAEHOON";
					String password = "1111";
					Class.forName("oracle.jdbc.driver.OracleDriver");
					conn = DriverManager.getConnection(url, user, password);
					String sql = "select * from CUSTOMER ORDER BY custid ASC";
					pstm = conn.prepareStatement(sql);
					rs = pstm.executeQuery();
					while (rs.next()) {
						jta.append(rs.getString(1) + "\t");
						jta.append(rs.getString(2) + "\t");
						jta.append(rs.getString(3) + "\t");
						jta.append(rs.getString(4) + "\n");
						

					}

				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (SQLException e1) {
					e1.printStackTrace();
				} finally {
					try {
						rs.close();
						pstm.close();
						conn.close();
					} catch (Exception e2) {
					}
				}
			}
		});

		jb2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				Connection conn = null;
				PreparedStatement pstm = null;
				ResultSet rs = null;
				int result = 0;
				jta.setText("");
				try {

					String url = "jdbc:oracle:thin:@localhost:1521:xe";
					String user = "C##KIMJAEHOON";
					String password = "1111";
					Class.forName("oracle.jdbc.driver.OracleDriver");
					conn = DriverManager.getConnection(url, user, password);
					String sql = "insert into customer(custid,name,address,phone) values(?,?,?,?)";
					pstm = conn.prepareStatement(sql);
					pstm.setString(1, custid.getText());
					pstm.setString(2, name.getText());
					pstm.setString(3, address.getText());
					pstm.setString(4, phone.getText());
					result = pstm.executeUpdate();
					if (result > 0) {
						sql = "select * from customer ORDER BY custid ASC";
						pstm = conn.prepareStatement(sql);
						rs = pstm.executeQuery();
						while (rs.next()) {
							
							jta.append(rs.getString(1) + "\t");
							jta.append(rs.getString(2) + "\t");
							jta.append(rs.getString(3) + "\t");
							jta.append(rs.getString(4) + "\n");

						}
					}
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (SQLException e1) {
					e1.printStackTrace();
				} finally {
					try {
						rs.close();
						pstm.close();
						conn.close();
					} catch (Exception e2) {
					}
				}
			}
		});

		jb3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				Connection conn = null;
				PreparedStatement pstm = null;
				ResultSet rs = null;
				int result = 0;
				jta.setText("");
				try {

					String url = "jdbc:oracle:thin:@localhost:1521:xe";
					String user = "C##KIMJAEHOON";
					String password = "1111";
					Class.forName("oracle.jdbc.driver.OracleDriver");
					conn = DriverManager.getConnection(url, user, password);
					String sql = "delete from customer where custid = ?";
					// ? => 바인딩변수
					pstm = conn.prepareStatement(sql);
					pstm.setString(1, custid.getText());
					result = pstm.executeUpdate();

					if (result > 0) {
						sql = "select * from customer ORDER BY custid ASC";
						pstm = conn.prepareStatement(sql);
						rs = pstm.executeQuery();
						while (rs.next()) {
							
							jta.append(rs.getString(1) + "\t");
							jta.append(rs.getString(2) + "\t");
							jta.append(rs.getString(3) + "\t");
							jta.append(rs.getString(4) + "\n");
						}
					}

				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (SQLException e1) {
					e1.printStackTrace();
				} finally {
					try {
						rs.close();
						pstm.close();
						conn.close();
					} catch (Exception e2) {
					}
				}
			}
		});

		jb4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				Connection conn = null;
				PreparedStatement pstm = null;
				ResultSet rs = null;
				int result = 0;
				jta.setText("");
				try {

					String url = "jdbc:oracle:thin:@localhost:1521:xe";
					String user = "C##KIMJAEHOON";
					String password = "1111";
					Class.forName("oracle.jdbc.driver.OracleDriver");
					conn = DriverManager.getConnection(url, user, password);
					String sql = "select * from CUSTOMER WHERE custid = " + custid.getText();
					pstm = conn.prepareStatement(sql);
					rs = pstm.executeQuery();
					while (rs.next()) {
					
						jta.append(rs.getString(1) + "\t");
						jta.append(rs.getString(2) + "\t");
						jta.append(rs.getString(3) + "\t");
						jta.append(rs.getString(4) + "\n");

					}

				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (SQLException e1) {
					e1.printStackTrace();
				} finally {
					try {
						rs.close();
						pstm.close();
						conn.close();
					} catch (Exception e2) {
					}
				}
			}
		});

		jb5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				Connection conn = null;
				PreparedStatement pstm = null;
				ResultSet rs = null;
				int result = 0;
				jta.setText("");
				try {
					
					String url = "jdbc:oracle:thin:@localhost:1521:xe";
					String user = "C##KIMJAEHOON";
					String password = "1111";
					Class.forName("oracle.jdbc.driver.OracleDriver");
					conn = DriverManager.getConnection(url, user, password);
					String sql = "select * from CUSTOMER WHERE custid = " + custid.getText();
					pstm = conn.prepareStatement(sql);
					rs = pstm.executeQuery();
					while (rs.next()) {
						custid.setText(rs.getString(1));
						name.setText(rs.getString(2));
						address.setText(rs.getString(3));
						phone.setText(rs.getString(4));
					}

				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (SQLException e1) {
					e1.printStackTrace();
				} finally {
					try {
						rs.close();
						pstm.close();
						conn.close();
					} catch (Exception e2) {
					}
				}
			}
		});

	}

	public static void main(String[] args) {
		new Hw_06_02_2();
	}
}
