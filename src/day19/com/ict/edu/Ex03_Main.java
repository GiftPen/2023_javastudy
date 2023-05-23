package day19.com.ict.edu;

public class Ex03_Main {
	public static void main(String[] args) {
		System.out.println("main : " + Thread.currentThread().getName());
		Ex03_Cat cat = new Ex03_Cat();
		Ex03_Dog dog = new Ex03_Dog();
		
		
		//cat.start();
		// Runnable은 start 메서드를 가지고 있지않아서 사용불가
		
		Thread thread = new Thread(dog); // 생성할때 dog을 집어 넣어서
		thread.start(); //  스레드 스타트로 가고  dog의 런으로 이동한다
		
		//Thread thread2 = new Thread(cat);
		//thread2.start();
		
		// 다른방법
		// 익명  -> 1회용
		new Thread(cat).start();
		
		// 다른방법
		// 익명 : new 클래스(인터페이스 i);
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while (true) {
					System.out.println("AAAAAAAAA" + Thread.currentThread().getName());
				}
			}
		}).start();   // 끝나고 스타트
		
		System.out.println("main : " + Thread.currentThread().getName());
		
	}
}
