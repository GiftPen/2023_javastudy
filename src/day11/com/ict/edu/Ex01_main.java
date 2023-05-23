package day11.com.ict.edu;

public class Ex01_main {
	public static void main(String[] args) {
		// static 객체 생성과 상관없이 호출 가능
		// static 호출 방법 : 클래스이름.변수, 클래스이름.메서드
		System.out.println(Ex01_method.ki);
		Ex01_method.getAvg();
		
		System.out.println(Ex01_method.ki);
		
		System.out.println("====================");
		
		Ex01_method t1 = new Ex01_method();  //생성자 없으면 기본생성자
	
		// 인스턴스 호출 방법  / 참조변수.변수,  참조변수.메서드
		String n = t1.name ;
		
		// void는 호출한곳으로 아무것도 가져오지 않는다.
		// 저장할께 없어서 변수 쓸필요가 없다
		t1.getTotal();
//		t1.getTotal2();
//		int k2 =  t1.total;
//		System.out.println(k2);
		// total 값이 변경 된 것을 확인
		
		int k1 =  t1.total;
		
		System.out.println(n);
		System.out.println(k1);
		System.out.println("===================");
		
		double  k2 = Ex01_method.getAvg2();
		System.out.println(k2);
		System.out.println(Ex01_method.ki);
		
		// 스택틱은 별도의 공간에 따로 만들어지기때문에 다시 새롭게 호출해도 값이
		// 초기화 되지 않는다
		
		
	}

}
