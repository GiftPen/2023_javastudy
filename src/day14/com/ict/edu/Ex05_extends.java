package day14.com.ict.edu;

import java.util.Random;

public class Ex05_extends extends Random {
	int su = nextInt();
	public void play() {
		System.out.println(su);
	}
	// 상속이라 그냥 갖다가 씀
	// main메서드도 static이라 static 변수만 사용 가능
	public static void main(String[] args) {
		// play();
		// System.out.println(su);
		
		// 자기자신이라고 객체를 만든다
		Ex05_extends test = new Ex05_extends();
		test.play();
		
	}
	
	
}
