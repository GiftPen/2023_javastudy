package day28.com.ict.edu;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

// ObjectInputStream : 객체 입력 스트림
// readObject() : 객체 역직렬화 메서드    파일을 리스트로 만들어서 역으로 뿌림
public class Ex04_ObjectInputStream {
	public static void main(String[] args) {
		String pathname = "D:/KJH/object02.ser";
		File file = new File(pathname);
		
		FileInputStream fis = null ;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		try {
			
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
			
			// 역질렬화
			ArrayList<Ex04_VO> list = 
					(ArrayList<Ex04_VO>) ois.readObject() ;  // 보낸 자료형으로 받기
			
			for (Ex04_VO k : list) {
				System.out.print(k.getName() + "\t");
				System.out.print(k.getAge() + "\t");
				System.out.print(k.getAddr() + "\t");
				
				if (k.isGender()) {// 불린형 is 
					System.out.print("남성"+ "\t");  // 불린형 is 
				} else {
					System.out.print("여성"+ "\t");  
				}
				System.out.print(k.getHeight() + "\n");
			}
			
		} catch (Exception e) {
		}finally {
			try {
				ois.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {
			}
		}
		
	}
}
