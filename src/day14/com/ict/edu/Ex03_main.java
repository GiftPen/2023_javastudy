package day14.com.ict.edu;

public class Ex03_main {
	public static void main(String[] args) {
		// 자식클래스를 객체로 만들면 부모클래스는 '먼저' 알아서 만들어진다.
		Ex03_Sub sub = new Ex03_Sub();
		System.out.println("메인에서호출 : " + sub);
		System.out.println();
		
		System.out.println(sub.name);
		System.out.println(sub.age);
		System.out.println(sub.addr);
		System.out.println("=======================");
		
		sub.play();
//		System.out.println(sub.name);
//		System.out.println(sub.age);
//		System.out.println(sub.addr);
		
		// private은  당연히 안돼 자기자신에서만 되서
		//System.out.println(sub.dog);
		//System.out.println(sub.cat);
		
		// static(접근 제한자가 우선순위가 높다)
		// static은 왠만해서 클래스. 으로 해주자
		System.out.println(Ex03_Sub.computer);
		System.out.println(Ex03_Super.playStation);
	}
}
