package day19.com.ict.edu;

public class Ex02_Main {
	public static void main(String[] args) {
		System.out.println("main : " + Thread.currentThread().getName());
		
		Ex02_Dog dog = new Ex02_Dog();
		Ex02_Cat cat = new Ex02_Cat();
		
		// 멀티스레드 : 여러개의 스레드를 만들어서 병렬 처리
		// 스레드만드는 방법 : start()를 호출해서 run()로 가면 스레드 생성(일꾼생성)
		dog.start();
		cat.start();  // cat 클래스에 스타스 메서드가 있다면 그냥 메서드 호출한것으로 실행한것 이기 때문에 스레드 처리가 되지 않는다.
		System.out.println("main : " + Thread.currentThread().getName());
	}
}
