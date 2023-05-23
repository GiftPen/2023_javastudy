package day06.com.ict.edu2;

import java.util.Scanner;

public class Ex01_Scanner {
	public static void main(String[] args) {
		// Scanner 클래스 : 키보드에 입력된 정보를 받아서 처리하는 클래스
		// System.out => 표준 출력장치 (모니터)
		// System.in => 표준 입력장치 (키보드)
		// 회사에서 제공하는 클래스를 사용하기 위해서 import 를 해야 한다.
		
		// java.lang 패키지안에 존재하는 클래스는 아무런 제약없이 사용가능(import 안함)
		// java.lang 패키지 외에 존재하는 클래스는 무조건 import를 해야 된다.
		
		// import 방법)  1. 클래스이름 뒤에서 ctrl + space
		//			    2. ctrl + shift + O 
		
		//해당 클래스 뒤에 커서를 뒤에 놓고 shift + f2 => 해당 클래스 API 설명서가 나타난다.
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.print("이름 : ");
		// .next();  입력한 내용을 String 으로 처리하는 메서드
		String name = scan.next();
		System.out.println("받은 내용 : " + name);
		
		System.out.print("나이 : ");
		// .next();  입력한 내용을 String 으로 처리하는 메서드
		String age = scan.next();
		System.out.println("받은 내용 : " + (age + 1));
		
		System.out.print("나이 : ");
		// .nextInt();  입력한 내용을 int 로 처리하는 메서드
		int age2 = scan.nextInt();
		System.out.println("받은 내용 : " + (age2 + 1));   
		// 절대 띄어 쓰기하면안됨 next와 nextline 의 메서드 조사해오기
		// 둘다 스트링 만들기인데 띄어 쓰기 차이가 있다 조사해보자
		// nextInt의 값에 int값이 아닌 문자를 집어 넣으면 오류가 난다.
		
		System.out.print("키 : ");
		// .nextDouble() : 입력한 내용을 double 으로 처리하는 메서드(문자를 입력하면 오류)
		double ke = scan.nextDouble();
		System.out.println("받은 내용 : " + ke); 
		
		System.out.println("당신은 남성입니까?(true/false)");
		// .nextBoolean() : 입력한 내용을 boolean 으로 처리하는 메서드(숫자 및 다른 문자 입력하면 오류)
		boolean gender = scan.nextBoolean();
		System.out.println("받은 내용 : " + gender);
		if(gender) {
			System.out.println("당신은 남성입니다.");
		}else {
			System.out.println("당신은 여성입니다.");
		}
		
		// nextChar()는 존재하지 않는다. 그러므로 char 은 사용 불가
	}

}
