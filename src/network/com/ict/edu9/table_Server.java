package network.com.ict.edu9;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

import network.com.ict.edu9_db.DAO;
import network.com.ict.edu9_db.VO;

public class table_Server implements Runnable{
	ServerSocket ss ;
	ObjectInputStream in ;
	ObjectOutputStream out ;
	Socket s ;
	public table_Server() {
		try {
			ss= new ServerSocket(7788);
			System.out.println("서버 대기중 ...." );
			
			new Thread(this).start();
			
		} catch (Exception e) {
		}
	}
	@Override
	public void run() {
		while (true) {
			try {
				s = ss.accept();
				in = new ObjectInputStream(s.getInputStream());
				out = new ObjectOutputStream(s.getOutputStream());
				Object obj = in.readObject();
				Protocol p = (Protocol) obj ;
				switch (p.getCmd()) {
				case 0:
					List<VO> list = DAO.getList();
					p.setList(list);
					out.writeObject(p);
					out.flush();
					break;
				case 1:
					
					List<VO> list1 = DAO.getList();
					p.setList(list1);
					out.writeObject(p);
					out.flush();
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;

				}
			} catch (Exception e) {
			}finally {
				try {
					s.close();
					out.close();
					in.close();
				} catch (Exception e2) {
				}
			}
		}
	}
	public static void main(String[] args) {
		new table_Server();
	}
}
