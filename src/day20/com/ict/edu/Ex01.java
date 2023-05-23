package day20.com.ict.edu;

public class Ex01 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println("Run : " + Thread.currentThread().getName());
		}
		sound(); //     스레드 0이 찍힘
	}
	
	public void sound() {
		for (int i = 0; i < 20; i++) {
			System.out.println("sound : " + Thread.currentThread().getName());
		}
	}

}
