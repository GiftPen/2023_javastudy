package day15.com.ict.edu;

public class Animal { // 클래스 앞에 final 붙이면 상속자체가 안됀다.
	// 시험문제
	// final 변수 = 상수 => 데이터 변경방지
	// final 메서드 = 오버라이딩 방지 => 메서드 내용변경 방지
	// final 클래스 = 상속방지 => 자식클래스 생성금지
	int eyes = 2 ;
	String color = "그레이";
	
	public void sound() {
		System.out.println("울음소리");
	}
	public void hobby() {
		System.out.println("좋아하는 행동");
	}
	public final void sleep() {// 자식이 못고치게 하고 싶으면 final
			// 못고치는것 뿐이지 사용은 가능하다.
		System.out.println("8시간 이상 잠을 잔다.");
	}
}
