package day10.com.ict.edu;

public class Ex02_main {
	public static void main(String[] args) {
		//호출 방법 : 클래스이름.멤버필드
		// static 이기 떄문에 객체 생성 없이  클래스이름.변수이름
		System.out.println(Ex02_class.AVG);
		System.out.println(Ex02_class.sum);
		System.out.println("==========");
		
		
		// instance는 객체 생성 후 접근
		//생성자가 없으면 객체를 생성할 때 기본 생성자를 호출 한다.
		//인자가 없는 생성자를 '기본 생성자'라고 한다.
		// 객체 생성)
		// 클래스이름 참조변수 = new 생성자([인자]);
		// ** 해당 클래스의 생성자가 없으면 기본생성자 사용
		// ** 기본 생성자란 인자가 없는 생성자, 클래스이름() = 기본생성자()
		Ex02_class test = new Ex02_class() ; // 인자가 없는 생성자 -> ()
		System.out.println(test);
		// 접근법 : 참조변수.멤버필드
		System.out.println(test.name);
		System.out.println(test.GENDER);
		System.out.println(test.AVG);  // 둘다 맞지만 스택틱 들은 위로 접근 해주는게 좋다
		System.out.println(test.sum);  //
		
		System.out.println("==========");
		//변수와 상수의 차이점
		test.name = "일지매" ;
		// 상수라서 변경 못함
		//test.GENDER = "여성" ;  // 상수의 값을 변경 할려고 하면 오류가남
		
		Ex02_class.sum = 1000 ;
		// 상수라서 변경 못함
		//Ex02_class.AVG = 12345 ;// 상수의 값을 변경 할려고 하면 오류가남, final
		
		System.out.println(test.name);
		System.out.println(Ex02_class.sum);
		
		
		
		
		

	}
}
