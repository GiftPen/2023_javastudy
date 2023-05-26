package day23.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex02_Paint extends JFrame{
	// 다른 클래스에서는 내부 클래스를 별도로 생성할 수 없다.
	// 내부클래스를 포함하고 있는 클래스에서는 내부클래스를 생성할 수 있다.
	CanvasTest canvas = new CanvasTest();
	JPanel jp ;
	JButton jb1, jb2, jb3, jb4, jb5, jb6, jb7;
	String[] items = {"5","10","15","20","25","30"};
	JComboBox<String> jcom ;
	Color color ;
	int x = -5, y = -5, wh = 5 ;
	
	public Ex02_Paint() {
		super("그림판 ver0.01");
		
		jp = new JPanel() ;
		jb1 = new JButton(" ") ;
		// 버튼자체의 배경색
		jb1.setBackground(color.red);
		jb2 = new JButton(" ") ;
		jb2.setBackground(color.GREEN);
		jb3 = new JButton(" ") ;
		jb3.setBackground(color.BLUE);
		jb4 = new JButton(" ") ;
		jb4.setBackground(color.CYAN);
		jb5 = new JButton(" ") ;
		jb5.setBackground(color.MAGENTA);
		jb6 = new JButton(" ") ;
		jb6.setBackground(color.YELLOW);
		jcom = new JComboBox<String>(items);
		jb7 = new JButton("clear") ;
		
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		jp.add(jb5);
		jp.add(jb6);
		jp.add(jcom);
		jp.add(jb7);
		
		
		add(jp, BorderLayout.NORTH);
		add(canvas, BorderLayout.CENTER);
		
		
		
		setSize(600,600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				color = color.red ;
			}
		});
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				color = color.green ;
			}
		});
		jb3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				color = color.BLUE ;
			}
		});
		jb4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				color = color.CYAN ;
			}
		});
		jb5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				color = color.MAGENTA;
			}
		});
		jb6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				color = color.YELLOW;
			}
		});
		
		jcom.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == e.SELECTED) {
					switch ((String)e.getItem()) {
					case "5": wh = 5 ; break;
					case "10": wh = 10 ; break;
					case "15": wh = 15 ; break;
					case "20": wh = 20 ; break;
					case "25": wh = 25 ; break;
					case "30": wh = 30 ; break;
					}
				}
			}
		});
		
		jb7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				x = -5 ;
				y = -5 ;
				wh = 5 ;
				jcom.setSelectedIndex(0);
				// 삭제
				canvas.removeNotify();
				// 다시작동하려면
				canvas.addNotify();
			}
		});
		
		canvas.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				x = e.getX();
				y = e.getY();
				canvas.repaint();
			}
		});
		
		
		
	}
	// 내부클래스
	private class CanvasTest extends Canvas{
		@Override
		public void paint(Graphics g) {
			g.setColor(color);
			g.fillOval(x, y, wh, wh);
		}
		
		@Override
		public void update(Graphics g) {
			paint(g) ;
		}
		
	}
	
	public static void main(String[] args) {
		new Ex02_Paint();
	}
}
