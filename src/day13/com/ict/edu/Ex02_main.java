package day13.com.ict.edu;

public class Ex02_main {
	public static void main(String[] args) {
		// 객체 생성전에 호출 가능
		System.out.println(Ex02_static.su2);
		
		// 객체 생성
		Ex02_static p1 = new Ex02_static();
		System.out.println(p1.su1); // 11
		System.out.println(p1.su2); // 11

		Ex02_static p2 = new Ex02_static();
		System.out.println(p2.su1); // 11
		System.out.println(p2.su2); // 12
		
		Ex02_static p3 = new Ex02_static();
		System.out.println(p3.su1); // 11
		System.out.println(p3.su2); // 13
		// static 의 공유 개념
		System.out.println(p1.su1); // 11
		System.out.println(p1.su2); // 13
	}
}
